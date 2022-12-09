package java_Lesson.seminars.Lesson_0004.Homework;

import java.util.LinkedList;

/*
 * 1. Пусть дан LinkedList с несколькими элементами. 
 *    Реализуйте метод, который вернет “перевернутый” список.
 */

public class task001 {
    public static void main(String[] args) {
        LinkedList<String> linkedli = new LinkedList<String>();

        linkedli.add("Аргентина");
        linkedli.add("манит");
        linkedli.add("негра");

        System.out.print("до реверса: " + linkedli);
        linkedli = reverseLinkedList(linkedli);
        System.out.print("\nпосле реверса: " + linkedli);

    }


    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist){
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {
            revLinkedList.add(llist.get(i));
        }
        return revLinkedList;
    }
}
