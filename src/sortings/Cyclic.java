package sortings;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr={1,4,5,3,2};
        cyclicSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr, int length) {
        int i=0;
        while(i<length){

            int crtInd=arr[i]-1;
            if(arr[i]!=arr[crtInd]){
                swap(arr,i,crtInd);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int st,int end){
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
    }

}
