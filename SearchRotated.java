public class SearchRotated{
    public static int search(int[] nums, int target) {
        int si=0;
        int ei=nums.length-1;
        
        while(si<=ei){
            int mid=si+(ei-si)/2;//7
            if(nums[mid]==target){
                return mid;
            }
            if(nums[si]<nums[mid]){
                if(nums[si]<=target && target < nums[mid]){
                    ei=mid-1;
                }else{
                    si=mid+1;
                }
            }
            else{
                if(nums[mid]<target && nums[ei]>= target){
                    si=mid+1;
                }else{
                    ei=mid-1;
                }
            }
        }
        return -1;
        
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2,3};
        System.out.print(search(arr,0));
    }
}