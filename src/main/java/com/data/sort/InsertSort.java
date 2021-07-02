package com.data.sort;

import java.util.Arrays;

/**
 * 插入排序
 * 顺序表和链表的表现形式不一样
 */
public class InsertSort {

    public static void main(String[] args){
        int[] arr = {10,3,9,7,8,6,2};
        System.out.print(Arrays.toString(insertSort(arr)));
    }
    /**
     * 直接插入法
     * @param arr
     * @return
     */
    public static int[] insertSort(int[] arr){
        int temp;
        for(int i=1;i<arr.length;i++){
            temp = arr[i];
            for(int j = i-1;j>=0&&temp<arr[j];--j){
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        return  arr;
    }

    /**
     * 折半插入排序
     */
    public static int[] binaryInsertSort(int[] arr){

        return arr;
    }


}