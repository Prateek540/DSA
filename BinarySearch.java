class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 10, 40, 67, 87, 89, 100};
        int target = 10;
        int[] result = new int[2];
        result[0] = binarySearchLeft(arr, target);
        result[1] = binarySearchRight(arr, target);
        System.out.println("Leftmost index: " + result[0]);
        System.out.println("Rightmost index: " + result[1]);
    }
    public static int binarySearchLeft(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Move left to find the leftmost occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static int binarySearchRight(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // Move right to find the rightmost occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;                
            }
        }
        return result;
    }   
}