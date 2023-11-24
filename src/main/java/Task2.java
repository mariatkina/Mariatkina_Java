import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
public class Task2 {
    public static void main(String[] args) {

        getName();
    }
    public static void getName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = sc.nextLine();

        List<String> names = new ArrayList<>();
        names.add("Вячеслав");

        for(String n:names){
            if(name.equals(n)){
                System.out.printf("Привет, %s", name);
            }else {
                System.out.println("Нет такого имени");
//                getName();
            }
        }
    }

}
