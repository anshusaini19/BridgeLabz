import java.util.*;
public class revarraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l1=new ArrayList<>();
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            l1.add(sc.nextInt());
        }
        int start=0;
        int end=l1.size()-1;
        while(start<end){
            int temp=l1.get(start);
            l1.set(start, l1.get(end));

            l1.set(end, temp);
            start++;
            end--;

        }
        System.out.println(l1);
        
    }
    
}
