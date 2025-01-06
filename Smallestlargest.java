import java.util.Arrays;
public class Smallestlargest{
    public static void main(String args[]){
        int arr[]={2,3,4,1,7,8,5};
        Arrays.sort(arr);
        // 1,2,3,4,5,7,8
        int temp=arr[1];
        arr[1]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}