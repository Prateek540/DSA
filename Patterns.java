public class Patterns {
    public static void main(String args[]) {
        pattern1(5);
    }
    public static void pattern1(int n) {
        int i, j, k;
        for(i=1;i<=n;i++) {
            for(j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}