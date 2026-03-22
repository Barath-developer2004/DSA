import java.util.Arrays;

public class Radix {
    public static void main(String[] args) {
        int[] arr={107,45,75,90,802,24,2,66};
        radixSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
   static void radixSort(int[] arr, int length) {
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        for(int exp=1; max/exp>0;exp*=10){
            countSort(arr,arr.length,exp);
        }
    }
    static void countSort(int[] arr, int n, int exp) {
        int[] output=new int[n];
        int[] cnt=new int[10];

        for(int i=0;i<n;i++){
            cnt[(arr[i]/exp)%10]++;
        }
        for(int i=1;i<10;i++){
            cnt[i]=cnt[i]+cnt[i-1];
        }
        for(int i=n-1;i>=0;i--){
            output[cnt[(arr[i]/exp)%10]-1]=arr[i];
            cnt[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }

    }

}
