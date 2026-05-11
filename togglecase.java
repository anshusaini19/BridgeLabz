import java.util.*;
public class togglecase {
    public static void main(String[] args) {
        String str="AnShU sainI";
        String res=" ";
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            /*if(ch>='A' && ch<='Z'){
                res=res+(char)(ch+32);//ASCII VALUES OF A=65, a=97, diff=32


            }
            else{
                res=res+(char)(ch-32);//
            }
           -------using IN-BUILT FUNCTIONS OF STRINGS------*/
           if(Character.isUpperCase(ch)){
            res=res+Character.toLowerCase(ch);

           }else{
            res=res+Character.toUpperCase(ch);

           }

        }
        System.out.println(res);
        
    }
    
}
