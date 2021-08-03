package SORTINGS;
/* TIME COMPLEXITY:
                best      Worst
    Iteration   o(n)      o(n)
   No of time   o(log n)  o(n)
        Total   o(n logn) o(n^2)
        space   o(log n)  0(n)

 Most useful algorthm in sortings.
*/
public class QuickSort {
    BubbleSort obj = new BubbleSort();
    public void method(int[] arr,int start, int end){
        if(start >= end)
            return;
        int boundary = partition(arr,start, end);
        method(arr, 0, boundary-1);
        method(arr, boundary+1, end);
    }
    private int partition(int[] arr,int start, int end){
        // int pivot = end;
        int boundary = start-1;
        for(int i=start;i<=end;i++)
            if(arr[i] <= arr[end])
                obj.swap(arr, i, ++boundary);
        return boundary;
    }
    
}
