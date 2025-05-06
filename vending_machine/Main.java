package vending_machine;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Main {

    public static void main( String[] args){

        Scanner sc = new Scanner(System.in);

        VendingMachine vm = new VendingMachine();
        Utente u = new Utente(5.00);

        vm.mostraProdotti();
        System.out.println("Che prodotto vuoi acquistare?");
        u.acquista(vm, sc.nextInt());

        sc.close();
    }
    
}
