package Array;
public class MaximumSumDistint {
    public static void main(String[] args){
        Sum sum=new Sum();
        int arr[]=new int[]{1,5,4,2,9,9,9};
        int k=3;
        int max=sum.Calculate(arr,k);
        System.err.println(max);
    }
}
class Sum{
    public int Calculate(int [] nums,int k){
        
        int newSum=0;
        int maxsum=0;
        int currsum=0;
    for(int i=0;i<k;i++){
        maxsum+=nums[i];
        // System.out.println(maxsum);
    }
    currsum=maxsum;
    for(int i=k;i<nums.length;i++){
        currsum+=nums[i]-nums[i-k]; 
        //   System.out.println(" "+nums[i]+" "+nums[i-k]);
        // System.out.println(currsum);
        if(nums[i]!=nums[i-1]){
            //System.out.println(currsum);
            if(currsum>maxsum){
             newSum=currsum;
            }
        }
        else{
            
        }
        
        
        
    }
   
        return newSum;
    }
}
