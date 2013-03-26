package org.snow.quicksort;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: snowhyzhang
 * Date: 13-3-24
 * Time: 下午10:49
 * To change this template use File | Settings | File Templates.
 */
public class QuickSortProcessor {
    public static void main(String args[]){
        int[] array = new int[10];
        for (int i = 0; i < 10; ++i){
            Random ran = new Random();
            array[i] = Math.abs(ran.nextInt(100));
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        QuickSortInteger.quickSort(array);
        System.out.println("After sorting:");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
