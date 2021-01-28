package sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: jizongpeng
 * @Date: 2021/1/27 15:10
 * @Version: 1.0
 * @Description: 插入排序 ：https://mp.weixin.qq.com/s/FVOllQoELEK3rvjpdLAxIQ
 */
public class InsertSort {

    /**
     * 升序
     * @param a
     */
    public void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i - 1;
            //a[i]即待排序的元素
            for (; j >= 0 && current < a[j]; j--) {
                a[j + 1] = a[j];
            }

            a[j + 1] = current;
        }
    }

    /**
     * 降序
     * @param a
     */
    public void insertSort2(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i - 1;
            //a[i]即待排序的元素
            for (; j >= 0 && current > a[j]; j--) {
                a[j + 1] = a[j];
            }

            a[j + 1] = current;
        }
    }

    @Test
    public void test() {
        int[] array = {3,2,8,5,3,2,1,9,7};
        insertSort2(array);

        System.out.println(Arrays.toString(array));
    }
}
