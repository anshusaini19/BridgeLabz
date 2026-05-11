import java.util.*;
public class revstring {
    public static void main(String[] args) {
        /*------logical method for reversing:------
        String str1="java";
        String rev=" ";
        for(int i=str1.length()-1;i>=0;i--){
            rev+=str1.charAt(i);

        }
        System.out.println(rev);
        -----------*/
        StringBuilder sb=new StringBuilder("java");
        sb.reverse();
        System.out.println(sb);
    }
    
}
