package String;
//NotCompleted
public class UniqueFirstChar {
    public static void main(String[] args) {
        
    
        String s="leetcode";
        for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
            if(s.charAt(i)!=s.charAt(j)){
                    System.out.println(i);
              }
            }
        }
    }
}
