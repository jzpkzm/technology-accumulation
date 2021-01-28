package sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: jizongpeng
 * @Date: 2021/1/27 17:34
 * @Version: 1.0
 * @Description: 归并排序 ：https://mp.weixin.qq.com/s/QyXIUMHnv23aJTZEvCGg8Q
 */
public class MergeSort {
    public void mergeSort(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(a, start, mid);
        mergeSort(a, mid + 1, end);

        merge(a, start, mid, end);
    }

    private void merge(int[] a, int start, int mid, int end) {
        int[] tmpArray = new int[end - start + 1];
        int p1 = start, p2 = mid + 1, p = 0;

        while (p1 <= mid && p2 <= end) {
            tmpArray[p++] = a[p1] <= a[p2] ? a[p1++] : a[p2++];
        }

        while (p1 <= mid) {
            tmpArray[p++] = a[p1++];
        }

        while (p2 <= end) {
            tmpArray[p++] = a[p2++];
        }

        for (int i = 0 ; i < tmpArray.length; i++) {
            a[i + start] = tmpArray[i];
        }
    }

    @Test
    public void test() {
        int[] a = {5,8,6,3,9,2,1,7};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
