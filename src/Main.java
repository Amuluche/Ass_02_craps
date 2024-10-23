import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
            Random Die1=new Random();
            Random Die2=new Random();

            int die1=Die1.nextInt(6)+1;
            int die2=Die2.nextInt(6)+1;

            int sum = die1+die2;

            if(sum==2 || sum==3 || sum==12 ){
                System.out.println("Craps " + sum + " die 1 was " + die1 + " and die 2 was " + die2);
            }

            else if (sum==7 || sum==11) {
                System.out.println("Natural " + sum + " die 1 was " + die1 + " and die 2 was " + die2);

        }
            else{
                System.out.println("Point added " + sum + " die 1 was " + die1 + " and die 2 was " + die2);
            }
    }
}