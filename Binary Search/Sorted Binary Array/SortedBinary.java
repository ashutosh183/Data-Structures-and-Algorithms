import java.util.Scanner;

public class SortedBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int left = -1, right = n;
        while(left < right){
            int mid = left + (right - left)/2;
            if(predicate(mid, a) == 0){
                left = mid;
            }else{
                right = mid;
            }
        }

        System.out.println(right+" "+left);
    }

    static int predicate(int mid, int[] a){
        if(a[mid] == 0){
            return 0;
        }
        return 1;
    }
}
