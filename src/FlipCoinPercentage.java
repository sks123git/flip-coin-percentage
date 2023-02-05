import java.util.Scanner;

public class FlipCoinPercentage {
    //Program to flip a coin
    public static double coinFlipper(){  //to flip and return value
        double val = (Math.random() * 1);
        return val;
    }
    //Method to calculate average percentage
    public static void calculteAverage(float heads, float tails, float totalFlips){
        float avgHeads = (float) ((heads/totalFlips) * 100);
        float avgTails = (float) ((tails/totalFlips) * 100);
        System.out.println("Average percentage of heads to tails is: " + (int)avgHeads+ ":" +(int)avgTails);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTimes;
        int headsCount = 0;
        int tailsCount = 0;
        System.out.println("Kindly enter the number of times u want to flip coin: ");
        numberOfTimes = scanner.nextInt();

        for(int i=0; i<numberOfTimes; i++) {        //Flip coin no of times user want
            double flipResult = coinFlipper();
            if (flipResult > 0.5) {                 //Condition checking and deciding whethervheads or tails
                System.out.println("its heads " + true);
                headsCount++;
            } else {
                System.out.println("its tails " + false);
                tailsCount++;
            }
        }
        calculteAverage(headsCount,tailsCount,numberOfTimes);

    }
}