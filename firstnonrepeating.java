import java.util.*;
public class firstnonrepeating {
    public static void main(String[] args) {
        String str="aabbcdee";
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)-'a']==1){
                System.out.println(str.charAt(i));
                break;
            }
            

        }

        
    }
    
}
