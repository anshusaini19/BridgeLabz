public class If_Array_Is_Empty {
    public static int ls(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==30){
                return i;
                 
            }
            
        }
        return -1;
        
        
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        if(arr.length==0){
            System.out.println("empty array");

        }
        else{
            int index = ls(arr);

            if (index == -1) {
                System.out.println("Element not found");
            } else {
                System.out.println("Element found at index " + index);
            }
            
        }

        
    }
    
}
