class SortArray {
    public static void main(String argsp[]) {
        int[] arr = {10, 4, 46, 349, 1};
        System.out.println("Original Array is");
        display(arr);
        // Bubble(arr);
        // Selection(arr);
        Insertion(arr);
    }

    public static void display(int[] arr) {
        int i;
        for(i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static void Insertion(int[] arr) {
        int i, j, current;
        for(i=1;i<arr.length;i++) {
            current = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println("Array Sorted with Insertion Sort is");
        display(arr);
    }

    public static void Selection(int[] arr) {
        int i, j, mi, n = arr.length, t;
        for(i=0;i<n-1;i++) {
            mi = i;
            for(j=i+1;j<n;j++) {
                if(arr[mi] > arr[j]) {
                    mi = j;
                }
            }
            t = arr[mi];
            arr[mi] = arr[i];
            arr[i] = t;
        }
        System.out.println("Array Sorted with Selection Sort is");
        display(arr);
    }

    public static void Bubble(int[] arr) {
        int i, j, n = arr.length, t;
        boolean swapped = false;
        for(i=0;i<n-1;i++) {
            swapped = false;
            for(j=0;j<n-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    swapped = true;
                }
            }
            if(swapped == false)
            break;
        }
        System.out.println("Array Sorted with Bubble Sort is");
        display(arr);
    }
}