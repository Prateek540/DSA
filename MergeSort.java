public class MergeSort {//O(nlogn)
    public static void main(String[] args) {
        int[] arr = {35,55,2,56,67,323,78,234,12, 100};
        int si = 0, ei = arr.length - 1, i;
        divide(arr, si, ei);
        for(i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    public static void divide(int[] arr, int si, int ei) {
        if(si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void conquer(int[] arr, int si, int mid, int ei) {
        int[] newArr = new int[ei - si + 1];
        int i = si, j = mid + 1, x = 0;
        while(i <= mid && j <= ei) {
            if(arr[i] <= arr[j]) {
                newArr[x++] = arr[i++];
            } else {
                newArr[x++] = arr[j++];
            }
        }
        while(i <= mid) {
            newArr[x++] = arr[i++];
        }
        while(j <= ei) {
            newArr[x++] = arr[j++];
        }
        x = si;
        for(i=0;i<newArr.length;i++) {
            arr[x++] = newArr[i];
        }
    }
}
