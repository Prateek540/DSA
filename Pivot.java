public class Pivot {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int pivot = findPivot(arr);
        System.out.println("Pivot element is: " + pivot);
    }

    public static int findPivot(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr[low];
    }
}
