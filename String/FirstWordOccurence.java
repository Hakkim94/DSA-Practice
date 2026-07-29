package String;
//Find the Index of the First Occurrence in a String
public class FirstWordOccurence {
    public static void main(String[] args) {
        String haystack="sadban";
        String needle="sad";
        for(int i=0;i<=haystack.length()-needle.length();i++){
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i)==needle.charAt(j)){
                    if(j==needle.length());
                    System.out.println(needle.charAt(0));
                }
                
                
            }
        }
    }
}
