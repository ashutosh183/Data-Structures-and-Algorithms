import java.util.Scanner;

public class FirstMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int x = 0;
        for(int i=0; i<q; i++){
            x = sc.nextInt();
            int left = -1, right = n;
            while(left + 1 < right){
                int mid = left + (right - left)/2;
                if(predicateFirst(a, mid, x) == 0){
                    left = mid;
                }else{
                    right = mid;
                }
            }
            int firstIndex = right;
            left = -1; right = n;
            while(left + 1 < right){
                int mid = left + (right - left)/2;
                if(predicateLast(a, mid, x) == 0){
                    left = mid;
                }else{
                    right = mid;
                }
            }
            int lastIndex = left;

            if(firstIndex == n || lastIndex == -1){
                System.out.println(-1+" "+-1);
            }else{
                System.out.println(firstIndex+" "+lastIndex);
            }
        }
    }
    static int predicateFirst(int[] a, int i, int x){
        if(a[i] >= x){
            return 1;
        }
        return 0;
    }
    static int predicateLast(int[] a, int i, int x){
        if(a[i] > x){
            return 1;
        }
        return 0;
    }
}
