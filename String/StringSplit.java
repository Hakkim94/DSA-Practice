package String;

public class StringSplit {
    public static void main(String[] args) {
        String s = "Java Python C++";

        String[] arr = s.split(" ");

        for(String word : arr)
        System.out.println(word);
   }
}
