class SubArray {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3};
        System.out.println("OUTPUT printSubArray");
        printSubArray(arr, 0, arr.length-1);
        System.out.println("OUTPUT printRecursiveSubArray");
        printRecursiveSubArray(arr, 0, 0);
    }

    public static void printRecursiveSubArray(int[] arr, int start, int end) {
        if(start == arr.length && end == arr.length)
        return;
        else if (end == arr.length)
        printRecursiveSubArray(arr, start+1, start+1);
        else {
            System.out.print("[");
            for (int i = start; i < end; i++)
                System.out.print(arr[i] + ", ");
            System.out.println(arr[end] + "]");
            printRecursiveSubArray(arr, start, end+1);
        }
    }

    public static void printSubArray(int[] arr, int start, int end) {
        int i, j, k;
        for(i=start;i<=end;i++) {
            for(j=i;j<=end;j++) {
                for(k=i;k<=j;k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}