import java.util.*;
public class fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        //0 1 1 2 3 5 8 13 21....
        int previous=0,next=1,result=0;
        for(int i=0;i<input;i++){
            System.out.print(previous+" ");
            result=previous+next;
            previous=next;
            next=result;

        }
    }
}