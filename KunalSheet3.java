public class KunalSheet3 {//loops
    public static void main(String[] args) {
        kaprekar(45);
    }

    public static void kaprekar(int n) {
        int m = n * n, i;
        String strM = Integer.toString(m);
        for(i=0;i<strM.length() - 1;i++) {
            if(checkKaprekar(strM.substring(0, i+1), strM.substring(i+1, strM.length()), n)) {
                System.out.println("Kaprekar No.");
                return;
            }
        }
        System.out.println("Not Kaprekar no.");
    }

    public static boolean checkKaprekar(String m, String n, int num) {
        int intM = Integer.parseInt(m);
        int intN = Integer.parseInt(n);
        return (intM+intN) == num;
    }

    public static void strong(int n) {
        int d, sum = 0, m=n;
        while(n > 0) {
            d = n % 10;
            sum += factorial(d);
            n = n / 10;
        }
        if(sum == m)
        System.out.println("Strong no.");
        else
        System.out.println("Not strong no.");
    }

    public static int factorial(int n) {
        if(n == 0 || n == 1)
        return 1;
        else {
            int i, f=1;
            for(i=1;i<=n;i++) {
                f = f * i;
            }
            return f;
        }
    }

    public static void automorphic(int n) {
        int m = n * n;
        String strN = Integer.toString(n);
        String strM = Integer.toString(m);
        if(strM.endsWith(strN))
        System.out.println("Automorhic No.");
        else
        System.out.println("Not a automorphic no.");
    }

    public static void perfect(int n) {
        int i, sum = 0;
        for(i=1;i<=n/2;i++) {
            if(n % i == 0)
            sum += i;
        }
        if(sum == n)
        System.out.println("Perfect No.");
        else
        System.out.println("Not a perfect no.");
    }
}
