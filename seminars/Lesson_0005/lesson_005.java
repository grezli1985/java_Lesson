package java_Lesson.seminars.Lesson_0005;

import java.nio.channels.FileChannel.MapMode;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class lesson_005 {
    /*
    * Задания 0
    1.  Создай структуру для хранения Номеров паспорта и Фамилий
        сотрудников организации.
            123456 Иванов
            321456 Васильев
            234561 Петрова
            234432 Иванов
            654321 Петрова
            345678 Иванов
    2.  Вывести данные по сотрудникам с фамилией Иванов.
    */

    // public static void main(String[] args) {
    //     Map <Integer, String> spisok = new HashMap<>();
    //     spisok.put(123456, "Иванов");
    //     spisok.put(321456, "Васильев");
    //     spisok.put(234561, "Петрова");
    //     spisok.put(234432, "Иванов");
    //     spisok.put(654321, "Петрова");
    //     spisok.put(345678, "Иванов");

    //     for (Integer item : spisok.keySet()) {
    //         if (spisok.get(item) == "Иванов"){
    //             System.out.println(item + " = " + spisok.get(item));
    //         }
    //     }
    // }










    /*
    * Задания 1
    Даны 2 строки, написать метод, который вернет true, 
    если эти строки являются изоморфными и false, если нет. 
    Строки изоморфны, если одну букву в первом слове можно 
    заменить на некоторую букву во втором слове, при этом

        1. повторяющиеся буквы одного слова меняются на одну и ту же 
           букву с сохранением порядка следования. 
           (Например, add - egg изоморфны)

        2. буква может не меняться, а остаться такой же. (Например, note - code)
            
            Пример 1:
            Input: s = "foo", t = "bar"
            Output: false

            Пример 2:
            Input: s = "paper", t = "title"
            Output: true
    */

    // public static void main(String[] args) {
    //     Scanner userInput = new Scanner(System.in);
    //     System.out.println("Введите первое слово: ");
    //     String word1 = userInput.nextLine().toLowerCase();
    //     System.out.println("Введите второе слово: ");
    //     String word2 = userInput.nextLine().toLowerCase();
        
    //     char[] word1Char = word1.toCharArray();
    //     char[] word2Char = word2.toCharArray();
        
    //     boolean wrongInput = word1.length() != word2.length();
        
    //     Map <Integer, String> tempValues = new HashMap<>();
    //     ArrayList<Character> tempLetters = new ArrayList<Character>();

    //     if (! wrongInput) {
    //         String tempWord1 = word1; 
    //         for (int i = 0; i < word2.length(); i++) {
    //             if (! tempLetters.contains(word2Char[i])) {
    //                 tempWord1 = tempWord1.replace(word1Char[i], word2Char[i]);
    //                 tempValues.put(i, tempWord1);
    //                 tempLetters.add(word2Char[i]);
    //             }
    //         }
    //         wrongInput = ! tempValues.containsValue(word2);
    //     }

    //     if (wrongInput) {
    //         System.out.printf("Слово %s не является изоморфом слова %s", word1, word2);
    //     }
    //     else {
    //         System.out.printf("Слово %s является изоморфом слова %s", word1, word2);
    //     }

    //     userInput.close();
    // }














    /*
    * Задания 2
    Написать программу, определяющую правильность расстановки скобок в выражении.
        Пример 1: a+(d*3) - истина
        Пример 2: [a+(1*3) - ложь
        Пример 3: [6+(3*3)] - истина
        Пример 4: {a}[+]{(d*3)} - истина
        Пример 5: <{a}+{(d*3)}> - истина
        Пример 6: {a+]}{(d*3)} - ложь
    */

    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);

    //     char[] start = scan.nextLine().toCharArray();

    //     Map <Character, Character> iff = new HashMap<>();
    //     iff.put('(', ')');
    //     iff.put('[', ']');
    //     iff.put('{', '}');
    //     iff.put('<', '>');

    //     Stack<Character> wer = new Stack<>();

    //     for (char item : start) {
    //         if (iff.containsKey(item)){
    //             wer.push(item);
    //             System.out.println(wer);
    //         }
    //         if (iff.containsValue(item) && wer.empty()){
    //             wer.push('h');
    //             System.out.println(wer);
    //             break;
    //         }
    //         else {
    //             if ((!wer.empty()) && iff.containsValue(item)){
    //                 if (iff.get(wer.peek()) == item){
    //                     wer.pop();
    //                     System.out.println(wer);
    //                 }
    //                 else {
    //                     wer.push('h');
    //                     System.out.println(wer);
    //                     break;
    //                 }
    //             }
    //         }
    //     }
    //     System.out.println(wer.empty());
    // }











    /*
    * Задания 3
        Написать метод, который переведет число из 
        римского формата записи в арабский. 
            Например, MMXXII = 2022

            http://graecolatini.bsu.by/htm-different/num-converter-roman.htm
            I = 1; V = 5; X = 10; L = 50; C = 100; D = 500; M = 1000
            
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        Map<Character, Integer> res = new HashMap<>();
        char[] input = scanner.nextLine().toLowerCase().toCharArray();
        char sumbol = ' ';
        char[] shablon = new char[] {'i', 'v', 'x', 'l', 'c', 'd', 'm'};

        for (char s : input) {
            if ((sumbol != ' ') && (Arrays.asList(shablon).indexOf(s) <= Arrays.asList(shablon).indexOf(sumbol))){
                if (res.containsKey(s)){
                    res.put(s, res.get(s) + 1);
                } 
                else {
                    res.put(s, 1);
                }
            }
            else if (sumbol != ' '){
                res.put(sumbol, -1);
                if (res.containsKey(s)){
                    res.put(s, res.get(s) + 1);
                } 
                else {
                    res.put(s, 1);
                }
            }
            else {
                res.put(s, 1);
            }
            sumbol = s;   
        }
        
        int answer = 0;
        for (Character e : res.keySet()) {
            if (e == 'm'){
                answer += res.get(e) * 1000;
            }
            else if (e == 'x'){
                answer += res.get(e) * 10;
            }
            else if (e == 'i'){
                answer += res.get(e);
            }
        }
        System.out.println(answer);
    }
















    // /*
    // * Задания 4
    
    // */

    // public static void main(String[] args) {
        
    // }







}
