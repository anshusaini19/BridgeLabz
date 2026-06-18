import java.util.ArrayList;
import java.util.List;
public class Find_All_Indices {
    public static List<Integer> Indices(int[] arr){
        List<Integer> result=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==30){
                result.add(i); 
                
            }
        }
        return result;
        
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,30,30,30};
        List<Integer> indices=Indices(arr);
        if (indices.isEmpty()) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at indices: " + indices);
        }
        
    }
    
}
