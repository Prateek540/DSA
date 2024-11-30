public class Recursion {
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S","H", "D");
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+helper);
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static int sumUsingRecursion(int n, int sum) {
        if(n == 1) 
        return sum + 1;
        else {
            sum = sum + n;
            return sumUsingRecursion(n-1, sum);
        }
    }

    public static int factorialUsingRecursion(int n, int f) {
        if(n == 1)
        return f;
        else {
            f = n * f;
            return factorialUsingRecursion(n-1, f);
        }
    }
}
