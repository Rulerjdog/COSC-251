import java.util.InputMismatchException;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args){
        Scanner intake = new Scanner(System.in);
        System.out.println("How Many quizs are there?");
       int quizNum = 0;
        try{
            quizNum = intake.nextInt();
       }
       catch(InputMismatchException a)
       {
           System.out.println("Not the right Input");
       }
        double quizTotal = 0.0;
        double quizMean = 0.0;
        for(int i = 1; i<=quizNum;i++)
        {
        System.out.println("For Quiz " + i+ ", what score did you get?");
        try{
            quizTotal += intake.nextInt();
        }
        catch (InputMismatchException a)
        {
            System.out.println("Not the right Input");
            break;
        }
        }
        quizMean = quizTotal / quizNum;
                System.out.println("You got " + quizMean + " for the quizes.");
    }
}
