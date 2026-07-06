public class LinearSearch {
   public static void main(String[] args) {
    int[] saro={10,20,30,40,50};
    int target=40;
    int index=-1;
    for(int i=0;i<saro.length;i++){
        if(target==saro[i]){
            index=i;
            break;
        }
    }
    if(index!=-1){
        System.out.println("Element found at "+ index);
    }
    else{
        System.out.println("Not found" );
    }
   } 
}
