public class FindingAverageGreaterthanThreshold {
    public static void main(String[] args) {
        int arr[]=new int[]{2,2,2,2,5,5,5,8};
        int threshold=4;
        int k=3;
        int maxsum=0;
        int currsum=0;
        int count=0;
        int winavg=0;
        for(int i=0;i<k;i++){
            maxsum+=arr[i];
            
        }
        currsum=maxsum;
        for(int i=k;i<arr.length;i++){
            winavg=currsum/k;
            if(threshold<=winavg){
                System.out.println(currsum);
                count++;
            }
            currsum+=arr[i]-arr[i-k];
        }
        System.out.println(count);
    }
}
