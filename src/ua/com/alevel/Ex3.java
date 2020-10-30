package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//когда не дочитала условия и обрадовалась что так легко )

public class Ex3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вычисляем площадь треугольника");
        System.out.println("Введите первую сторону треугольника:");
        double a = Integer.parseInt(reader.readLine());
        System.out.println("Введите вторую сторону треугольника:");
        double b = Integer.parseInt(reader.readLine());
        System.out.println("Введите третью сторону треугольника:");
        double c = Integer.parseInt(reader.readLine());
        double p = (a + b + c) / 2;
        System.out.println("Площадь треугольника равна:" + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}
