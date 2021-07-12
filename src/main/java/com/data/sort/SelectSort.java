package com.data.sort;

import java.util.Arrays;

/**
 * 2.选择排序
 * 选择排序是一种简单直观的排序算法，无论什么数据进去都是 O(n²) 的时间复杂度。所以用到它的时候，数据规模越小越好。
 * 唯一的好处可能就是不占用额外的内存空间了吧。
 * 算法步骤
 * 1.首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
 * 2.再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 3.重复第二步，直到所有元素均排序完毕。
 */
public class SelectSort {

    public static void main(String[] args){
        int[] arr = {1,5,2,6,7};
        //偶数个数得到中间的索引 arr.length/2-1
        //奇数个数得到中间的索引 arr.length/2
        System.out.print(arr.length/2);
    }

    public int[] sort(int[] sourceArray) throws Exception {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        // 总共要经过 N-1 轮比较
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            // 每轮需要比较的次数 N-i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    // 记录目前能找到的最小值元素的下标
                    min = j;
                }
            }

            // 将找到的最小值和i位置所在的值进行交换
            if (i != min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }

        }
        return arr;
    }
}
