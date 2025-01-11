package Lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Целочисленные операции\nВведите два числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        IOperation[] operations = { new DIV(), new MOD(), new GCD(), new LCM() };

        for (IOperation op : operations) {
            System.out.print(op.getConnotation() + " ");
            System.out.println(a + op.getName() + b);
            System.out.println("Результат : "+op.estimate(a,b));
        }


    }
}
