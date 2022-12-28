package java_Lesson.seminars.Lesson_0006;

import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;


public class lesson_006 {
   
    /*
    * Задания 1
    1. Напишите метод, который запоолнить массив из 1000 элементов
       случайными цифрами от 0 до 24.

    2. Создайте метод, в который передайте заполненный в данном массиве
       и верните его в виде числа с плавающей запятой

    isEmpty() – проверка на пустоту.

    add(V) – добавление элемента в коллекцию.

    remove(V) – удаление элемента из коллекцию.

    contains(V) – проверка на включение элемента в коллекции.

    clear() – удаление всех элементов коллекции.

    size() – возвращает количество элементов коллекции.
    */

    // public static void main(String[] args) {
    //     Random random = new Random();
    //     int[] array = new int[1000];
    //     Set<Integer> setArray = new HashSet<>();
    //     for (int i = 0; i < array.length; i++) {
    //         array[i] = random.nextInt(100);
    //         // if (!setArray.contains(array[i])){
    //         //     setArray.add(array[i]);
    //         // }
    //         setArray.add(array[i]);
            
    //     }
    //     System.out.println(setArray);
    //     System.out.println(Arrays.toString(array));
    //     double len = setArray.size();
    //     System.out.println(len * 100 / array.length);
    // }







    /*
    * Задания 2

        1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, 
        можно использовать не все придуманные поля и методы. 
        Создайте несколько экземпляров этого класса, выведите их в консоль.

        2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat,
        выводилась его кличка, цвет и возраст (или другие параметры на 
        ваше усмотрение).



        1. Создайте множество, в котором будут храниться экземпляры класса 
        Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.

        Создайте 2 или более котов с одинаковыми параметрами в полях. 
        Поместите их во множество. Убедитесь, что все они сохранились во 
        множество.
    */

    public static void main(String[] args) {
        Random rand = new Random();
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z"); 
        Date date = new Date(System.currentTimeMillis() - 3600000); 
        System.out.println(formatter.format(date));
        
        //создание экземпляров класса кот
        cat firstCat = new cat(1, "Барсик");
        cat secondCat = new cat(2, "Борис");
        cat thirdCat = new cat(3, "Мурзик");

        //вызываем методы относительно разных объёктов
        firstCat.info();
        secondCat.parBirthDate = date;
        secondCat.info();
        thirdCat.info();

        //вызываем методы относительно разных объёктов
        thirdCat.parBirthDate = new Date(System.currentTimeMillis() - rand.nextInt(9000000)); 
        thirdCat.setVisit("Лапка болит");
        thirdCat.parBirthDate = new Date(System.currentTimeMillis() - rand.nextInt(9000000)); 
        thirdCat.setVisit("Съел дождик у ёлки");
        thirdCat.parBirthDate = new Date(System.currentTimeMillis() - rand.nextInt(9000000)); 
        thirdCat.setVisit("Сильно тупит");
        thirdCat.parVisitStory();

        //создаём HashSet c экземплярами
        HashSet<cat> myCatSet = new HashSet<>();
        myCatSet.add(firstCat);
        myCatSet.add(secondCat);
        myCatSet.add(thirdCat);

        System.out.println("*******************************************************");
        System.out.println("*******************************************************");
        System.out.println("*******************************************************");
        //новые почти одинаковые коты
        cat fourthCat = new cat(4, "Рыжик");
        cat fifthtCat = new cat(4, "Рыжик");
        myCatSet.add(fourthCat);
        myCatSet.add(fifthtCat);

        //содержимое сета
        for (cat katze : myCatSet) {
            katze.info();
        }
        System.out.println("*******************************************************");
        System.out.println("*******************************************************");
        System.out.println("*******************************************************");
        
        //перебором котов исчем одинаковые исходя из определённого метода
        for (cat cat : myCatSet) {
            if (fourthCat.equals(cat)) {
                System.out.printf("Кот %s с пародой %s эквивалентен коту %s c пародой %s \n", fourthCat.parName, fourthCat.parModel, cat.parName, cat.parModel);
            } else {
                System.out.printf("Кот %s с пародой %s НЕ эквивалентен коту %s c пародой %s \n", fourthCat.parName, fourthCat.parModel, cat.parName, cat.parModel);

            }
        }


    }
    







    
}
