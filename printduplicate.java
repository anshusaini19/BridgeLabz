import java.util.*;
public class printduplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        duplicate(arr);
        
        
    }
    static void duplicate(int[] arr){
        int[] br=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    br[k]=arr[i];
                    k++;
                    break;
                    


                }
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(br[i]+" ");
        }

    }
    
}
