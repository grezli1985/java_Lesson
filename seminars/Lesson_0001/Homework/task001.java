package java_Lesson.seminars.Lesson_0001.Homework;
import java.util.Scanner;


/**
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
 *    (произведение чисел от 1 до n)
 */


public class task001 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите число: ");
        Integer number = scan.nextInt();
        System.out.printf("Произведение чисел от 1 до %d равна ", number);
        FindFact(number);
        scan.close();
    }
    static void FindFact(int number){
        int fact = 0;
        for(int i = 1; i <= number; i++)
        {
            fact = fact+i;
        }
        System.out.println(fact);
    }
}
