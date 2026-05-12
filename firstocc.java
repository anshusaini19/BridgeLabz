import java.util.*;
public class firstocc {
    public static void main(String[] args) {
        String str="banana";
        char target='a';
        /*for(int i=0;i<str.length();i++){//T.C : O(n)
            
            if(str.charAt(i)==target) {
            
                System.out.println("first occ of "+ target+" is at "+i);
                break;
            }
            
            

        }*/
       int index=-1;
        
        for(int i=0;i<str.length();i++){
        if(str.charAt(i)==target) {
            
                index=i;
                
            }
        }
        if(index == -1) {

            System.out.println("Not found");

        } else {

            System.out.println("Last occurrence of "
                               + target + " is at " + index);
        }

        
        
        


        /*optimized way for first occ
        int index=str.indexOf(target);//indexOf returns first occ of charcater in strings
        System.out.println(index);
        if(index==-1){
            System.out.println("not found");
        }*/
        
    }
    
}
