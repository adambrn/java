package seminar2;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class task {

    public static void main(String[] args) {

        int result = 0;

        Map<String, Integer> values = new Hashtable<String, Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String expression = scanner.nextLine();

        String[] dict = expression.split(" {0,}\\+ {0,}");
        for (String x : dict) {
            values.put(x, values.getOrDefault(x, 0) + 1);
        }

        for (String key : values.keySet()) {
            int getvalue = InputValue(scanner, "Введите значение для " + key + ": ");
            result += values.get(key) * getvalue;
        }

        System.out.print("Ответ: " + result);
        scanner.close();
    }

    public static int InputValue(Scanner scanner, String text) {
        System.out.print(text);
        String value = scanner.nextLine();
        return Integer.parseInt(value);
    }

}
