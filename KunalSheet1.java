import java.util.Scanner;//flow program
public class KunalSheet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        char ch = 'x';
        do {
            System.out.println("Enter one no.");
            n = sc.nextInt();
            sum += n;
            System.out.println("Enter x to stop or anything to continue");
            ch = sc.next().charAt(0);
        } while(ch != 'x');
        System.out.println("SUM OF ALL NO.s IS "+sum);
        sc.close();
    }

    public static void HCFLCM(int a, int b) {
        int d, product = a * b;
        while(a > 0) {
            d = b % a;
            b = a;
            a = d;
        }
        System.out.println("HCF is "+b);
        System.out.println("LCM is "+(product / b));
    }

    public static void table(int n) {
        int i, f;
        for(i = 1;i <= 10;i++) {
            f = n * i;
            System.out.println(n+ " x "+i+" = "+f);
        }

    }

    public static void sum(int num1, int num2) {
        System.out.println("SUM of both is "+(num1+num2));
    }
    public static void LeapYear(int year) {
        boolean leap = false;/* if no. divisible  by 4 then if divisible by 100 too the it should be divisible by 400  too */
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }
        if(leap)
        System.out.println("LEAP YEAR");
        else
        System.out.println("NOT A LEAP YEAR");
    }
}
