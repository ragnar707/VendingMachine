package vending_machine;

import java.util.HashMap;
import java.util.Map;

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

    public boolean acquistaProdotto(int idProdotto, double credito){
        Prodotto prodotto = prodotti.get(idProdotto);
        if(prodotto != null && prodotto.isDisponibile()){
            if(credito >= prodotto.getPrezzo()){
                prodotto.diminuisciQuantita();
                System.out.println("Acquisto del prodotto " + prodotto.getNome() + " andato a buon fine");
                double resto = credito - prodotto.getPrezzo();
                System.out.println("Resto di " + resto + "$");
                return true;
            }else{
                System.out.println("Credito insufficiente per acquistare il prodotto " + prodotto.getNome());
            }
        }else{
            System.out.println("Il prodotto non è disponibile");
        }
        return false;
    }
    

}
 