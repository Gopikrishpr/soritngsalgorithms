package SORTINGS;


public class CountingSort {
    public void method(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
            if(max < arr[i])
                max = arr[i];
        int a[] = new int[max+1];
        for(int i=0;i<arr.length;i++)
            a[arr[i]]+=1;
        sort(arr,a,max);
    }
    private void sort(int[] arr, int[] a , int max){
        for(int i=0,j=0;i<=max;i++)
            if(a[i] > 0)
                for(int k=0;k<a[i];k++)
                    arr[j++]=i;
    }
}
