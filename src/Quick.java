import java.util.Arrays;

/*
    Advantages of Quick Sort
  It is a divide-and-conquer algorithm that makes it easier to solve problems.
  It is efficient on large data sets.
  It has a low overhead, as it only requires a small amount of memory to function.
  It is Cache Friendly as we work on the same array to sort and do not copy data to any auxiliary array.
  Fastest general purpose algorithm for large data when stability is not required.
  It is tail recursive and hence all the tail call optimization can be done.
   Disadvantages of Quick Sort
  It has a worst-case time complexity of O(n2), which occurs when the pivot is chosen poorly.
  It is not a good choice for small data sets.
  It is not a stable sort, meaning that if two elements have the same key, their relative order will not be preserved in the sorted output in case of quick sort, because here we are swapping elements according to the pivot's position (without considering their original positions).
 */
public class Quick {
    public static void main(String[] args) {
        int[] arr= {10,7,8,9,1,5};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr,int low,int high){
        if(low < high){

            int partitionIndex = partition(arr,low,high);

            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }
    static int partition(int[] arr,int low,int high){
        int pivot= arr[high];

        int i=low-1;

        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }

        swap(arr,i+1,high);
        return i+1;
    }
    static void swap(int[] arr,int st,int end){
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
    }
}
