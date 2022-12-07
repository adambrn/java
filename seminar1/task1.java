package seminar1;
/* Вычислить n-ое треугольного число(сумма чисел от 1 до n) */

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int n = input_int();
        int res = n*(n+1)/2;
        System.out.println("Треугольное число для " + n +": " + res);
    }
    public static int input_int(){
        String nstring ;
        System.out.println("Введите число n: ");
        try (Scanner scanner = new Scanner(System.in)) {
             nstring = scanner.nextLine();
        }
        int value = Integer.parseInt(nstring);
        return value;
    }
}
