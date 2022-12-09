package java_Lesson.seminars.Lesson_0004;

import java.util.EmptyStackException;

public class ArrayStack < E > {

    public static final int CAPACITY = 1000; // емкость массива по умолчанию
    private int topIndex; // индекс верхнего элемента в стеке
    private E[] data; // общий массив, используемый для хранения

    public ArrayStack() {
        this(CAPACITY);
    } // создает стек с емкостью по умолчанию

    public ArrayStack(int capacity) { // строит стопку заданной емкости
        topIndex = -1;
        data = (E[]) new Object[capacity]; // безопасный бросок; компилятор может выдать предупреждение
    }

    public int size() {
        return (topIndex + 1);
    }

    public boolean empty() {
        return (topIndex == -1);
    }

    public void push(E e) throws IllegalStateException {
        if (size() == data.length) throw new IllegalStateException("Stack is full");
        data[++topIndex] = e; // увеличить topIndex перед сохранением нового элемента
    }

    public E peek() throws EmptyStackException {
        if (empty()) throw new EmptyStackException();
        return data[topIndex];
    }

    public E pop() throws EmptyStackException {
        if (empty()) throw new EmptyStackException();
        E answer = data[topIndex];
        data[topIndex] = null; // разыменование, чтобы помочь сборке мусора
        topIndex--;
        return answer;
    }
}


