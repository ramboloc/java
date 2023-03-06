

public class J53 {
    public static  boolean findNumberIn2DArray(int[][] matrix, int target) {

        // 矩阵是有序的
        // 分别表示左上，左下，右侧
        int sLeft, xLeft, right;

        // 空矩阵
        if(matrix.length == 0) return false;

        if(matrix[0].length == 0) return false;

        // 先定位列
        //int i,j;
        right = matrix[0].length-1;
        sLeft = 0;
        xLeft = matrix.length-1;

        int mcol;
        while(sLeft+1<right){
            mcol=(sLeft + right)/2;
            if(matrix[0][mcol]== target) return true;
            if(target<matrix[0][mcol]){
                right = mcol;
            }else{
                sLeft = mcol;
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][sLeft]== target) return true;
        }

        sLeft=0;
        while(sLeft+1<xLeft){
            mcol=(sLeft + xLeft)/2;
            if(matrix[mcol][0]== target) return true;
            if(target<matrix[mcol][0]){
                xLeft = mcol;
            }else{
                sLeft = mcol;
            }
        }

        for(int i=0;i<matrix[0].length;i++){
            if(matrix[xLeft][i]== target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
//        int a[][] = {{1, 4, 7, 11, 15},
//                {2, 5, 8, 12, 19},
//                {3, 6, 9, 16, 22},
//                {10, 13, 14, 17, 24},
//                {18, 21, 23, 26, 30}};
        int a[][]={{1,4},{2,5}};

        System.out.println(findNumberIn2DArray(a,4));

    }
}
