package com.nitere.cloud.interviews.algorithems.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 排序算法
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 3, 8, 4, 2, 7, 1, 6));
        quickSort(arr,0,4);
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    // 選擇排序法
    public static void selectSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        System.out.print(Arrays.toString(arr));

    }

    /**
     * 每一輪從左到右比較相鄰兩個數
     * <p>
     * 如果前面比後面大，就把它們交換位置
     * <p>
     * 這樣「大的數」會一點一點被交換到右邊，就像氣泡往上浮
     * 每一輪循環之後都把大的元素排好到了後面!!!!!!!!!!!
     * [5,3,2,4,2]
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) { //不用碰最後一個元素
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        System.out.print(Arrays.toString(arr));

    }


    public static void quickSort(int[] arr, int left, int right) {
        if (left > right)
            return;
        int pivoitIndex = partition(arr, left, right);
        quickSort(arr, left, pivoitIndex - 1);
        quickSort(arr, pivoitIndex + 1, right);
    }

    // Lomuto 分割法（pivot 取最後一個元素）
    //把 pivot 放到正確的位置，並保證：左邊都比它小，右邊都比它大或等於。

    /**
     * 在區間 arr[left..right] 裡，選最後一個元素當 pivot，
     * 然後把所有「小於 pivot」的元素移到左邊，
     * 最後讓 pivot 站到「中間」那個正確位置，並把這個位置的 index 回傳。
     */
    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;
        for(int j = i; j<arr.length - 1; j++) {
            if(arr[j] < pivot) {
                swap(arr, i,j);
                i++;
            }
        }
        swap(arr,i,right);
        return i;

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void quickSortSimple(List<Integer> list) {
        if(list.size()<=1)return;
        //將最後一個元素選爲pivot
        int pivot = list.get(list.size() - 1);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        //因爲組後一個是pivot,所以只需要迭代到size -2
        for(int i = 0; i< list.size() - 1; i++) {
            int val =  list.get(i);
            if(val < pivot)
                left.add(val);
            else right.add(val);
        }

        quickSortSimple(left);
        quickSortSimple(right);

        list.clear();
        list.addAll(left);
        list.add(pivot);
        list.addAll(right);

    }




}
