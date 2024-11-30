import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, d, s=0;
        System.out.println("Enter a no. to check armstrong or not...");
        n = sc.nextInt();
        m = n;
        while(n > 0) {
            d = n % 10;
            s = s + (d * d * d);
            n = n / 10;
        }
        if(s == m)
        System.out.println("Armstrong no.");
        else
        System.out.println("Not a armstrong no.");
        sc.close();
    }
}
