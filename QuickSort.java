import java.util.ArrayList;

public class QuickSort {

    public static void quickSort(int[] arr, int left, int right){
        /**
         * 快排的实现
         */
        // 快排设置一个数字，一般我们选择第一个数字记录为temp
        // 1 初始化两个指针i,j，一个指向数组起始位置，一个指向末尾
        // 2 从j的位置开始扫描，找出第一个小于temp的数字，交换a[i]和a[j],然后从i的位置开始扫描，找出第一个大于temp的数字
        // 3 交换i和j位置的数字
        // 4 重复2-3，直到i==j， 此时i指向的位置就是temp
        int i = left;
        int j = right;
        // 如果i == j, 不需要处理了
        if(i>=j){
            return;
        }
        int temp = arr[left];

        while(i<j){
            // 从右侧开始扫描
            while(i<j && arr[j]>=temp){
                j--;
            }
            // 如果j没到达i的位置，就可以进行交换
            if(i < j ){
                arr[i] = arr[j];
                i++;
            }
            // 从左侧开始扫描
            while(i<j && arr[i]<=temp){
                i++;
            }
            // 如果i没到达j的位置, 就可以进行交换
            if(i < j){
                arr[j] = arr[i];
                j--;
            }
        }
        // temp放的位置处i==j
        arr[i] = temp;
        // 对左侧进行快排
        quickSort(arr, left,i-1);
        // 对右侧进行快排
        quickSort(arr,i+1, right);

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,2,3,4};
        quickSort(arr,0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
