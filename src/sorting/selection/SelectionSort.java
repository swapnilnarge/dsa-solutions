package sorting.selection;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length - 1;

        for (int i = 0; i < n ; i++) {

            int maxIndex = n - i;
            int lastIndex = maxIndex;

            for (int j = 0; j < lastIndex; j++) {
                if (arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            if(maxIndex != lastIndex){
                int temp = arr[lastIndex];
                arr[lastIndex] = arr[maxIndex];
                arr[maxIndex] = temp;
            }

        }
    }
    public static void main(String[] args) {
        int[] data = {5,4,2,1};
        selectionSort(data);

        for (int num : data) {
            System.out.print(num + " "); // Output: 1 2 4 5
        }
    }
}



