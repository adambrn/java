package seminar1;
/* Вычислить n-ое треугольного число(сумма чисел от 1 до n) */

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int n = input_int("Введите число n: ");
        int res = n*(n+1)/2;
        System.out.println("Треугольное число для " + n +": " + res);
    }
    public static int input_int(String text){
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.close();
        return value;
    }
}
