package SORTINGS;
import java.util.*;
public class SortMain {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=obj.nextInt();
        CountingSort s = new CountingSort();
        s.method(arr);
        System.out.print(Arrays.toString(arr));
    }
}
