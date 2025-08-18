
import java.util.Arrays;

public class Day4{
    public static void main(String[] args) {
        int[] arr1={10,12,14};
        int[] arr2={1,3,5};

        mergeArr(arr1, arr2);

        
    }
    static void mergeArr(int[] arr1,int[] arr2){
          int[]  merge=new int[arr1.length+arr2.length];

          int count=0;

          for(int i=0;i<arr1.length;i++){
            merge[count++]=arr1[i];
          }
          for(int i=0;i<arr2.length;i++){
            merge[count++]=arr2[i];
          }

          Arrays.sort(merge);
          int k=0;
          for(int i=0;i<arr1.length;i++){
            arr1[i]=merge[k++];
          }
          for(int i=0;i<arr2.length;i++){
            arr2[i]=merge[k++];
          }

          System.out.println(Arrays.toString(arr1));
         System.out.println(Arrays.toString(arr2));

    }
}
