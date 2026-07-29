package Array;
public class SecondLargest {
    public static void main(String[] args) {
        int arr[]=new int[]{200,700,300,400,100,800,600};

        int max=0;
        int index=0;
        for(int i=1;i<arr.length;i++){
           if(max<=arr[i]){
                max=arr[i];
           }
        }
        System.out.println(max[0]);
    
    }
}
