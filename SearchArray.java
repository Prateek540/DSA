public class SearchArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Linear(arr,10);
        Binary(arr, 0, 9, 1);
        BinaryRecursive(arr, 0, 9, 10);
    }

    public static void BinaryRecursive(int[] arr, int low, int high, int target) {
        System.out.println("Binary Search using Recursion");
        int output = BinRec(arr, low, high, target);
        if(output == -1)
        System.out.println(target+" is not present on array");
        else
        System.out.println(target+" is present on array at position "+output);
    }

    public static int BinRec(int[] arr, int low, int high, int target) {
        if(low > high)
        return -1;
        int mid = (low+high) / 2;
        if(arr[mid] == target)
        return mid+1;
        else if(arr[mid] < target) {
            return BinRec(arr, mid + 1, high, target);
        }
        else {
            return BinRec(arr, low, mid - 1, target);
        }
    }

    public static void Binary(int[] arr, int low, int high, int target) {
        System.out.println("Binary Search");
        int mid;
        boolean present = false;
        while(low <= high) {
            mid = (low+high) / 2;
            if(arr[mid] == target) {
                System.out.println(target+" Present on array at position "+(mid+1));
                present = true;
                break;
            } else if(arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(present == false)
        System.out.println(target+" Not Present on array");
    }

    public static void Linear(int[] arr, int target) {
        System.out.println("Linear Search");
        int i;
        boolean present = false;
        for(i=0;i<arr.length;i++) {
            if(arr[i] == target) {
                System.out.println(target+" present on array at position "+(i+1));
                present = true;
                break;
            }
        }
        if(present == false)
        System.out.println(target+" not present in the array");
    }
}
