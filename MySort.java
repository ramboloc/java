public class MySort {

    public void BubbleSort(int[] arr){
        /**
         * 冒泡排序的实现
         */
        int temp;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
