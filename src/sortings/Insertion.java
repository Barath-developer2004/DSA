package sortings;

import java.util.Arrays;
 /*
   Advantages
   Simple and easy to implement.
   Stable sorting algorithm.
   Efficient for small lists and nearly sorted lists.
   Space-efficient as it is an in-place algorithm.
   Adoptive. the number of inversions is directly proportional to number of swaps. For example, no swapping happens for a sorted array and it takes O(n) time only.
   Disadvantages

   Inefficient for large lists.
   Not as efficient as other sorting algorithms (e.g., merge sort, quick sort) for most cases.
  */
public class Insertion {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        insertionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr,int n){
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int st,int end){
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
    }
}
