import java.util.*;
public class stringcomp {
    public static void main(String[] args) {
        String str="aaabbcc";
        String res="";
        int count=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                res=res+str.charAt(i)+count;// if a!=b then first print character and its count
                count=1;// then make count for next char again as 1
            }
        }
        res=res+str.charAt(str.length()-1)+count; // last character
        System.out.println(res);
        
    }
    
}
