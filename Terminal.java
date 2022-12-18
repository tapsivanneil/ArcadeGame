package Arcade;
    import java.util.*;
public class Terminal {
    public void startTerminal(){
        Game game = new Game();
        Card card1 = new Card();
        Card card2 = new Card();
        Prize pencil = new Prize();
        Prize mug = new Prize();
        Prize cap = new Prize();

        card1.setName("Ivan");
        card2.setName("Neil");

        pencil.setName("Wonder Pencil");
        pencil.setPrice(25);
        pencil.setQuantity(10);

        mug.setName("Wonder Mug");
        mug.setPrice(40);
        mug.setQuantity(10);

        cap.setName("Wonder Cap");
        cap.setPrice(50);
        cap.setQuantity(10);

        Scanner sc = new Scanner(System.in);
            while(true){
                showActionMenu();
                System.out.print("Enter Action Number: ");
                int actionNum = sc.nextInt();
            
                switch (actionNum){
                    case 1:
                        if(cardChoice() == 1){
                            card1.showCardInfo();}
                        else{
                            card2.showCardInfo();}
                        break;                 
                    case 2:
                        if(cardChoice() == 1){
                            card1.addBalance();}
                        else{
                            card2.addBalance();}
                        break;
                    case 3:
                        if(cardChoice() == 1){
                            if (card1.getBalance()< game.getTickets()){   
                                System.out.println("Insufficient balance");
                            }
                            else{
                                card1.setBalance(card1.getBalance() - game.getTickets());
                                game.startGame();
                                card1.setTickets(card1.getTickets()+ game.getClaimableTickets());
                            }
                        }
                        else{
                            if (card2.getBalance()< game.getTickets()){   
                                System.out.println("Insufficient balance");
                            }
                            else{
                                card2.setBalance(card2.getBalance() - game.getTickets());
                                game.startGame();
                                card2.setTickets(card2.getTickets()+ game.getClaimableTickets());
                            }
                        }
                        break;
    
                    case 4:
                        System.out.println("Claim Prize -----");
                        System.out.println("1) " + pencil.getName() + " Price = " + pencil.getPrice() + " Items left: " + pencil.getQuantity());
                        System.out.println("2) " + mug.getName() + " Price = " + mug.getPrice() + " Items left: " + mug.getQuantity());
                        System.out.println("3) " + cap.getName() + " Price = " + cap.getPrice() + " Items left: " + cap.getQuantity());
                        System.out.println("4) Exit Prize Terminal");
                        System.out.print("\n Enter the item number of the Prize that you want to claim:  ");
                        int prizeChoice = sc.nextInt();
                        
                        while(prizeChoice <=0 || prizeChoice > 4){
                            System.out.println("Invalid item number try again: ");
                            prizeChoice = sc.nextInt();
                        }
                        if(cardChoice() == 1){
                            if (prizeChoice == 1){
    
                                System.out.print("Enter quantity: ");
                                int quantity = sc.nextInt();
        
                                while(quantity > pencil.getQuantity() || quantity <= 0 ){
                                    System.out.println("Invalid Quantity, Remaning items for " + pencil.getName() + ": " + pencil.getQuantity());
                                    System.out.print("Enter Quantity: ");
                                    quantity = sc.nextInt();
                                }
        
                                if(card1.getTickets() < pencil.getPrice() * quantity){
                                    System.out.println("Insufficient tickets!");
                                }
                                else{ 
                                   card1.setTickets(card1.getTickets()- pencil.getPrice()* quantity);
                                   pencil.setQuantity(pencil.getQuantity()-quantity);
                                   System.out.println("Congratulations on claiming " + quantity + " " + pencil.getName());
                                    
                                }
                            }
                            else if (prizeChoice == 2){
        
                                System.out.print("Enter quantity: ");
                                int quantity = sc.nextInt();
        
                                while(quantity > mug.getQuantity() || quantity <= 0 ){
                                    System.out.println("Invalid Quantity, Remaning items for " + mug.getName() + ": " + pencil.getQuantity());
                                    System.out.print("Enter Quantity: ");
                                    quantity = sc.nextInt();
                                }
        
                                if(card1.getTickets() < mug.getPrice() * quantity){
                                    System.out.println("Insufficient tickets!");
                                }
                                else{ 
                                   card1.setTickets(card1.getTickets()- mug.getPrice()* quantity);
                                   mug.setQuantity(mug.getQuantity()-quantity);
                                   System.out.println("Congratulations on claiming " + quantity + " " + mug.getName());
                                    
                                }
                            }
                            else if (prizeChoice == 3){
        
                                System.out.print("Enter quantity: ");
                                int quantity = sc.nextInt();
        
                                while(quantity > cap.getQuantity() || quantity <= 0 ){
                                    System.out.println("Invalid Quantity, Remaning items for " + cap.getName() + ": " + pencil.getQuantity());
                                    System.out.print("Enter Quantity: ");
                                    quantity = sc.nextInt();
                                }
        
                                if(card1.getTickets() < cap.getPrice() * quantity){
                                    System.out.println("Insufficient tickets!");
                                }
                                else{ 
                                card1.setTickets(card1.getTickets()- cap.getPrice()* quantity);
                                cap.setQuantity(cap.getQuantity()-quantity);
                                System.out.println("Congratulations on claiming " + quantity + " " +cap.getName());
                                    
                                }
                            } 
                            else if (prizeChoice == 4){
                                break;
                            }
                        }
                        else{
                            if (prizeChoice == 1){
    
                                System.out.print("Enter quantity: ");
                                int quantity = sc.nextInt();
        
                                while(quantity > pencil.getQuantity() || quantity <= 0 ){
                                    System.out.println("Invalid Quantity, Remaning items for " + pencil.getName() + ": " + pencil.getQuantity());
                                    System.out.print("Enter Quantity: ");
                                    quantity = sc.nextInt();
                                }
        
                                if(card1.getTickets() < pencil.getPrice() * quantity){
                                    System.out.println("Insufficient tickets!");
                                }
                                else{ 
                                   card1.setTickets(card1.getTickets()- pencil.getPrice()* quantity);
                                   pencil.setQuantity(pencil.getQuantity()-quantity);
                                   System.out.println("Congratulations on claiming " + quantity + " " + pencil.getName());
                                    
                                }
                            }
                            else if (prizeChoice == 2){
        
                                System.out.print("Enter quantity: ");
                                int quantity = sc.nextInt();
        
                                while(quantity > mug.getQuantity() || quantity <= 0 ){
                                    System.out.println("Invalid Quantity, Remaning items for " + mug.getName() + ": " + pencil.getQuantity());
                                    System.out.print("Enter Quantity: ");
                                    quantity = sc.nextInt();
                                }
        
                                if(card2.getTickets() < mug.getPrice() * quantity){
                                    System.out.println("Insufficient tickets!");
                                }
                                else{ 
                                   card2.setTickets(card2.getTickets()- mug.getPrice()* quantity);
                                   mug.setQuantity(mug.getQuantity()-quantity);
                                   System.out.println("Congratulations on claiming " + quantity + " " + mug.getName());
                                    
                                }
                            }
                            else if (prizeChoice == 3){
        
                                System.out.print("Enter quantity: ");
                                int quantity = sc.nextInt();
        
                                while(quantity > cap.getQuantity() || quantity <= 0 ){
                                    System.out.println("Invalid Quantity, Remaning items for " + cap.getName() + ": " + pencil.getQuantity());
                                    System.out.print("Enter Quantity: ");
                                    quantity = sc.nextInt();
                                }
        
                                if(card2.getTickets() < cap.getPrice() * quantity){
                                    System.out.println("Insufficient tickets!");
                                }
                                else{ 
                                card2.setTickets(card2.getTickets()- cap.getPrice()* quantity);
                                cap.setQuantity(cap.getQuantity()-quantity);
                                System.out.println("Congratulations on claiming " + quantity + " " +cap.getName());
                                    
                                }
                            } 
                            else if (prizeChoice == 4){
                                break;
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Tranfer Tickets -----");
                        card2.getBalance();
                        System.out.print("How many tickets would you like to transfer? ");
                        int ticketsTransfer = sc.nextInt();
    
                        while(ticketsTransfer > card2.getTickets() || ticketsTransfer <= 0 ){
                            System.out.print("Invalid Amount! Please try again: ");
                            ticketsTransfer = sc.nextInt();
                        }
    
                        System.out.println("\nTransferring Tickets");
                        card2.setTickets(card2.getTickets()-ticketsTransfer);
                        card1.setTickets(card1.getTickets()+ticketsTransfer);    
                        System.out.println(ticketsTransfer + " tickets tranferred successfully!"); 
                        break; 
                }
            }
        }
    public void showActionMenu(){
        System.out.println("\nWelcome to Arcade! What would you like to do?");
        System.out.println("1) Check Card Balance");
        System.out.println("2) Insert Card Balance");
        System.out.println("3) Play Game");
        System.out.println("4) Claim Prize");
        System.out.println("5) Transfer Tickets");
        System.out.println("6) Change Card\n");
    }
    public int cardChoice(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Which Card will be used? \n Card 1 or Card 2? "
        );
        int cardChoice = sc.nextInt();
        
        while(cardChoice <1 || cardChoice > 2){
            System.out.print("Which Card will be used? ");
            cardChoice = sc.nextInt();
        }
        return cardChoice;
    }
}