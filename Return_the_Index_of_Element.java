import java.util.Arrays;

public class Return_the_Index_of_Element {
    public static int index(int[] arr){
        int target=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==70){
                target=i; 
                break;
            }
            
            

        }
        return target;


    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,30};
        System.out.println(index(arr));
        
    }
    
}
