package ru.spsuace.homework2.objects.simple;

import javax.swing.*;

public class MaxTask {

    /**
     * Вам дан массив и количество элементов в возвращаемом массиве
     * Вернуть нужно массив из count максимальных элементов array, упорядоченный по убыванию.
     * Если длина массива меньше count, то вернуть null
     * Например ({1, 3, 10, 11, 22, 0}, 2) -> {22, 11}
     * ({1, 3, 22, 11, 22, 0}, 3) -> {22, 22, 11}
     *
     */
    public static int[] getMaxArray(int[] array, int val) {           // Поменял count на val
        int count = 0;
        // Нахождение длины массива
        for (int i = 0; i < val; i++) {
            if (array[i] != val) {
                count++;
            } else {
                if (array[i] <= val){   // Если длина массива меньше count, то вернуть null
                    return null;
                }
            }
        }

        int[] newArray = new int[val];
        int offset = 0;
        // Запись в нвоый массив
        for(int i = 0; i < val; i++) {
            if (array[i] == count) {
                offset++;
            } else {
                newArray[i - offset] = array[i];
            }
        }
        return newArray;
    }
}
