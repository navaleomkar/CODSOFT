import java.util.Scanner;
public class NumberGame
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int attempts=5;
        int finals=0;
        boolean playAgain=true;
        System.out.println("***A HUGE WELCOME TO THE NUMBER GAME***");
        System.out.println("Guess Your Number within 5 trials");
        while(playAgain){
            int RandomNumber=getRandomNumber(1,100);
            boolean guess=false;
            for(int i=0;i<attempts;i++){
                System.out.println("Trial "+(i+1)+"  Enter your guess:");
                int user=sc.nextInt();
                if(user==RandomNumber){
                    guess=true;
                    finals+=1;
                    System.out.println("Congratulations! You win.");
                    break;
                }
                else if(user>RandomNumber){
                    System.out.println("it's Too high Number !! Please Try again!!");
                }
                else{
                    System.out.println("ohh it's Too low !! Please Try again!!");
                }
            }
            if(guess==false){
                System.out.println("Sorry,You lost all the attempts.\nThe number was: "+RandomNumber);
            }
            System.out.println("Better Luck Next Time!!!!\n We're Thrilled to have you with us.\n Do you want to play Again?(Yes/No): ");
            String pA=sc.next();
            playAgain=pA.equalsIgnoreCase("Yes");
        }
        System.out.println("That's it,Hope you enjoyed.");
        System.out.println("Here is your Score "+finals);
    }    
        public static int getRandomNumber(int min,int max){
            return (int)(Math.random()*(max-min+1)+min);
        }
    
}