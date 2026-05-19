import java.util.*;
public class mergearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=0;i<n1;i++){
            l1.add(sc.nextInt());
        }
        for(int i=0;i<n2;i++){
            l2.add(sc.nextInt());
        }
        //l1.addAll(l2);//inbuilt method
        for(int i=0;i<l2.size();i++){//manually add
            l1.add(l2.get(i));
        }
        System.out.println(l1);
        



        
    }
    

    
}
