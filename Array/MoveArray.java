package Array;
public class MoveArray{
public static void main(String[] args) {
     int arr[]=new int[]{12,13,-1,-1,20,-1,77,-1,99};
     int index=0;
     for(int i=0;i<arr.length;i++){
        if(arr[i]!=-1){
           
           arr[index++]=arr[i];
         }
      }
      while (index<arr.length) {
            System.out.println("ka;");
            arr[index++]=-1;
         }
         for(int i=0;i<arr.length;i++){
            System.out.println("element"+arr[i]);
         }

  }
}