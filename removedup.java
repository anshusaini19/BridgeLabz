import java.util.*;
public class removedup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        Collections.sort(l);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        for(int x:l){
            if(!res.contains(x)){
                res.add(x);
            }
        }
        System.out.println(res);   
    }   
}
