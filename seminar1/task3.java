package seminar1;
/* Вывести все простые числа от 1 до 1000 
(простые числа - это числа которые делятся только на себя и на единицу без остатка. 
Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице) */

public class task3 {
    public static void main(String[] args) {

        for (int index = 1; index <= 1000; index++) {
            
            if (isprime(index)) {
                System.out.print(index + " ");
            }
        }
    }

    private static boolean isprime(int num) {
        boolean flag = true;
        if (num % 2 == 0) {
            flag = false;
        } else {
            for (int i = 3; i <= num - 1; i = i + 2) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
