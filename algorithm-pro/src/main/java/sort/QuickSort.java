package sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: jizongpeng
 * @Date: 2021/1/26 19:40
 * @Version: 1.0
 * @Description: 快速排序 基本思想是：https://mp.weixin.qq.com/s/FVOllQoELEK3rvjpdLAxIQ
 *
 * 通过一趟排序将要排序的数据分割成独立的两部分：分割点左边都是比它小的数，右边都是比它大的数。
 *
 * 然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 */
public class QuickSort {

    public int division(int[] a, int left, int right) {

        int base = a[left];

        while (left < right) {
            while ( left < right && a[right] > base) {right--;};
            a[left] = a[right];

            while ( left < right && a[left] <= base) {left++;};
            a[right] = a[left];
        }

        a[left] = base;

        return left;
    }

    public void quickSort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }

        int index = division(a, left, right);

        quickSort(a, left, index - 1);

        quickSort(a, index + 1, right);
    }

    @Test
    public void test() {
        int[] array = {3,2,8,5,3,2,1,9,7};
        quickSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }
}
