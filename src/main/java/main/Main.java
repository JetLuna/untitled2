package main;

import java.util.*;

public class Main {
    static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        Calculator calculator = new Calculator();
        double a = calculator.calcA(x, y);
        double b = calculator.calcB(z);

        Printer printer = new Printer();
        printer.print("a = ", a);
        printer.print("b = ", b);
        printer.printDateTime("dd.MM.uu");
    }
}
