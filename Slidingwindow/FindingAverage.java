public class FindingAverage {
   
public static void main(String[] args) {
    
    double nums[]=new double[]{3};
    int k=3;
    double maxsum=0;
    double currsum=0;
    if(1==nums.length){
            System.out.println("if "+nums[0]/k);
    }
    else{
        for(int i=0;i<k;i++){
            maxsum+=nums[i];
           
        }
        currsum=maxsum;
        for(int i=k;i<nums.length;i++){
         
            currsum+=nums[i]-nums[i-k];  //5+4-2=7 7+2-1=8 8+1-2=7
            
            if(maxsum<currsum){
                maxsum=currsum;
            }
        
        }
        System.out.println(maxsum/4);
    }
  }
}
