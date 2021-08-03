package SORTINGS;
/* TIME COMPLEXITY:
                best   Worst
    Iteration   o(1)    o(n)
     Shifting   o(n)    o(n)
        Total   o(n)    o(n^2)
*/
public class BubbleSort {
    public void method(int[] arr){
        boolean isSorted;
        for(int i=0;i<arr.length;i++){
            isSorted= true;
            for(int j=0;j<arr.length-i-1;j++)
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    isSorted=false;
                }
            if(isSorted)
                return;
        }
                
    }
    public void swap(int[] arr, int i , int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }         
}
