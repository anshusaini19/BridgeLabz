import java.util.Scanner;
public class First_Last_Occurences {
    public static void firstandlast(int[] arr,int x){
        int first=-1;
        int last=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                first=i;
                break;
            }
        }
       
        for(int i=n-1;i>=0;i--){
            if(arr[i]==x){
                last=i;
                break;
            }
        }
        System.out.println(first);
        System.out.println(last);
        
        


    }
    public static void main(String[] args) {
        int[] arr={1,3,5,3,9};
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        firstandlast(arr, x);
        


        
    }
    
}
