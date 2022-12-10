package seminar1;
/* Вычислить n! (произведение чисел от 1 до n) */
public class task2 {
    public static void main(String[] args) {
        int n = task1.input_int("Введите число n: ");
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            mult *= i; 
        }
        System.out.println("Произведение чисел от 1 до "+ n +" равно: " + mult);
    }
}
