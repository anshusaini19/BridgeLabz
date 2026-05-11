import java.util.*;
public class vowelscount {
    public static void main(String[] args) {
        String str="Anshu";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='A' || ch=='E'|| ch=='I'||ch=='O' || ch=='U'|| ch=='a'||ch=='e'|| ch=='i'||ch=='o' || ch=='u'){
                count++;


            }
            
        }
        System.out.print(count);
        
    }
}
