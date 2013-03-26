package org.snow.bubblesort;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: snowhyzhang
 * Date: 13-3-26
 * Time: 下午12:29
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSortProcessor {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; ++i){
            Random ran = new Random();
            array[i] = Math.abs(ran.nextInt(100));
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        BubbleSortInteger.bubbleSort(array);
        System.out.println("After sorting:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
