
public class Day3 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 3, 6 };
        System.out.println(Duplicate(arr));
    }

    static int Duplicate(int[] arr) {
          
        for (int i = 0; i < arr.length; i++) {
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                 return arr[i];
                 
               }
           }

        }
       return -1;
    }
}
