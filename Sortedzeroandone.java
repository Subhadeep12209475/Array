public class Sortedzeroandone{
    public static void main(String args[]){
        int arr[]={1,0,0,1,0,1,0,1};
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0){
        //         count++; //4
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(i<count){
        //         arr[i]=0;

        //     }else{
        //         arr[i]=1;
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        int laft;
        int end=arr.length-1;
        while(left<end){
            if(arr[left]==1 && arr[end]==0){
                arr[left]=0;
                arr[end]=1;
                left++;
                end--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[end]==1){
                end--;
            }
        }
        }
    
}