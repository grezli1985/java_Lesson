package java_Lesson.seminars.Lesson_0004;

import java.nio.channels.NetworkChannel;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

import javax.sound.sampled.LineListener;



public class lesson_004 {
    
    /*
    * Задания 0
    1. замерте время, за которое в ArrayList добавляет 10000 элементов.
    2. замерте время, за которое в LinkedList добавляет 10000 элементов.
        Сравните с предыдущим.
    */

    // public static void main(String[] args) {
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     LinkedList<Integer> arr_link = new LinkedList<>();

    //     long time = System.currentTimeMillis();
    //     for (int i = 0; i <= 1000000; i++) {
    //         arr.add(1);
    //     }
    //     System.out.println(System.currentTimeMillis() - time);
        
    //     long time1 = System.currentTimeMillis();
    //     for (int i = 0; i <= 1000000; i++) {
    //         arr_link.add(1);
    //     }
    //     System.out.println(System.currentTimeMillis() - time1);

    //     long time2 = System.currentTimeMillis();
    //     for (int i = 0; i <= 1000000; i++) {
    //         arr.remove(0);
    //     }
    //     System.out.println(System.currentTimeMillis() - time2);


    //     long time3 = System.currentTimeMillis();
    //     for (int i = 0; i <= 1000000; i++) {
    //         arr_link.remove(0);
    //     }
    //     System.out.println(System.currentTimeMillis() - time3);
    // }









    
    /*
    Задания 1
        Реализовать консольное приложение, которое:
            1. Принимает от пользователя строку вида
                text ~ num
            2. Нужно расплитить строку по ~, сохранить text в связный список на позицию num.
            3. Если введено print~num, выводит строку из позиции
               num в связном списке и удаляет её из списка.
    */

    // public static void main(String[] args) {
    //     Scanner userInput = new Scanner(System.in);
    //     System.out.println("Введите строку вида text~num: ");
    //     String userData = userInput.nextLine();
    //     LinkedList<String> userLinkedList = new LinkedList<>();
    //     while (! userData.contains("exit")){
    //         String[] tempData = userData.split("~");       
    //         if (! tempData[0].toLowerCase().contains("print") && userLinkedList.size() <= Integer.valueOf(tempData[1])){
    //             userLinkedList.set(Integer.valueOf(tempData[1]), tempData[0]);
    //         }
    //         if (tempData[0].toLowerCase().contains("print") && userLinkedList.size() <= Integer.valueOf(tempData[1])){
    //             userLinkedList.remove(Integer.parseInt(tempData[1]));
    //         }
    //         System.out.println("Текущее состоояне LinkedList: ");
    //         System.out.println(userLinkedList.toString());
    //         userData = userInput.nextLine();
    //     }
    //     userInput.close();
    // }
    





    


    /*
    Задания 2
    Реализовать консольное приложение, которое:

    1. Принимает от пользователя и “запоминает” строки.
    2. Если введено print, выводит строки так, чтобы последняя введенная 
        была первой в списке, а первая - последней.
    3. Если введено revert, удаляет предыдущую введенную строку из памяти.

    */

    // public static void main(String[] args) {
    //     boolean flag = true;
    //     Stack <String> myStack = new Stack<>();
    //     Scanner scan = new Scanner(System.in);
    //     String inputString;
    //     while (flag){

    //         System.out.println("Введите строку");
    //         inputString = scan.nextLine();

    //         if (inputString.equals("exit")) {
    //             flag = false;
    //         } else if (inputString.equals("print")) {
    //             for (int i = 0; i < myStack.size(); i++) {
    //                 System.out.print(myStack.get(myStack.size() - i - 1));
    //             }
    //         } else if (inputString.equals("revert")) {
    //             myStack.pop();
    //         } else {
    //             myStack.add(inputString);
    //         }
    //     }
    // }





    /*
    * Задания 3
    1. Написать метод, который принимает массив элементов, 
       помещает их в стэк и выводит на консоль содержимое стэка.
    2. Написать метод, который принимает массив элементов, 
       помещает их в очередь и выводит на консоль содержимое очереди.
 
    */

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Введите слова через пробел: ");
    //     String input = sc.nextLine();
    //     String[] inpuArray = input.split(" ");
    //     System.out.println(Arrays.toString(inpuArray));
    //     Stack <String> stackInput = new Stack <>();
    //     for (String s : inpuArray) {
    //         stackInput.add(s);
    //     }
    //     System.out.println(stackInput);

    //     Queue<String> queueInput = new LinkedList<>();
    //     for (String s : inpuArray) {
    //         queueInput.add(s);
    //     }
    //     System.out.println(queueInput);
    // }





    /*
    * Задания 4
    1. Реализовать стэк с помощью массива. 
        Нужно реализовать методы:
        size(), empty(), push(), peek(), pop().
    */

    // public static void main(String[] args) {
    //     int[] testArray = new int[] {0,1,2,3,4,5,6,7,8,9};
    //     System.out.println(size(testArray));
    //     System.out.println(empty(testArray));
    //     System.out.println(Arrays.toString(push(testArray, -1)));
    //     System.out.println(peek(testArray));
    //     System.out.println(Arrays.toString(pop(testArray)));
    // }
    
    // // Размер стека
    // static public int size(int[] arg) {
    //     return arg.length;
    // }


    // // проверяет пустой
    // static public boolean empty(int[] arg) {
    //     return arg.length == 0;
    // }

    // // добавляет новый элемент на вверх
    // static public int[] push(int[] arg, int value) {
    //     int[] argTemp = new int[arg.length + 1];

    //     for (int i = 0; i < arg.length; i++) {
    //         argTemp[i] = arg[i];
    //     }
    //     argTemp[argTemp.length - 1] = value;

    //     return argTemp;
    // }

    // // возвращает верхний элемент
    // static public int peek(int[] arg) {
    //     return arg[arg.length - 1];
    // }
    

    // // удаляет верхний элемент
    // static public int[] pop(int[] arg) {
    //     int[] argTemp = new int[arg.length - 1];

    //     for (int i = 0; i < arg.length - 1; i++) {
    //         argTemp[i] = arg[i];
    //     }

    //     return argTemp;
    // }





}
