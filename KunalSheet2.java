import java.util.Scanner;//first java
public class KunalSheet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
    }

    public static void armstrongRange(int start, int end) {
        System.out.println("Armstrong no.s between "+start+" and "+end+" is -->");
        int i;
        for(i=start;i<=end;i++) {
            if(armstrong(i))
            System.out.println(i);
        }
    }

    public static boolean armstrong(int n) {
        int d, s=0, m = n;
        while(n > 0) {
            d = n % 10;
            s = s + (d * d * d);
            n = n / 10;
        }
        return s == m;
    }

    public static void palindrome(String str) {
        str = str.toLowerCase();
        String m = str, newStr = "";
        int i;
        for(i=0;i<str.length();i++) {
            newStr = str.charAt(i) + newStr;
        }
        if(newStr.equals(m))
        System.out.println("Palindrome string");
        else
        System.out.println("Not a Palindrome string");
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1, c;
        if(n <= 0)
        System.out.println("No fibonacci series for this range");
        else if(n == 1)
        System.out.println(a);
        else if(n == 2)
        System.out.println(a+" "+b);
        else {
            int i;
            System.out.print(a+" "+b);
            for(i=3;i<=n;i++) {
                c = a + b;
                System.out.print(" "+c);
                a = b;
                b = c;
            }
        }
    }

    public static void rupeeToDollar(double rupee) {
        double dollar = rupee / 83.72;
        System.out.println("Dollar value "+dollar);
    }

    public static void largest(int a, int b) {
        if(a > b)
        System.out.println("Largest is "+a);
        else
        System.out.println("Largest is "+b);
    }

    public static void sum(int a, int b, char ch) {
        if(ch == '+')
        System.out.println("Sum is "+(a+b));
        else if (ch == '-')
        System.out.println("Difference is "+(a-b));
        else if (ch == '*')
        System.out.println("Product is "+(a*b));
        else
        System.out.println("Division is "+(a/b));
    }

    public static void simpleIntrest(int p, int r, int t) {
        double si = (p * r * t) / 100;
        System.out.println("Simple Intrest is "+si);
    }

    public static void messenger(String name) {
        System.out.println("Hello "+name+" how are you !!!");
    }

    public static void oddOrEven(int n) {
        if(n % 2 == 0)
        System.out.println(n+" is a even no.");
        else
        System.out.println(n+" is a odd no.");
    }
}
