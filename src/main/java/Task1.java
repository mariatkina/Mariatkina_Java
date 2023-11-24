import java.util.InputMismatchException;
import java.util.Scanner;
//1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”
public class Task1 {
    public static void main(String[] args) {

        getNumber();
    }
    public static void getNumber(){
       try{
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a number:");
           double x = sc.nextDouble();

           if(x >= 7){
               System.out.println("Привет");
           }

       }catch (InputMismatchException e){
           System.out.println("You only need to enter a number!");
           getNumber();
       }
    }
}
