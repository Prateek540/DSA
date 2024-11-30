import java.util.*;
class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. to print palindrome or not");
        int n = sc.nextInt();
        int s = 0, d, m;
        m = n;
        while(n > 0) {
            d = n % 10;
            s = s * 10 + d;
            n = n / 10;
        }
        if(s == m)
        System.out.println("Palindrome no.");
        else
        System.out.println("Not Palindrome no.");
        sc.close();
    }
}