package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Exersize1 {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int[] inPutArray() throws IOException {
        System.out.println("Введите количество элементов массива");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Заполните массив целыми числами");
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    int counter(int[] ints) {
        int unigue = 0;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < ints.length; i++) {
            set.add(ints[i]);
        }
        unigue = set.size();
        return unigue;
    }
}