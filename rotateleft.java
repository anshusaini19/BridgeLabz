import java.util.*;
public class rotateleft {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        int first=l.get(0);
        for(int i=0;i<n-1;i++){
            l.set(i,l.get(i+1));
        }
        l.set(n-1,first);
        Iterator<Integer> it=l.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }   
}
