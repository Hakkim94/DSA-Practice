package String;

public class ValidPalidrome {
 public static void main(String[] args) {
    
        String s="A man, a plan, a canal: Panama";
        s=s.replaceAll("[^a-z]","");
        System.out.println(s);
        for(int i=s.length()-1;i>0;i--){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                
             // System.out.println(s+" true");
            }
        }
      
    }
}
