import java.util.Arrays;
/*
  Advantages of Bubble Sort:
   Bubble sort is easy to understand and implement.
   It does not require any additional memory space.
   It is a stable sorting algorithm, meaning that elements with the same key value maintain their relative order in the sorted output.
  Disadvantages of Bubble Sort:
   Bubble sort has a time complexity of O(n^2) which makes it very slow for large data sets.
   Bubble sort has almost no or limited real world applications. It is mostly used in academics to teach different ways of sorting.
 */
public class Bubble {
    public static void main(String[] args) {
         int[] arr ={5,6,1,3,0,2,-1};
         bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr, int n){
          for(int i=0;i<n;i++){
              boolean swapped = false;
              for(int j=0;j<n-1-i;j++){
                  if(arr[j]>arr[j+1]){
                      swap(arr, j, j+1);
                      swapped=true;
                  }
              }
              if(!swapped){
                  break;
              }
          }

    }
    static void swap(int[] arr,int st,int end){
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
    }
}