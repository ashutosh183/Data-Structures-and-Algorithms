import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for(int k=0; k<q; k++){
            int x = sc.nextInt();
            int i = 0, j = n-1;
            while(i < m && j < n){
                if(mat[i][j] == x){
                    break;
                }else if(mat[i][j] > x){
                    j--;
                }else{
                    i++;
                }
            }
            System.out.println(i+" "+j);
        }
    }
}
