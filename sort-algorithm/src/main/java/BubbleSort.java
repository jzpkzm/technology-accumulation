import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: jizongpeng
 * @Date: 2021/1/26 19:00
 * @Version: 1.0
 * @Description: 冒泡排序：https://mp.weixin.qq.com/s/FVOllQoELEK3rvjpdLAxIQ
 */
public class BubbleSort {

    int[] array = {3,2,8,5,3,2,1,9,7};
    int length = array.length;

    @Test
    public void sort_01() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
