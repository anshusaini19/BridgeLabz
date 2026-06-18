import java.util.*;
public class Count_Occurrences_of_an_Element {
    public static int count(int[] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,2,4};
        
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(count(arr, x));
        
    }
    
}
