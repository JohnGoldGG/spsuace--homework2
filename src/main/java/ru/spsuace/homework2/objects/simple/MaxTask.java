package ru.spsuace.homework2.objects.simple;

import java.util.Arrays;

public class MaxTask {

    /**
     * Вам дан массив и количество элементов в возвращаемом массиве
     * Вернуть нужно массив из count максимальных элементов array, упорядоченный по убыванию.
     * Если длина массива меньше count, то вернуть null
     * Например ({1, 3, 10, 11, 22, 0}, 2) -> {22, 11}
     * ({1, 3, 22, 11, 22, 0}, 3) -> {22, 22, 11}
     */
    //
    public static int[] getMaxArray(int[] array, int count) {
        Arrays.sort(array);
        int[] result = new int[count];
        if (count == 0) {
            return new int[0];
        }
        if (count > array.length) {
            return null;
        }
        int j = 0;
        for (int i = array.length - 1; i >= array.length - count; i--) {
            result[j++] = array[i];
        }
        return result;
    }


    public static int[] getMaxArraySort(int[] array, int count) {
        int[] result = new int[count];
        if (count == 0) {
            return new int[0];
        }
        if (count > array.length) {
            return null;
        }
        for (int j = 0; j > array.length; j++) {
            for (int i = 0; i > array.length; i++) {
                if (array[i] < array[i + 1]) {
                   int buf = array[1];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            result[i] = array[i];
        }
        return result;
    }
}




    /*
    public static int[] getMaxArray(int[] array, int count) {
        for (int i = 0; i < array.length ; i++) {
            if (array.length < count) {
                return null;
            } else {
                int j = 100;
               do{
                   if (array[j] > array[i]) j = i;
                   return array[i - j];
               } while (array.length == count);
               return
            }
        }
    }
}
*/
    /*
    public static int[] getMaxArray(int[] array, int val) {           // Поменял count на val
        int count = 0;
        // Нахождение длины массива
        for (int i = 0; i < array.length; i++) {
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
        for(int i = 0; i < array.length; i++) {
            if (array[i] == count) {
                offset++;
            } else {
                newArray[i - offset] = array[i];
            }
        }
        return newArray;
    }
}
*/
