package java_Lesson.lectures.Lesson_001.java_project;

/**
 * program   Настройка рабочего места
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        // System.out.println("bye world");           // bye world
        // System.out.println("Goodbye world");       // Goodbye world
        
        // String s = "    2";                        //     2
        // String s = null;                           // null
        

        /*   Типы данных и переменные
               примитивные
            boolean
            int, short, long и т.д.
            float, double
            Char
        */ 

        // целые 

        // short age = 10;
        // int salary = 123456;
        // System.out.println(age);                    //10
        // System.out.println(salary);                 //123456

        // Вещественные
        
        // float e = 2.7f;        // flot - имеет суфикс f
        // double pi = 3.1415;    // double - стоит по умолчанию, не ставят суфикс
        // System.out.println(e);                         // 2.7
        // System.out.println(pi);                        // 3.1415

        // float f = 123.45f;
        // double d = 123.45D;     // double - суфикс не обязателен
        // System.out.println(f);                         // 123.45
        // System.out.println(d);                         // 123.45



        // типы данных char

        // char cha = '{';                                             // {
        // char cha = 123;  // неявное преобразования не указываем тип // {
        // System.out.println(cha);

        // int a = 13;
        // double b = a;   // преобразовать получиться int в double
        // a = b;          // обратно нет


        // char ch = '1';
        // System.out.println(Character.isDigit(ch));  // true
        // ch = 'a';
        // System.out.println(Character.isDigit(ch));  // false



        // типы данных boolean


        // boolean flag1 = 123 <= 234;
        // System.out.println(flag1);                     // true
        // boolean flag2 = 123 >= 234 || flag1;
        // System.out.println(flag2);                     // true
        // boolean flag3 = flag1 ^ flag2;
        // System.out.println(flag3);                     // false

        // boolean z = true & false;
        // System.out.println(z);                            // false
        // boolean v = true && false;
        // System.out.println(v);                            // false
        // boolean w = true ^ false;
        // System.out.println(w);                            // true
        // boolean r = true ^ true;
        // System.out.println(r);                            // false


        // типы данных *Строки не так просты


        // String msg ="Hello world";
        // System.out.println(msg); // Hello world



        // Неявная типизация


        // var a = 123;
        // System.out.println(a);  // 123
        // var h = 123.456;
        // System.out.println(h);  // 123.456
        // System.out.println(getType(a));  // Integer
        // System.out.println(getType(h));  // Double
        // d = 1022;
        // System.out.println(d);  // 1022
        // //d = "mistake";
        // //error: incompatible types:
        // //String cannot be converted to double

    // }
    // static String getType(Object o){
    //     return o.getClass().getSimpleName();
    // }
        

        /* Классы-обертки

        Примитив        Обертка
         int             Integer
         short           Short
         long            Long
         byte            Byte
         float           Float
         double          Double
         char            Character
         boolean         Boolean
        */

        // System.out.println(Integer.MAX_VALUE); // 2147483647
        // System.out.println(Integer.MIN_VALUE); // -2147483648
        
        
        
            /* Операции Java
        Присваивание: =

        Арифметические: *, /, +, -, %, ++, --

        Операции сравнения: <, >, ==, !=, >=, <=

        Логические операции:  ||, &&, ^, !

        Побитовые операции <<, >>, &, |, ^
        */
        // int a = 123;
        // a++;
        // System.out.println(a);    // 124

        // int a = 123;

        // System.out.println(a++);     // 123    // постфиксный инкремент
        // System.out.println(a);       // 124

        // System.out.println(++a);     // 124     // префиксный инкремент
        // System.out.println(a);       // 124


        // // // int a = 123;
        // // a = a-- - --a;
        // // a = --a-a--;
        // System.out.println(a);




        // проверить a = a-- - --a;   a = --a-a--;  разными выводами
                // System.out.printf("%d + %f = %f", x, y, x + y);
                // int a = 1, b = 2;
                // int c = a + b;
                // String res = a + " + " + b + " = " + c;
                // System.out.println(res);










        // boolean f = 123 > 234;
        // System.out.println(f);   // false
        // boolean g = 123 <= 234;
        // System.out.println(g);   // true
        // boolean h = 123 != 234;
        // System.out.println(h);   // true


        // int a = 8;
        // // 1000
        // //a = a << 1;
        // System.out.println(a << 1);   // 16
        // //10000

        // int a = 18;
        // // 10010
        // System.out.println(a >> 1);   // 9
        // // 1001


        // int a = 5;
        // int b = 2;
        // System.out.println(a | b);      // 7
        // // 101
        // // 010
        // // 111

        // int a = 5;
        // int b = 2;
        // System.out.println(a & b);      // 0
        // // 101
        // // 010
        // // 000

        // int a = 5;
        // int b = 2;
        // System.out.println(a ^ b);      // 7
        // // 101
        // // 010
        // // 111


        // boolean a = true;
        // boolean b = true;
        // System.out.println(a & b);      // true
        // // 1
        // // 0
        // // 0

        // boolean a = true;
        // boolean b = true;
        // System.out.println(a & b);      // true
        // System.out.println(a && b);      // true




        // String s = "qwer";  // 4, 0..3
        // boolean b = s.length() >= 5 && s.charAt(4) == '1';
        
        // System.out.println(b);      // false


        // String s = "qwwe1";  // 5, 0..4
        // boolean b = s.length() >= 5 && s.charAt(4) == '1';
        
        // System.out.println(b);      // true


        // String s = "qwwe1";  // 5, 0..4
        // boolean b = s.length() >= 5 & s.charAt(4) == '1';
        
        // System.out.println(b);      // true


        // String s = "qww1";  // 4, 0..3
        // boolean b = s.length() >= 5 & s.charAt(4) == '1';
        
        // System.out.println(b);      // Exception: Index 4 out of bounds for length 4
        

        // String s = "qww1";  // 4, 0..3
        // // // boolean b = s.length() >= 5 || s.charAt(4) == '1';
        // // boolean b = s.length() >= 5 | s.charAt(4) == '1';
        
        // System.out.println(b);      //




        //   Массивы


        // Одномерные


        // int[] arr = new int[10];
        // System.out.println(arr.length); // 10

        // arr = new int[] { 1, 2, 3, 4, 5 };
        // System.out.println(arr.length); // 5



        // Многомерные

        // int[] arr[] = new int[3][5];
        // for (int[] line : arr) {
        //     for (int item : line) {
        //         System.out.printf("%d ", item);
        //     }
        //     System.out.println();
        // }

        // int[][] arr = new int[3][5];
       
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.printf("%d ", arr[i][j]);
        //     }
        //     System.out.println();
        // }


            // Преобразования


        // int i = 123; double d = i;
        // System.out.println(i);  // 123
        // System.out.println(d);  // 123.0
        // d = 3.1415; i = (int)d;
        // System.out.println(d);  // 3.1415
        // System.out.println(i);  // 3
        // d = 3.9415; i = (int)d;
        // System.out.println(d);  // 3.9415
        // System.out.println(i);  // 3
        // byte b = Byte.parseByte("123");
        // System.out.println(b);  // 123
        // b = Byte.parseByte("1234");
        // System.out.println(b);  // NumberFormatException: Value out of range

        // byte b = Byte.parseByte("127");  // byte - хранить значения 0  до 255 
        // System.out.println(b);              // 127



        // НО


        
        // int[] a = new int[10];
        // double[] d = a;   // ИЗУЧАЕМ ковариантность и контравариантность






        /*  Получение данных из терминала

                import java.util.Scanner;
                public class Program {
                    public static void main(String[] args) {
                        Scanner iScanner = new Scanner(System.in);
                        System.out.printf("name: ");
                        String name = iScanner.nextLine();
                        System.out.printf("Привет, %s!", name);
                        iScanner.close();
                    }
                }

        */
                // Строки

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!\n", name);
        // iScanner.close();

                // Некоторые примитивы

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.printf("double a: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();
        
                // Проверка на соответствие получаемого типа
                
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);       
        // int i = iScanner.nextInt();
        // System.out.println(i);       
        // iScanner.close();
         




                // Форматированный вывод



        // int a = 1, b = 2;
        // int c = a + b;
        // String res = a + " + " + b + " = " + c;
        // System.out.println(res);   // 1 + 2 = 3


        // String s = "qwe";
        // int a = 123;
        // String q = s+a;
        // System.out.println(q);   // qwe123
        // // Сколько строк мы получили? - 4 строки


        
        // int a = 1, b = 2;
        // int c = a + b;
        // String res = String.format("%d + %d = %d \n", a, b, c);
        // System.out.printf("%d + %d = %d \n", a, b, c);  // 1 + 2 = 3 
        // System.out.println(res);                   // 1 + 2 = 3 


                /*Виды спецификаторов

        %d: целочисленных значений
        %x: для вывода шестнадцатеричных чисел
        %f: для вывода чисел с плавающей точкой
        %e: для вывода чисел в экспоненциальной форме,
        например, 3.1415e+01
        %c: для вывода одиночного символа
        %s: для вывода строковых значений
                */


        // float pi = 3.1415f;
        // System.out.printf("%f\n", pi);    // 3,141500
        // System.out.printf("%.2f\n", pi);  // 3,14
        // System.out.printf("%.3f\n", pi);  // 3,141
        // System.out.printf("%e\n", pi);    // 3,141500e+00
        // System.out.printf("%.2e\n", pi);  // 3,14e+00
        // System.out.printf("%.3e\n", pi);  // 3,141e+00







                // Область видимости переменных

        // {
        //    int i = 123;
        //    System.out.println(i);           
        // }     
        // System.out.println(i);  // error: cannot find symbol




        // int b = 111;
        // {
        //     int a = 222;
        //     System.out.println(a + b);   // 333
        // }        
        // int a = 123;
        // System.out.println(a);         // 123



        /*      Функции и методы
    Функции и методы — это технически одно и то же. Функции могут 
    не принадлежать классам, а методы принадлежат. 
    В java все функции являются методами. 

    Описание
    Вызов
    Возвращаемое значение
    Рекурсия
        */

        // lib.sayHi();                              // hi!
        // System.out.println(lib.sum(1, 3));   // 4
        // System.out.println(lib.factor(5));     // 120.0






            // Управляющие конструкции


        // условный оператор

        // int a = 1;
        // int b = 2;
        // int c;
        // if (a > b) {
        //     c = a;
        // } else {
        //     c = b;
        // }
        // System.out.println(c); // 2


        // int a = 1;
        // int b = 2;
        // int c = 0;
        // if (a > b) c = a;
        // if (b > a) c = b;

        // System.out.println(c);  // 2

        
        
        // тернарный оператор

        // int a = 1;
        // int b = 2;
        // int min = a < b ? a : b;
        // System.out.println(min);   // 1



            // Оператор выбора


        // int mounth = value;
        // String text = "";
        // switch (mounth) {
        //     case 1:
        //         text = "Autumn";
        //         break;
		// ...
        //     default:
        //         text = "mistake";
        //         break;
        // }
        // System.out.println(text);
        // iScanner.close();


        // int a = 123;

        // switch (a) {
        //     case 1: 
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //         System.out.println("a");
        //         break;
        //     case 6: 
        //         System.out.println("a");
        //         break;
        //     case 10: System.out.println("b");
        //         break;
        //     default:
        //         break;
        // }





              /* Циклы

        Цикл — это многократное выполнение одинаковой 
        последовательности действий.

        В java доступны следующие циклы:
          - цикл while;
          - цикл do while;
          - цикл for; и его модификация for in
              */ 




        // int value = 321;
        // int count = 0;

        // while (value != 0) {
        //     value /= 10;
        //     count++;
        // }
        // System.out.println(count);     // 3



        // int value = 321;
        // int count = 0;

        // do {
        //     value /= 10;
        //     count++;
        // } while (value != 0);
        // System.out.println(count);   // 3



            /* continue, break
        Операторы для управления циклами — continue и break.
        Выполнение следующей итерации цикла — continue.
        Прерывание текущей итерации цикла — break. 
        * ближайшего к оператору
            */

        // for (int i = 0; i < 10; i++) {
        //     if (i % 2 == 0)
        //         continue;
        //     System.out.println(i);      // 1
        //                                 // 3
        //                                 // 5
        //                                 // 7
        //                                 // 9
        // }

        // for (int i = 0; i < 10; i++) {
        //     if (i % 2 != 0)
        //         continue;
        //     System.out.println(i);      // 0
        //                                 // 2
        //                                 // 4
        //                                 // 6
        //                                 // 8
        // }


        // for (int i = 0; i < 10; i++) {
        //     if (i % 2 != 0)
        //         break;
        //     System.out.println(i);      // 0
                                        
        // }
        


        // for (int i = 0; i < 10; i++){
        //     // break;
        //     for (int j = 0; j < 10; j++){
        //         // break;
        //     }
        //     //  break;
        // }
        



            // Оператор цикла for

        // int s = 0;
        // for (int i = 1; i <= 10; i++) {
        //     s += i;
        // }
        // System.out.println(s);  // 55


            // Вложенные циклы

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // // * * * * *
        // // * * * * *
        // // * * * * *
        // // * * * * *
        // // * * * * *

            // for :
            // Работает только для коллекций

        // int arr[] = new int[10];
        // for (int item : arr) {
        //     System.out.printf("%d ", item);
        // }
        // System.out.println();    // 0 0 0 0 0 0 0 0 0 0 

        // int[] arr = new int[] {1,2,3,4,5,77};
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = 10;
        // }
        // for (int item : arr) {
        //     System.out.println(item);
        // // 10
        // // 10
        // // 10
        // // 10
        // // 10
        // // 10
        // }


        // int[] arr = new int[] {1,2,3,4,5,77};
        // for (int item : arr) {
        //     item = 13;    
        // }
        // for (int item : arr) {
        //     System.out.println(item);
        // }
        // // 1
        // // 2
        // // 3
        // // 4
        // // 5
        // // 77








            /*  Работа с файлами
         Создание и запись\ дозапись

        import java.io.FileWriter;
        import java.io.IOException;
        public class Program {
            public static void main(String[] args) {
                try (FileWriter fw = new FileWriter("file.txt", false)) {                               
                fw.write("line 1");
                fw.append('\n');
                fw.append('2');
                fw.append('\n');
                fw.write("line 3");
                fw.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            }  
        }
            */


            /* Чтение, Вариант посимвольно
        import java.io.*;
        public class Program {
            public static void main(String[] args) throws Exception {
                FileReader fr = new FileReader("file.txt");
                int c;
                while ((c = fr.read()) != -1) {
                char ch = (char) c;
                if (ch == '\n') {
                    System.out.print(ch);
                } else {
                    System.out.print(ch);
                }
            }
        } }
 */

            /* Вариант построчно
        import java.io.*;

        public class Program {
            public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new FileReader("file.txt"));
                String str;
                while ((str = br.readLine()) != null) {
                    System.out.printf("== %s ==\n", str);
                }
                br.close();
            }
        }

            */
        


            /* Задачи для демонстрации

            Задачи для самоконтроля

        1. Задана натуральная степень k.
        Сформировать случайным образом список коэффициентов 
        (значения от 0 до 100) многочлена многочлен степени k. 
        *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0

        2. Даны два файла, в каждом из которых находится запись многочлена.
        Сформировать файл содержащий сумму многочленов.




            */








    }   
}
