import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] a = new int[n];
        int[] queries = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < q; i++){
            queries[i] = sc.nextInt();
        }
        int i = 0;
        while(i < q){
            int x = queries[i];
            int left = -1, right = n;
            while(left + 1 < right){
                int mid = left + (right - left)/2;
                if(predicate(mid, a, x) == 0){
                    left = mid;
                }else{
                    right = mid;
                }
            }
            i++;
            System.out.println(right);
        }
    }

    static int predicate(int mid, int[] a, int x){
        if(a[mid] >= x){
            return 1;
        }
        return 0;
    }
}