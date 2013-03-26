package org.snow.mergesort;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: snowhyzhang
 * Date: 13-3-25
 * Time: 上午11:00
 * To change this template use File | Settings | File Templates.
 */
public class MerSortProcessor {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; ++i){
            Random ran = new Random();
            array[i] = Math.abs(ran.nextInt(100));
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        int[] sortedArray = MergeSortInteger.mergeSort(array);
        System.out.println("After sorting:");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + "\t");
        }
    }
}
