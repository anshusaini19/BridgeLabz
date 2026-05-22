import java.util.*;
public class altoarray {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        int[] arr=new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
