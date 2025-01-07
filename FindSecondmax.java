public class FindSecondmax{
    // public static void main(String args[]){
    //     int arr[]={1,4,5,6,2,9};
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    //     }
    //     System.out.print(max);
    // }

    public static void main(String args[]){
        int arr[]={1,4,5,6,8,2,9};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i]; // max = 9
            }
        }
         for(int i=0;i< arr.length;i++){
            if(arr[i]==max){
                arr[i]= Integer.MIN_VALUE;
            }
         }
         int max1=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max1=arr[i]; // max = 8
            }
        }
        System.out.print(max1);
    }
}