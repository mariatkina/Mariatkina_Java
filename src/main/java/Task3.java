import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
public class Task3 {
    public static void main(String[] args) {

        getNumsDivBy3(enterYourNumbers());
    }

    //Метод, принимающий на вход произвольный список чисел и выводящий из него в консоль числа кратные 3:
    public static void getNumsDivBy3(List<Integer> list){
        for(int n:list){
            if(n%3==0){
                System.out.print(n + " ");
            }
        }
    }

// Метод для ввода из консоли чисел в список произвольного размера:
    public static List<Integer> enterYourNumbers(){
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое количество чисел через Enter, в конце ввода нажмите любую букву:");
        while (sc.hasNextInt())
        {
            numbers.add(sc.nextInt());
        } return numbers;
    }
}