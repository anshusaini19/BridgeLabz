import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silentaa";
        int[] freq=new int[26];
        if(str1.length()!=str2.length()){
            System.out.println("not anagram");
            return;
        }
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)-'a']++;

        }
        for(int i=0;i<str2.length();i++){
            freq[str2.charAt(i)-'a']--;

        }
        boolean isana=true;
        for(int x:freq){
            if(x!=0) isana=false;
            break;
        }
        if(isana) System.out.println("anagram");
        else System.out.println("not anagram");


        
    }
    
}
