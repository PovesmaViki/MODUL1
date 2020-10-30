package ua.com.alevel;

import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.println("Введите координаты точки а");
        double x1 = con.nextDouble(), y1 = con.nextDouble();
        System.out.println("Введите координаты точки в");
        double x2 = con.nextDouble(), y2 = con.nextDouble();
        System.out.println("Введите координаты точки с");
        double x3 = con.nextDouble(), y3 = con.nextDouble();

        double a = Math.abs(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        double b = Math.abs(Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1)));
        double c = Math.abs(Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2)));

        double pp = (a + b + c) / 2;
        double s = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
        System.out.print("Площадь треугольника равна " + s);
    }

}
