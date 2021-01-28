package search;

import java.util.Objects;

/**
 * @Author: jizongpeng
 * @Date: 2021/1/28 11:23
 * @Version: 1.0
 * @Description: 二分查找：https://mp.weixin.qq.com/s/b9Yu23zUrgtitnSp_tg3QQ
 */
public class BinarySearch {

    public int binarySearch(int[] a, int data) {
        if (Objects.isNull(a) || a.length == 0) {
            return -1;
        }

        int min = 0;
        int max = a.length - 1;
        int mid;
        while (min <= max) {
            //mid = (min + max)/2;//可能会发生溢出
            // 防止溢出
            mid =  min + (max - min) / 2;//或者mid =  min + ((max - min) >>> 1);
            if (a[mid] == data) {
                return mid;
            } else if (a[mid] < data) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return -1;
    }
}
