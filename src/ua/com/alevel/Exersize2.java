package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Exercise2 {
    private static boolean isPosibleMovesOnBoard(int posX, int posY, int newX, int newY) throws IOException {
        return ((newX == posX - 1 && newY == posY - 2) || (newY == posX - 2 && newY == posY + 1)
                || (newX == posX - 2 && newY == posY + 1) || (newX == posX + 1 && newY == posY - 2)
                || (newX == posX - 1 && newY == posY + 2) || (newX == posX + 2 && newY == posY - 1)
                || (newX == posX + 1 && newY == posY + 2) || (newX == posX + 2 && newY == posY + 1));
    }

    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Введите начальную позицию коня по оси Х:");
            int posX = Integer.parseInt(reader.readLine());
            System.out.println("Введите начальную позицию коня по оси Y: ");
            int posY = Integer.parseInt(reader.readLine());
            System.out.println("Введите свой  ход по оси X: ");
            int newX = Integer.parseInt(reader.readLine());
            System.out.println("Введите свой ход по оси Y: ");
            int newY = Integer.parseInt(reader.readLine());
            boolean isPosibleMovesOnBoard = isPosibleMovesOnBoard(posX, posY, newX, newY);
            if (isPosibleMovesOnBoard) {
                System.out.println("Ход верный!");
            } else {
                System.out.println("Ход не верный!");
            }
        }
    }
}

