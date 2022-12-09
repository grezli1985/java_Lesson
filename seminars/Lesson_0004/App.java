package java_Lesson.seminars.Lesson_0004;

import java_Lesson.seminars.Lesson_0004.ArrayStack;

public class App {
    public static void main(String[] args) {
        ArrayStack <Integer> myStack = new ArrayStack<>();
        myStack.push(9); // a
        myStack.push(3); // b
        myStack.push(8); // c
        System.out.println("Элемент вверху: " + myStack.peek()); // d
        System.out.println("Удаленный элемент: " + myStack.pop()); // e
        System.out.println("Размер стека: " + myStack.size()); // f
        System.out.println("Удаленный элемент :" + myStack.pop()); // g
        System.out.println("Элемент вверху: " + myStack.peek()); // h
        myStack.push(10); // i
        System.out.println("Стек пуст: " + myStack.empty()); // j
    }
}
