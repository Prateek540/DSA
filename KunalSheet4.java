public class KunalSheet4 {//functions
    public static void main(String[] args) {
        int i;
        for(i=1;i<=10;i++) {
            if(isPrime(i))
            System.out.println(i);
        }
    }

    public static boolean isPrime(int n) {
        int i, k=0;
        if(n == 1 || n== 0)
        return false;
        else {
            for(i=2;i<=n/2;i++) {
                if(n % i == 0)
                k++;
            }
            return k == 0;
            
        }
    }
}
