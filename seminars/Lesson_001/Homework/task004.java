package java_Lesson.seminars.Lesson_001.Homework;
import java.util.Scanner;


/*
   *+Задано уравнение вида q + w = e, где q, w, e >= 0. 
    Некоторые цифры могут быть заменены знаком вопроса, 
    например 2? + ?5 = 69. Требуется восстановить выражение 
    до верного равенства. Предложить хотя бы одно решение или 
    сообщить, что его нет.
 */


public class task004 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("\nЗадано выражение: 2? + ?5 = 69 . \nВосстановить выражение до верного равенства.");
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (20 + i + j * 10 + 5 == 69) {
                    count += 1;
                    System.out.println(count + ") 2" + i + " + " + j + "5" + " = 69");
                }
            }
        }
        System.out.println("\n");
        if (count == 0) {
            System.out.println("Решений нет\n");
        } 
    }
}
