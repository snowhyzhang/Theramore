package org.snow.quicksort;

/**
 * Created with IntelliJ IDEA.
 * User: snowhyzhang
 * Date: 13-3-24
 * Time: 下午10:30
 * To change this template use File | Settings | File Templates.
 */
public class QuickSortInteger {

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int less, int great){

        if (less >= great){
            return;
        }

        int index = less;
        int pivot = array[index];

        swap(array, index, great);
        for (int i = less; i < great; i++) {
            if (array[i] < pivot){
                swap(array, i, index);
                ++index;
            }
        }
        swap(array, index, great);

        quickSort(array, less, index - 1);
        quickSort(array, index + 1, great);
    }

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
