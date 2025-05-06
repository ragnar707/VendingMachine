import java.util.*;

public class VendingMachine {
   
    private Map<Integer, Prodotto> prodotti = new HashMap<>();

    public VendingMachine(){
        prodotti.put(1, new Prodotto("caffè", 1.10, 100));
        prodotti.put(2, new Prodotto("caffè macchiato", 1.20, 100));
        prodotti.put(3, new Prodotto("cappuccino", 1.30, 100));
        prodotti.put(4, new Prodotto("cioccolata calda", 1.50, 100));
        prodotti.put(5, new Prodotto("thè", 1.40, 100));
        prodotti.put(6, new Prodotto("fonzies", 1.30, 5));
        prodotti.put(7, new Prodotto("chipster", 1.00, 5));
        prodotti.put(8, new Prodotto("tacos", 1.10, 1));
        prodotti.put(9, new Prodotto("lays", 1.40, 2));
        prodotti.put(10, new Prodotto("wacko's", 1.00, 4));
        prodotti.put(11, new Prodotto("lion", 0.90, 3));
        prodotti.put(12, new Prodotto("snickers", 0.90, 2));
        prodotti.put(13, new Prodotto("bounty", 0.90, 3));
        prodotti.put(14, new Prodotto("mars", 0.90, 3));
        prodotti.put(15, new Prodotto("twix", 1.10, 5));
    }

    public void mostraProdotti(){
        System.out.println("\nProdotti disponibili");
        for(Map.Entry<Integer, Prodotto> entry : prodotti.entrySet()){
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }

    public void aggiungiQuantita(int idProdotto, int quantita){
        Prodotto prodotto = prodotti.get(idProdotto);
        int quantitaAttuale = prodotto.getQuantita();
        int quantitaAggiornata = quantitaAttuale + quantita;
        if(idProdotto >= 6 && idProdotto <= 15){
            if(quantitaAggiornata > 10){
                System.out.println("Spazio insufficiente. Quantità massima consentita 10. Quantità attuale del prodotto:" + prodotto.getQuantita());
            }else{
                prodotto.setQuantita(quantitaAggiornata);
                System.out.println("Quantità del prodotto " + prodotto.getNome() + " aggiornata a " + quantitaAggiornata);
            }
        }else{
            System.out.println("I prodotti dall'1 al 5 non hanno bisogno di essere ricaricati");
        }
        /*if(prodotto.getQuantita() < 10){
            prodotto.setQuantita(prodotto.getQuantita() + quantita);
            System.out.println("Quantità del prodotto " + prodotto.getNome() + " aggiornata a " + prodotto.getQuantita());
        }else{
        }*/
    }

    public void SostituisciProdotto(int idProdotto, String nuovoNome, double nuovoPrezzo, int nuovaQuantita){
        if(prodotti.containsKey(idProdotto)){
            if(nuovaQuantita > 10){
                System.out.println("Il massimo di pezzi che puoi inserire è di 10");
                return;
            }
            Prodotto vecchio = prodotti.get(idProdotto);
            Prodotto nuovo = new Prodotto(nuovoNome, nuovoPrezzo, nuovaQuantita);
            prodotti.put(idProdotto, nuovo);
            System.out.println("Il prodotto " + vecchio.getNome() + " è stato sostituito con " + nuovo.getNome());
        }else{
            System.out.println("L'id inserito non è valido");
        }
    }
    
}
