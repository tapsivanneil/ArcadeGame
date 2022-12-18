package Arcade;
    import java.util.*;
public class Game {
    private int tickets = 5;
    private String name = "JackEnPoy";
    private int status; 
    private int claimableTickets;

    public int getTickets(){
        return tickets;
    }

    public String getName(){
        return name;
    }

    public int getClaimableTickets(){
        return claimableTickets;
    }

    public void startGame (){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String choices[] = {"Rock", "Paper", "Scissor"};
        System.out.println(getName()+" -----");
        for(int i=0; i< choices.length; i++){
            System.out.println(i+1 + ") " + choices[i]);
        }

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();

        int randNum = rand.nextInt(3);
        
        while (choice > 3 || choice <=0){
            System.out.print("\nInvalid choice: ");
            choice = sc.nextInt();
        }
            if (choice == 1){
                if (randNum == 0){
                    System.out.println("Draw\n");
                    startGame(); // Restart the game

                }
                else if (randNum == 1){
                    System.out.println("Lose");
                    status = 2;
                    claimableTickets = rand.nextInt(30);

                }
                else if (randNum == 2){
                    System.out.println("Win");
                    status = 1;
                    claimableTickets = rand.nextInt(10);
                }  
            }

            else if (choice == 2){
                
                if (randNum == 0){
                    System.out.println("Win");
                    status = 1;
                    claimableTickets = rand.nextInt(30);
                }
                else if (randNum == 1){
                    System.out.println("Draw \n");
                    startGame(); // Restart the game
                }
                else if (randNum == 2){
                    System.out.println("Lose");
                    status = 2;
                    claimableTickets = rand.nextInt(10);
                }
            }

            else if (choice == 3){
                
                if (randNum == 0){
                    System.out.println("Lose");
                    status = 2;
                    claimableTickets = rand.nextInt(10);
                }
                else if (randNum == 1){
                    System.out.println("Win \n");
                    status = 1;
                    claimableTickets = rand.nextInt(30);
                }
                else if (choice-1 == randNum){
                    System.out.println("Draw");
                    startGame(); // Restart the game
                    
                }
        }
 
        System.out.println("\nYour Pick: " + choices[choice-1]);
        System.out.println("My Pick: " + choices[randNum] + "\n") ;

        System.out.println("Congratulations on winning " + claimableTickets + " tickets!\n");
        

    }

}
