package Arcade;
    import java.util.*;
public class Card {

    Scanner sc = new Scanner(System.in);

    private String name;
    private int balance;
    private int tickets;


    public void setName (String name){
        this.name = name;
    }

    public void setBalance (int balance){
        this.balance = balance;
    }

    public void setTickets (int tickets){
        this.tickets = tickets;
    }

    public String getName (){
        return name;
    }
    
    public int getBalance (){
        return balance;
    }

    public int getTickets (){
        return tickets;
    }


    public void showCardInfo(){
        System.out.println("Card Info-----");
        System.out.println("\nName: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Tickets: " + tickets + "\n");
    }

    public void addBalance(){
        System.out.println("Add Balance -----");
        System.out.print("\nEnter amount: ");
        int insertedBalance = sc.nextInt();

        while (insertedBalance <= 0){
            System.out.print("\nInsert valid amount: ");
            insertedBalance = sc.nextInt();
        }

        this.balance += insertedBalance; 
    }

}



