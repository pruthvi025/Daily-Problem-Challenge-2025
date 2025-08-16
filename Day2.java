
public class Day2 {
    public static void main(String[] args) {
int[] arr={1,2,3,5,6,7};
System.out.println(Missing(arr));
    }

    static int Missing(int[] arr) {
       
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[0] != 1) {
                return 1;
            } else if (arr[i] + 1 != arr[i + 1]) {
            return arr[i] + 1;
            }

        }
        return arr[arr.length-1]+1;
    }
}
