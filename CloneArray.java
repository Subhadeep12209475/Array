import java.util.Arrays;
public class CloneArray{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int arr3[]=arr;
        int arr2[]=Arrays.copyOf(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        arr2[0]=2;
        arr3[1]=9;
        System.out.println();
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}