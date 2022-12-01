package java_Lesson.seminars.Lesson_0002.Homework;

import java.util.logging.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

/* 2. Реализуйте алгоритм сортировки пузырьком числового массива, 
      результат после каждой итерации запишите в лог-файл.
 */


public class task002 {
    static Scanner scanner = new Scanner(System.in);
    static Logger logger = Logger.getLogger(task002.class.getName());
    static Random random = new Random();

    public static void main(String[] args) throws IOException{
        FileHandler fh = new FileHandler("java_Lesson/seminars/Lesson_0002/Homework/log_bub.txt", true);
        logger.setUseParentHandlers(false);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info("Запуск");
        int size = 8;
        int[] array = new int[size];
        FillArray(array);
        PrintArrayMin(array);
        PrintArrayMax(array);
        scanner.close();
    }

    // Заполнения массива
    public static void FillArray(int[] currentArray){
        logger.info("FillArray");
        System.out.printf("Задаём массив:\n");
        for(int i = 0; i < currentArray.length; i++){
            currentArray[i] = random.nextInt(100);
            System.out.printf(" %d ", currentArray[i]);
        }
    }

    // Отсортированный массив от Min до Max
    public static void PrintArrayMin(int[] array){
        logger.info("PrintArrayMin");
        System.out.printf("\nВывод отсортированный массив от Min до Max:\n");
        for (int i = 0; i < array.length; i++){
            int minPosition = i;
            for(int j = i + 1; j < array.length; j++){
                if (array[j] < array[minPosition]){
                    minPosition = j;
                }
            }
            int temp = array[i];
            array[i] = array[minPosition];
            array[minPosition] = temp;
            System.out.printf(" %d ", array[i]);
        }
    }

    // Отсортированный массив от Max до Min
    public static void PrintArrayMax(int[] array){
        System.out.printf("\nВывод отсортированный массив от Max до Min:\n");
        for (int i = 0; i < array.length; i++){
            int maxPosition = i;
            for(int j = i + 1; j < array.length; j++){
                if (array[j] > array[maxPosition]){
                    maxPosition = j;
                }
            }                                   
            int temp = array[i];
            array[i] = array[maxPosition];
            array[maxPosition] = temp;
            System.out.printf(" %d ", array[i]);
        }
    }
    
}

