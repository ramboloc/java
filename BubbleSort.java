public class BubbleSort {


    // 思想介绍
    // 每次遍历数组，前一个数都和后一个数进行比较，如果前一个数比后一个数大，则交换他们的位置
    // temp = a[i];
    // a[i] = a[i+1];
    // a[i+1] = temp;
    private static void bubbleSort(int[] arr){
        int temp ;

        int flag;
        // 开始冒泡排序
        for (int i = 0; i < arr.length; i++) {
            //如果没发生交换，那么就有序了
            flag=0;
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag++;
                }
            }
            if(flag == 0) break;
        }
    }
    public static void main(String[] args) {

        int[] arr={4, 3, 1, 5, 2, 7, 6, 11, 8};
        bubbleSort(arr);
        for (int j : arr) {
            System.out.println(j);
        }

    }
}
