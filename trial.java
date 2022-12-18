package Arcade;
    import java.util.*;
public class trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        double rand = 1 + Math.random()*3;
        rand = Math.round(rand);

        int randNum = (int)rand;

    
        String choices[] = {"Rock", "Paper", "Scissor"};

        for(int i=0; i< choices.length; i++){
            System.out.println(i+1 + ") " + choices[i]);
        }

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();

        System.out.println("\nYour Pick:" + choices[choice]);
        System.out.println("My Pick: " + choices[randNum] + "\n") ;

        if (choice == 1){
            
            if (randNum == 1){
                System.out.println("Draw");
            }
            else if (randNum == 2){
                System.out.println("Lose");
            }
            else if (randNum == 3){
                System.out.println("Win");
            }
        }

        else if (choice == 2){
            
            if (randNum == 1){
                System.out.println("Win");
            }
            else if (randNum == 2){
                System.out.println("Draw");
            }
            else if (randNum == 3){
                System.out.println("Lose");
            }
        }

        else if (choice == 3){
            
            if (randNum == 1){
                System.out.println("Lose");
            }
            else if (randNum == 2){
                System.out.println("Win");
            }
            else if (randNum == 3){
                System.out.println("Draw");
            }
        }


        sc.close();



    
    }
}

