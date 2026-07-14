import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr={3,2,2,3,3};
        int remove=arr[0];
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=remove){
                arr[i]=arr[j];
                i++;
            }
        }
        for(int num=0;num<i;num++){
            System.out.print(arr[num]+ " ");
        }
        
    }    
}
