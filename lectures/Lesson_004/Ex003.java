package java_Lesson.lectures.Lesson_004;

import java.util.*;

public class Ex003 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); 
        deque.addLast(2);
        // deque.removeLast();   //удаления с первого элемента
        // deque.removeLast();
        // System.out.println(deque);
        // deque.offerFirst(1); 
        // deque.offerLast(2);
        // deque.pollFirst(); 
        // deque.pollLast();
        // System.out.println(deque);
        // deque.getFirst(); 
        // deque.getLast();
        // deque.peekFirst(); 
        // deque.peekLast();
        System.out.println(deque);
    }
}