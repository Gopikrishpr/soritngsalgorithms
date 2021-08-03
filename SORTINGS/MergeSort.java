package SORTINGS;
/* TIME COMPLEXITY:
                 best       Worst
     Dividing   o(logn)    o(logn)
      Merging   o(n)       o(n)
        Total   o(n logn)  o(n logn)
*/
public class MergeSort {
    public void divide(int[] arr){
        if(arr.length <= 1)
            return;
        int middle= arr.length/2;
        int[] left= new int[middle];
        int[] right = new int[arr.length-middle];
        for(int i=0;i<middle;i++)
            left[i]=arr[i];
        for(int i=middle;i<arr.length;i++)
            right[i-middle]=arr[i];
        divide(left);
        divide(right);
        merge(left,right,arr);
    }
    public void merge(int[] left, int[] right,int[] arr){
        int i=0,j=0,k=0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        
        while(i < left.length)
            arr[k++] = left[i++];
        
        while(j < right.length)
            arr[k++] = right[j++];
        
    }
}
