package java_Lesson.seminars.Lesson_0001;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * lesson_001
 */
public class lesson_001 {

    public static void main(String[] args) {
        // System.out.println("Hello world");
        // System.out.println(LocalTime.now());
        // Scanner scan = new Scanner(System.in);
        // System.out.printf("Как зовут?\n");
        // String name = scan.nextLine();
        // System.out.printf("Привет, %s \n", name);
        // Scanner sca = new Scanner(System.in);
        // System.out.printf("Сколько лет?\n");
        // Integer x = sca.nextInt();
        // System.out.printf("Лет вам -, %d \n",x);
        // int h = LocalDateTime.now().getHour();
        // int m = LocalDateTime.now().getMinute();
    
        // if (h < 5) {
        //     System.out.printf("Доброй ночи, %s!\n", name);
        //     } else if (h < 12) {
        //     System.out.printf("Доброе утро, %s!\n", name);
        //     } else if (h < 18) {
        //     System.out.printf("Добрый день, %s!\n", name);
        //     } else {
        //     System.out.printf("Добрый вечер, %s!\n", name);
        //     }
        // scan.close();


        /*Задача 2 
         * Дан массив двоичных чисел, например [1,1,0,1,1,1],
         * вывести максимальное количество подряд идущих 1.
        */


        // int[] a = {1,1,0,1,1,1};
        // int count = 0;
        // int max = 0;

        // for (int i = 0; i < 6; i++) {
        //     System.out.printf("%d ", a[i]);
        //     if (a[i] == 1) count++;
        //     if (count > max) max = count;
        //     if (a[i] == 0) count = 0;
        // }    
        // System.out.printf("\n%d\n", max);
    




        /* Задание 3
         * Дан массив nums = [3,2,2,3] и число val = 3.
         * 
         * Если в массиве есть числа, равные заданному,
         * нужно перенести эти элементы в конец масива.
         * 
         * Таким образом, первые несколько (или все) элементов массива
         * должны быть отличны от заданного, а остальные - равны ему.
        */


        // int[] nums = {3,2,2,3};
        // int value = 3;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == value) {
        //         for (int j = i; j < nums.length - 1; j++) {
        //             nums[j] = nums[j + 1];
        //         }
        //         nums[nums.length - 1] = value;
        //     }
        // }
        // for (int s = 0; s < nums.length; s++) {
        //     System.out.printf("%d ", nums[s]);
        // }
        // System.out.printf("\n");




        /* Задание */




        // String[] array = {"abcdefq", "abcqkjsdfkl", "bvxhcbdf", "qwertwet", "abc"};
        // String value = "abc";

        // for (int i = 0; i < array.length; i++) {
        //     if (array[i].substring(0, 3).equals(value)){
        //         System.out.println(i);
        //     }
        // }
 




        /*




         */



    }
}

