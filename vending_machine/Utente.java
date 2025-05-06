package vending_machine;

public class Utente {
    private double credito;

    public Utente(double creditoIniziale){
        this.credito = creditoIniziale;
    }

    public double getCredito() {
        return credito;
    }

    public boolean acquista(VendingMachine vm, int idProdotto){
        return vm.acquistaProdotto(idProdotto, credito);
    }





    
}
