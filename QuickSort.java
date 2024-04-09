public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {45, 6, 12, 56, 90, 1, 7, 10, 567, 10};
        quicksort(arr, 0, arr.length - 1);
        display(arr);
    }
    public static void display(int[] arr) {
        System.out.println("Sorted array is ");
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    public static void quicksort(int[] arr, int low, int high) {
        if(low < high) {
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        while(i <= j) {
            while(i <=j && arr[i] <= pivot)
            i++;
            while(i <= j && arr[j] > pivot)
            j--;
            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}