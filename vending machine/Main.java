import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();
        Admin admin = new Admin("pippo", "1234");

        System.out.println("Sei admin?");
        String parola = sc.nextLine();

        if(parola.equalsIgnoreCase("si")){
            System.out.print("Inserisci username:");
            String username = sc.nextLine();
            System.out.print("Inserisci la password:");
            String password = sc.nextLine();

            if(admin.login(username, password)){
                System.out.println("Accesso effettuato!");
                admin.pannello(vm);
            }else{
                System.out.println("Accesso negato!");
            }
        }
        sc.close();
    }
    
}
