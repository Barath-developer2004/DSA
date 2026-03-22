package sortings;

import java.util.Arrays;
/*
   Advantages

  Stability : sortings.Merge sort is a stable sorting algorithm, which means it maintains the relative order of equal elements in the input array.
  Guaranteed worst-case performance: sortings.Merge sort has a worst-case time complexity of O(N logN) , which means it performs well even on large datasets.
  Simple to implement: The divide-and-conquer approach is straightforward.
  Naturally Parallel : We independently merge subarrays that makes it suitable for parallel processing.

  Disadvantages

  Space complexity: sortings.Merge sort requires additional memory to store the merged sub-arrays during the sorting process.
  Not in-place: sortings.Merge sort is not an in-place sorting algorithm, which means it requires additional memory to store the sorted data. This can be a disadvantage in applications where memory usage is a concern.
  sortings.Merge Sort is Slower than QuickSort in general as QuickSort is more cache friendly because it works in-place.
 */
public class Merge {
    public static void main(String[] args) {
        int[] arr={5,4,3,1,2};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
     static void mergeSort(int[] arr, int low, int high) {
         if(low < high){
             int mid = low+(high-low)/2;
             mergeSort(arr, low, mid);
             mergeSort(arr,mid+1,high);

             Algo(arr,low,mid,high);
         }
     }

    static void Algo(int[] arr, int low, int mid, int high) {

       int size1 = mid - low +1;
       int size2 = high - mid;

       int[] temp = new int[size1+size2];

       int left= low;
       int right=mid+1;
       int ind=0;
       while(left<=mid && right<=high){
           if(arr[left]<=arr[right]){
               temp[ind]=arr[left];
               left++;

           }else{
               temp[ind]=arr[right];
               right++;
           }
           ind++;
       }
       while(left<=mid){
           temp[ind]=arr[left];
           left++;
           ind++;
       }
       while(right<=high){
           temp[ind]=arr[right];
           right++;
           ind++;
       }
       for(int i=low;i<=high;i++){
           arr[i]=temp[i-low];
       }

    }

}

