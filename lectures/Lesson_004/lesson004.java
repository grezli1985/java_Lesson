package java_Lesson.lectures.Lesson_004;
import java.util.*;


public class lesson004 {
    
    
    /* Приоритетные коллекции 
     * Хранение и обработка данных, чаcть I
    */

    /* У меня есть план
        1. Разобраться, зачем нужно столько коллекций и JCF 
        2. LinkedList и особенности работы с ним
        3. Узнать о списках, как об абстрактной структуре
        4. Проблемы работы со списками и массивами
        5. Построение разных Queue и как в этом помогает JCF
        6. Deque и логика использования этой коллекции
        7. То, что мертво, умереть не может – Stack в контексте JCF     */


        /* Зачем разные коллекции? */

        /*  1. Способ обработки данных
            2. Решаемые задачи     */


        /* LinkedList */

        /* Представляет собой двусвязный список.
            Список – гибкая структура данных, позволяющая легко 
            менять свой размер. Элементы доступны для вставки или 
            удаления в любой позиции. */

            /*  Массив 
                Связный список  */



        /* LinkedList. Список */


        /*  Чем такой способ организации лучше? Или хуже?

            Проблема добавления в массив.

            Проблема удаления из массива. */

        /* Попробуйте написать такой код – отсылка к предыдущим лекциям.

            В качестве тренировки попробуйте добавить 
            элемент не в хвост. 
            
            Добавление в конец списка. */


        /*  Чем такой способ организации лучше? Или хуже?

            Добавление в середину списка.  
            
            Удаление из списка списка.

            Что нам с этого?
            Количество операций меньше => скорость доступа к данным выше.

            Всегда ли? Доступ к элементу.  */


            /* Односвязный список.

            Двусвязный список.  */

            /* Мотивация.

            LinkedList нужен для небольшого количества 
            элементов, в которых операции добавления\удаления 
            встречаются чаще операций чтения. */

            /* Чем такой способ организации лучше? Или хуже?

            Потренируйтесь с операциями добавления\удаление 
            в двусвязном и циклическом списках. */





            /*  Queue  */

        /* Очередь в магазине */

        // Queue<Integer> queue = new LinkedList<Integer>();
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // queue.add(4);
        // int item = queue.remove();
        // queue.add(5);
        // queue.add(28);
        // int item = queue.remove();



    // public static void main(String[] args) {
    //     Queue<Integer> queue = new LinkedList<Integer>();
    //     queue.add(1);
    //     queue.add(2);
    //     queue.add(3);
    //     queue.add(4);
    //     System.out.println(queue); // [1, 2, 3, 4]
    //     int item = queue.remove();
    //     System.out.println(queue); // [2, 3, 4]
    //     queue.offer(2809);
    //     item = queue.remove();
    //     System.out.println(queue); // [3, 4, 2809]
    //     item = queue.remove();
    //     System.out.println(queue); // [4, 2809]
    //     item = queue.poll();
    //     System.out.println(queue); // [2809]
    // }
    


//     import java.util.*;
// public class Ex002_Queue {
//     public static void main(String[] args) {
//         Queue<Integer> queue = new LinkedList<Integer>();
//         queue.add(1);
//         int item = queue.remove();
//         queue.offer(2809);
//         item = queue.poll();
//         System.out.println(queue);

//         queue.remove(2809); // зачем очередь??
//         queue.element()
//         queue.peek()



        /* Иерархия коллекций */

        /*  PriorityQueue   */

        /* Наивысший приоритет имеет «наименьший» элемент. */



        /*  Deque – double ended queue   */

        /* Линейная коллекция, которая поддерживает вставку и 
            удаление элементов на обоих концах. | url */
            // import java.util.*;
            // public class Ex003_Deque {
            //    public static void main(String[] args) {
            //        Deque<Integer> deque = new ArrayDeque<>();
            //        Deque<Integer> deque = new ArrayDeque<>();
            //        deque.addFirst(1);   deque.addLast(2);
            //        deque.removeLast();  deque.removeLast();
            //        deque.offerFirst(1); deque.offerLast(2);
            //        deque.pollFirst();   deque.pollLast();
            //        deque.getFirst();    deque.getLast();
            //        deque.peekFirst();   deque.peekLast();
            //    }
            // }
            



        /* Stack */

        /* Иерархия коллекций */

        /* Stack представляет собой обработку данных по принципу LIFO.
        Расширяет Vector пятью операциями, 
        которые позволяют рассматривать вектор как стек.

        push(E item)
        pop()
        */

        // import java.util.*;
        // public class Ex004_Stack {
        //    public static void main(String[] args) {
        //        Stack<Integer> stack = new Stack<>();
        //        stack.push(1);
        //        stack.push(12);
        //        stack.push(123);
        //        System.out.println(stack.pop()); // 123
        //        System.out.println(stack.pop()); // 12
        //        System.out.println(stack.pop()); // 1
        //    }
        // }

            /* Stack и Vector не рекомендованы к использованию   */



            /* Вычислить значение выражения в постфиксной форме записи

                1 + 2 * 3		(1 + 2) * 3
                1 2 3 * +		1 2 + 3 *

                                     					СТЕК
                                     					  7
             */
  






}