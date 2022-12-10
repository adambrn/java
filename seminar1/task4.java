package seminar1;

import java.util.Scanner;

/* Реализовать простой калькулятор 
("введите первое число"... "Введите второе число"... "укажите операцию, которую надо выполнить с этими числами"... "ответ: ...") */
public class task4 {
    public static void main(String[] args) {
        int num1 = task1.input_int("Введите первое число: ");
        int num2 = task1.input_int("Введите второе число: ");
        
        System.out.print("Укажите операцию, которую надо выполнить с этими числами: ");
        Scanner scanner = new Scanner(System.in);
        String operstring = scanner.nextLine();
        char operchar = operstring.charAt(0);
        System.out.println("Ответ: " + calc(num1, num2, operchar)); 

    }
    public static double calc(int a, int b, char oper){
        if (oper == '-') {
            return a - b;
        }
        else if (oper == '+') {
            return a+b;
        }
        else if (oper == '-') {
            return a - b;
        }
        else if (oper == '*') {
            return a * b;
        }
        else if (oper == '/') {
            return a / b;
        }
        else {
            System.out.println("Неверная операция");
        }
        return 0;
    }
}
