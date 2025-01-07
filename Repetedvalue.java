public class Repetedvalue{
    public static void main(String args[]){
        int arr[]={ 1,2,3,4,3,2,1};
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" ");
                    found=true;
                    break;

                 }//else{
                //     System.out.println("-1");
                // }
            }
            if(found==true){
                break;
            }
            else{
                    System.out.println("-1");
                }
        }
    }
}