public class Deposito {

    private double totale;

    public Deposito(){
        this.totale = 0.0;
    }

    public void aggiungi(double importo){
        totale += importo;
    }

    public double ritira(){
        double prelievo = totale;
        totale = 0.0;
        return prelievo;
    }

    public double getTotale() {
        return totale;
    }

    public void mostraDeposito(){
        System.out.println("Totale nel deposito:" + totale);
    }
    
}
