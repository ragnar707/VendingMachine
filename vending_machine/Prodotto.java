package vending_machine;

public class Prodotto {
    private String nome;
    private double prezzo;
    private int quantita;

    public Prodotto(String nome, double prezzo, int quantita){
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void diminuisciQuantita(){
        if(quantita > 0){
            quantita--;
        }
    }

    public boolean isDisponibile(){
        return quantita > 0;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nome + " - " + prezzo + "$" + " (" + quantita + " disponibili)";
    }
    
}
