package sortings;

import java.util.Arrays;
/*
   Advantages of sortings.Selection Sort
   Easy to understand and implement, making it ideal for teaching basic sorting concepts.
   Requires only a constant O(1) extra memory space.
   It requires less number of swaps (or memory writes) compared to many other standard algorithms. Only cycle sort beats it in terms of memory writes. Therefore it can be simple algorithm choice when memory writes are costly.
   Disadvantages of the sortings.Selection Sort
   sortings.Selection sort has a time complexity of O(n^2) makes it slower compared to algorithms like sortings.Quick Sort or sortings.Merge Sort.
   Does not maintain the relative order of equal elements which means it is not stable.
 */
public class Selection {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selectionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr,int n){
        for(int i=0;i<=n-2;i++){
            int max=Integer.MIN_VALUE;
            int ind=-1;
            for(int j=0;j<=n-i-1;j++){
                if(arr[j]>max){
                    max=arr[j];
                    ind=j;
                }
            }
            swap(arr,ind,n-i-1);

        }
    }
    static void swap(int[] arr,int st,int end){
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
    }
}
