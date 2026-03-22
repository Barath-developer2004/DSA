package sortings;

import java.util.Arrays;

public class Counting {
    public static void main(String[] args) {
        int[] arr={2,5,3,0,2,3,0,3};
        countingSort(arr);
    }
    static void countingSort(int[] arr) {
        if(arr.length==0){
            return;
        }

        int max=arr[0];
        for(int num: arr){
            if(num>max){
                max=num;
            }
        }
        int[] cntArr=new int[max+1];
        for(int i=0;i<arr.length;i++){
            cntArr[arr[i]]++;
        }

        // compute prefix sum to make it stable
        for(int i=1;i<=max;i++){
            cntArr[i]=cntArr[i]+cntArr[i-1];
        }
        // place the element in it is correct index.
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int val=arr[i];
            ans[cntArr[val]-1]=val;
            cntArr[val]--;
        }
        System.out.println(Arrays.toString(ans));
    }

}
