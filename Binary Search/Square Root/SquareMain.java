import java.util.Scanner;

public class SquareMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        double left = 0, right = x;
        int steps = 150;
        while(steps > 0){
            steps--;

            double mid = left + (right - left)/2;

            if(predicate(mid, x) == 0){
                left = mid;
            }else{
                right = mid;
            }
        }

        System.out.println(right);
    }

    static int predicate(double mid, long x){
        if(mid * mid < x){
            return 0;
        }
        return 1;
    }
}