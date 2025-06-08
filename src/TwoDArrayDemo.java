import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

public class TwoDArrayDemo {
    public static List<Integer> luckyNumber(int [][] matrix){
         int m = matrix.length;
         int n = matrix.length;

         int[] rowMin =new int[m];
         int[] columnMax = new int[n];


        Arrays.fill(rowMin, Integer.MAX_VALUE);
        Arrays.fill(columnMax, Integer.MIN_VALUE);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
              rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
              columnMax[j] = Math.max(columnMax[j], matrix[i][j]);
            }
        }
        List<Integer> luckyNumbers = new ArrayList<>();
        for(int i = 0; i < m ; i++){
            for (int j = 0; j < n; j++ ){
                if(matrix[i][j] == rowMin[i] && matrix[i][j] == columnMax[j]){
                    luckyNumbers.add(matrix[i][j]);
                }
            }
        }
        return luckyNumbers;
    }
    public static void main(String[] args) {

    }
}
