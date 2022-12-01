package java_Lesson.seminars.Lesson_0002;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class lesson_002 {
    
    /**
     * Задания 1
     * Дано четное число N (>0) и символы с1 и с2.
     * 
     * Написать метод, который вернет строку длины N, 
     * которая состоит из чередующихся символов с1 и с2, начиная с с1.
    */

    // public static void main(String[] args) {
    //     char c1 = '1';
    //     char c2 = '0';
    //     int userInt = -1;
    //     Scanner userInput = new Scanner(System.in);


    //     System.out.println("Введите число N, для формирования строки чередующихся символов:");
    //     userInt = userInput.nextInt();

    //     StringBuilder myBuilder = new StringBuilder();

    //     for (int i = 0; i < Math.abs(userInt); i++) {
    //         if (i % 2 == 0) {
    //             myBuilder.append(c1);
    //         }
    //         else {
    //             myBuilder.append(c2);
    //         }
    //     }
    //     System.out.println(myBuilder);
    //     System.out.println(String.format("Для введённого числа %d получена следующая строка %s", userInt, myBuilder.toString()));
        
    //     userInput.close();
    // }
    

    


    /*Задания 2
     * Напишиите метод, который сжимает строку.
     * 
     * пример: вход aaaabbbbcdd
     *         выход 4a3b1c2d
     */
    
    // public static void main(String[] args) {
    // String result = myRLEcoding("testttttt stringggggggggggggggggggggggggggggghhhhhhjjj");
    // System.out.println(result);
    

    // }

    // public static String myRLEcoding(String argInput) {
    //     int count = 1;
    //     String argOutInput = "";
    //     StringBuilder myBuilder = new StringBuilder();

    //     for (int i = 0; i < argInput.length(); i++) {
    //         if ((i + 1) < argInput.length()) {
    //             if (argInput.charAt(i + 1) == argInput.charAt(i) && (count < 9)) {
    //                 count ++;
    //             }
    //             else {
    //                 myBuilder.append(argOutInput);
    //                 myBuilder.append(count);
    //                 myBuilder.append(argInput.charAt(i));
    //                 count = 1;
    //             }
    //         }
    //         else {
    //             myBuilder.append(argOutInput);
    //             myBuilder.append(count);
    //             myBuilder.append(argInput.charAt(i));
    //         }
    //     }
    //     return myBuilder.toString();
    // }


    /* Задания 3
     * Напиши метод, который принимает на вход строку (String) и определяет 
     * является ли строка палиндромам (возращает boolean значение).
     */

    // public static void main(String[] args) {
    //     String str = "1234321";
    //     System.out.println(isPolindrom(str));

    
    // }

    // public static boolean isPolindrom( String str){
    //     boolean flag = true;
    //     for (int i = 0; i < str.length()/2; i++) {
    //             if(str.charAt(i) != str.charAt(str.length()-1-i)){
    //                 flag = false;
    //             }
    //         }
    //     return flag;
    // }



    /* Задания 4
     * Напеши метод, который составит строку, состоящию из 100 повторений
     * слова TEST и метод, который запишет эту строку в простой 
     * текстовый файл, обработайте исключение.
     */

    // public static void main(String[] args) throws Exception {
    //     String str = "TEST";
    //     StringBuilder s = new StringBuilder();
    //     for (int i = 0; i <= 100; i++) {
    //         s.append(str);
    //     }
    //     System.out.println(s.toString());

    //     FileWriter fw = new FileWriter("Test100.txt");
    //     fw.write(s.toString());
    //     fw.flush();
    //     fw.close();
    // }



    /* Задания 5
     * Напишите метод, который вернет содержимое текущей 
     * папки в виде массива строк.
     * 
     * Напишите метод, который запишет массив, 
     * возвращенный предыдущим методом в файл.
     * 
     * Обработайте ошибки с помощью try-catch конструкции. 
     * В случае возникновения исключения, оно должно записаться в лог-файл.
     */

    // public static void main(String[] args) throws Exception {
    //     getArray("java_Lesson");
        
    // }

    // public static void getArray(String str) {
    //     File file = new File(str);
    //     if (file.isDirectory()) {
    //     String[] arr = file.list();
    //         for (int i = 0; i < arr.length; i++) {
    //             System.out.println(arr[i] + "\n");
    //             File d = new File(str + "//" + arr[i]);
    //             if (d.isDirectory()){
    //                 getArray(file.getPath() + String.format("//%s", arr[i]));
    //             }
    //         }
    //     }
    // }
        
          
    
}





