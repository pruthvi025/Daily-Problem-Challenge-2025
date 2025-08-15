import java.util.Arrays;

public class Day1{
    public static void sort012(int[] arr) {
        int low = 0, mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    
                    int temp0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp0;
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 1, 0, 2, 1, 0};
        sort012(arr1);
        System.out.println(Arrays.toString(arr1)); 
        int[] arr2 = {2, 2, 2, 2};
        sort012(arr2);
        System.out.println(Arrays.toString(arr2)); 

        int[] arr3 = {0, 0, 0, 0};
        sort012(arr3);
        System.out.println(Arrays.toString(arr3)); 
    }
}
