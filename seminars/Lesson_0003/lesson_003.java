package java_Lesson.seminars.Lesson_0003;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Random;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class lesson_003 {

    /**
     * Задания 0
     * Даны следующие строки, сравнить их с помощью == и 
     * метода equals() клаасса Object.
     * String s1 = "hello";
     * String s2 = "hello";
     * String s3 = s1;
     * String s4 = "h"+"e"+"l"+"l"+"o";
     * String s5 = new String("hello");
     * String s6 = new String(new char[]{'h','e','l','l','o'});
    */

    // public static void main(String[] args) {
    //     String s1 = "hello";
    //     String s2 = "hello";
    //     String s3 = s1;
    //     String s4 = "h"+"e"+"l"+"l"+"o";
    //     String s5 = new String("hello");
    //     String s6 = new String(new char[]{'h','e','l','l','o'});

    //     System.out.println(s1 + " == " + s2 + " = " + (s1 == s2));
    //     System.out.println(s1 + " eqw " + s2 + " = " + s1.equals(s2));
    //     System.out.println(s1 + " == " + s4 + " = " + (s1 == s4));
    //     System.out.println(s1 + " eqw " + s4 + " = " + s1.equals(s4));
    //     System.out.println(s1 + " == " + s6 + " = " + (s1 == s6));
    //     System.out.println(s1 + " == " + s6 + " = " + s1.equals(s6));

        /*  hello == hello = true
            hello eqw hello = true
            hello == hello = true
            hello eqw hello = true
            hello == hello = false
            hello == hello = true   */
    // }









    /**
     * Задания 1
     * Заполнить список десятью случайными числами.
     * Отсортировать список методом sort() и вывести его на экран.
    */

    // public static void main(String[] args) {
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     Random random = new Random();
    //     for (int i = 0; i < 10; i++) {
    //         arr.add(random.nextInt(50));
    //     }
    //     System.out.println(arr.toString()); // [38, 38, 8, 9, 22, 14, 46, 3, 2, 15]
    //     arr.sort(null);
    //     System.out.println(arr.toString()); // [2, 3, 8, 9, 14, 15, 22, 38, 38, 46]
    // }















    /**
     * Задания 2.1
     * Заполнить список названиями планет Солнечной системы 
     * в произвольном порядке с повторениями.
     * 
     * Вывести название каждой планеты и количество его 
     * повторений в списке.
     * 
     * Задания 2.2
     * Пройти по списку из предыдущего задания и 
     * удалить повторяющиеся элементы.    
    */

//     public static void main(String[] args) {
//         String[] soralSystem = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Нептун"};
        
//         ArrayList<String> myList = new ArrayList<>();
//         Random rand = new Random();
//         int s = rand.nextInt(1000);
//         System.out.println(s);
//         for (int i = 0; i < s; i++) {
//             int n = rand.nextInt(7);
//             myList.add(soralSystem[n]);
//         }
//         System.out.println(myList.toString());

//         HashMap<String, Integer> answer = new HashMap<String, Integer>();
//         for (int i = 0; i < myList.size(); i++) {
//             if(!answer.containsKey(myList.get(i))){
//                 answer.put(myList.get(i), 1);
//             }
//             else {
//                 answer.put(myList.get(i), answer.get(myList.get(i)) + 1);
//             }
//         }
//         System.out.println(answer.toString());
//     }













/**
     * Задания 2
     * Создать список типа ArrayList<String>.
     * Поместить в него как строки, так и целые числа.
     * Пройти по списку, найти и удалить целые числа.
    */
    
    // public static void main(String[] args) {
    //     ArrayList<Object> inArr = new ArrayList<Object>();
    //     inArr.add(4);
    //     inArr.add(4);
    //     inArr.add("s");
    //     inArr.add(4);
    //     inArr.add(4);
    //     inArr.add("s");
    //     inArr.add(4);
    //     inArr.add("s");
    //     inArr.add(4);
    //     inArr.add("s");
            
    //     ArrayList<Object> outArr = new ArrayList<Object>();
    
    //     System.out.println("Исходный лист: ");
    //     System.out.println(inArr.toString());
            
    //     for (Object obj : inArr) {
    //         if (! (obj instanceof Integer)) {
    //             outArr.add(obj);
    //         }
    //     }
    
    //     System.out.println("Лист с удалёнными целозначными числами: ");
    //     System.out.println(outArr.toString());
            // [4, 4, s, 4, 4, s, 4, s, 4, s]
            // [s, s, s, s]
    // }    





        /**
     * Задания 3
     * 
    */

    // public static void main(String[] args) {}

}










