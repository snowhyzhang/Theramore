package org.snow.mergesort;

/**
 * Created with IntelliJ IDEA.
 * User: snowhyzhang
 * Date: 13-3-25
 * Time: 上午10:42
 * To change this template use File | Settings | File Templates.
 */
public class MergeSortInteger {
    public static int[] mergeSort(int[] array){
        if (array.length <= 1){
            return array;
        }

        int mid = array.length/2;

        int[] arrayLeft = new int[array.length/2];
        System.arraycopy(array, 0, arrayLeft, 0, mid);

        int[] arrayRight;
        if (array.length % 2 == 0){
            arrayRight = new int[array.length/2];
            System.arraycopy(array, mid, arrayRight, 0, mid);
        } else {
            arrayRight = new int[array.length/2 + 1];
            System.arraycopy(array, mid, arrayRight, 0, mid + 1);
        }

        int[] arrayLeftSort = mergeSort(arrayLeft);
        int[] arrayRightSort = mergeSort(arrayRight);

        return merge(arrayLeftSort, arrayRightSort);
    }

    private static int[] merge(int[] arrayLeft, int[] arrayRight){
        int[] array = new int[arrayLeft.length + arrayRight.length];
        int left = 0;
        int right = 0;
        int index = 0;

        while (left < arrayLeft.length && right < arrayRight.length){
            if(arrayLeft[left] <= arrayRight[right]){
                array[index] = arrayLeft[left];
                ++left;
            } else {
                array[index] = arrayRight[right];
                ++right;
            }
            ++index;
        }

        for (int i = left; i < arrayLeft.length; i++) {
            array[index] = arrayLeft[i];
            ++index;
        }

        for (int i = right; i < arrayRight.length; i++){
            array[index] = arrayRight[i];
            ++index;
        }

        return array;
    }
}
