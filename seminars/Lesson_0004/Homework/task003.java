package java_Lesson.seminars.Lesson_0004.Homework;


import java.util.*;
import java.util.logging.*;
import java.io.IOException;
import java.util.Scanner;

/*
 * 3.* В калькулятор добавьте возможность отменить последнюю операцию.
 */

public class task003 {
    static Scanner scanner = new Scanner(System.in);
    static Logger logger = Logger.getLogger(task003.class.getName());

    public static void main(String[] args) throws IOException{
        FileHandler fh = new FileHandler("java_Lesson/seminars/Lesson_0004/Homework/log_cal.txt", true);
        logger.setUseParentHandlers(false);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info("Запуск");
        // logger.log(Level.WARNING, "WARNING", new Throwable());
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат: " + result);
        logger.info(String.format("результат %d", result));
        scanner.close();
    }
 
    public static int getInt(){
        logger.info("getInt");
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
            logger.info(String.format("пользователь ввел %s", num));
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            logger.info("Вы допустили ошибку при вводе числа.");
            scanner.next();
            num = getInt();
        }
        return num;
    }
 
    public static char getOperation(){
        logger.info("getOperation");
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
            logger.info(String.format("пользователь ввел %s", operation));
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            logger.info("Вы допустили ошибку при вводе операции.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
 
    public static int calc(int num1, int num2, char operation){
        logger.info("calc");
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                logger.info("Операция не распознана.");
                result = calc(num1, num2, getOperation());
                
        }
        return result;
    }
}