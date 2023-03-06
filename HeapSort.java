public class HeapSort {

    /**
     * 堆排序的实现
     * @param arr
     */
    // 思路： 从第一个非叶子节点开始检查，检查它是否是最大堆，如果是继续判断下一个节点
    // 否则，如果需要交换位置，则需要判断交换位置后的子节点 是否满足最大堆
    private static void heapSort(int[] arr){
        // 通过数组的方式实现


        // 第一个非叶子节点开始检查
        int n = arr.length >> 1;
        for (int i = n; i >= 0; i--) {
            maxHeap(arr, i, arr.length);
        }

        for (int i = arr.length-1; i >0 ; i--) {
            swap(arr, 0 , i);
            maxHeap(arr, 0, i-1);

        }

    }

    // 把堆调整为最大堆
    private static void maxHeap(int[] arr, int index, int len){
        /**
         * index: 表示当前节点的索引
         * len: 表示数组的长度
         */
        int lCld = (index << 1) + 1;
        int rCld = lCld + 1;
        if(lCld > len-1) return;
        // 判断左右节点哪个大，避免二次调整
        if(rCld < len && arr[lCld] < arr[rCld] ){
            swap(arr, lCld, rCld);
        }
        // 检测左孩子
        if(arr[lCld] > arr[index] ){
            swap(arr, lCld, index);
            maxHeap(arr, lCld, len);
        }
        // 检测右孩子
        if(rCld < len && arr[rCld] > arr[index]){
            swap(arr, rCld, index);
            maxHeap(arr, rCld, len);
        }
    }

    // 交换
    private static void swap(int[] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,2,5,3};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
