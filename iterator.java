import java.util.*;
public class iterator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l1=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        Iterator<Integer> it=l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }

    
}
