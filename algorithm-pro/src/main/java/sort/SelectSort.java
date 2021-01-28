package sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Author: jizongpeng
 * @Date: 2021/1/27 11:26
 * @Version: 1.0
 * @Description: 选择排序：https://mp.weixin.qq.com/s/FVOllQoELEK3rvjpdLAxIQ
 *
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
 *
 * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 *
 * 重复第二步，直到所有元素均排序完毕。
 */
public class SelectSort {

    public void selectionSort(int[] a) {
        if (Objects.isNull(a) || a.length <=1) {
            return;
        }

        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            // 将找到的最小值和i位置所在的值进行交换
            if (i != minIndex) {
                int tmp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = tmp;
            }
        }
    }

    @Test
    public void test() {
        int[] array = {3,2,8,5,3,2,1,9,7};
        selectionSort(array);

        System.out.println(Arrays.toString(array));
    }
}
