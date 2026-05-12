import java.util.*;
public class RemoveSpaces {

    public static void main(String[] args) {

        String str = "Java is easy";

        String result = "";

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch != ' ') {

                result = result + ch;//TC=O(N^2) as concatenation creates new objects repeatedly
            }
        }
        /*StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch != ' ') {

                result.append(ch);         //TC=O(n)
            }
        }*/

        
        str = str.replace(" ", "");    

        System.out.println(str); 

        //System.out.println(result);
    }
}