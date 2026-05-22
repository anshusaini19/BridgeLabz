import java.util.*;
public class removedup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        ArrayList<Integer> res=new ArrayList<>();
        Collections.sort(l);

        res.add(l.get(0));
        for(int i=1;i<l.size();i++){
            if(!l.get(i).equals(l.get(i-1))){
                res.add(l.get(i));
            }
        }
        
        
        /*for(int x:l){
            if(!res.contains(x)){
                res.add(x);
            }
        }*/
        System.out.println(res);   
    }   
}