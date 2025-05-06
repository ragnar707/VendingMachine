import java.util.Scanner;

public class Admin {

    private String username;
    private String password;

    public Admin(String username, String password){
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password){
        return this.username.equals(username) && this.password.equals(password);
    }

    public void pannello(VendingMachine vm){
        Scanner sc = new Scanner(System.in);
        boolean continua = true;

        while(continua){
            System.out.println("\nMenù admin");
            System.out.println("1.Aggiungi quantità");
            System.out.println("2.Sostituisci prodotto");
            System.out.println("3.Ritira deposito");
            System.out.println("4.Ricarica cassa");
            System.out.println("0.Esci");
            System.out.print("Scelta: ");
            int scelta = sc.nextInt();

            switch(scelta){
                case 1: {
                    vm.mostraProdotti();
                    System.out.print("Id prodotto:");
                    int idProdotto = sc.nextInt();
                    System.out.print("Inserire quantità da aggiungere:");
                    int quantita = sc.nextInt();
                    vm.aggiungiQuantita(idProdotto, quantita);
                    break;
                }
                case 2: {
                    vm.mostraProdotti();
                    System.out.print("Inserisci l'id del prodotto da sostituire:");
                    int idProdotto = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Inserisci il nome del nuovo prodotto:");
                    String nome = sc.nextLine();
                    System.out.print("Inserisci il prezzo del nuovo prodotto:");
                    double prezzo = sc.nextDouble();
                    System.out.print("Inserisci la quantità del prodotto da mettere nella vending machine:");
                    int quantita = sc.nextInt();
                    vm.SostituisciProdotto(idProdotto, nome, prezzo, quantita);
                    break;
                }
                case 0: {
                    continua = false;
                    break;
                }
                default: {
                    System.out.println("Scelta non valida. Inserire un numero da 0 a 4");
                }
            }


        }

    }

   

    
    
}
