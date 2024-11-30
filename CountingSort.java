public class CountingSort {
    public static void main(String args[]) {
        int[] arr = {4, 2, 7, 1, 9, 11};

        // Step 1: Find the maximum value in the array to define the size of the count array
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        // Step 2: Create a count array to store the frequency of each element
        int[] countArr = new int[max + 1];

        // Step 3: Populate the count array
        for (int i : arr) {
            countArr[i]++;
        }

        // Step 4: Populate the output array using the count array
        int[] outputArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i] > 0) {
                outputArr[j++] = i;
                countArr[i]--;
            }
        }

        // Step 5: Print the sorted array
        for (int i : outputArr) {
            System.out.println(i);
        }
    }
}
