package org.snow.bubblesort;

/**
 * Created with IntelliJ IDEA.
 * User: snowhyzhang
 * Date: 13-3-26
 * Time: 下午12:22
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSortInteger {
    public static void bubbleSort(int[] array){
        for (int i = array.length; i > 0; --i) {
            for (int j = 0; j < i - 1; ++j){
                if (array[j] > array[j + 1]){
                    swap(array, j ,j +1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
