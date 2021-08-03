package SORTINGS;
/* TIME COMPLEXITY:
                best   Worst
    Iteration   o(n)    o(n)
     Shifting   o(n)    o(n)
        Total   o(n^2)    o(n^2)
*/
public class SelectionSort {
    public void method(int[] arr){
        BubbleSort obj = new BubbleSort();
        for(int i=0;i<arr.length;i++){
            int m = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[m] > arr[j])
                    m = arr[j];
            }
            if(arr[i] > arr[m] && i!=m)
               obj.swap(arr, i, m);
        }
    }
}
