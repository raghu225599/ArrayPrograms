//2. WAP to sort an array using Quick Sort Algorithm.
import java.util.Random;
import java.util.Arrays;
public class QuickSort {

    public static void main(String[] args) {
        int[] arr={80,70,30,5,16,10};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr){
        int start=0,end=arr.length-1;
        quickSort(arr,start,end);
    }
    public static void quickSort(int[] arr,int start,int end){
        if(start>end||end-start==0){
            return;
        }
        int pivot=partition(arr,start,end);
        quickSort(arr,start,pivot-1);
        quickSort(arr,pivot+1,end);
    }
    public static int  partition(int[] arr,int start,int end){
        Random ran=new Random();
        int pivot =ran.nextInt(start,end+1);
        while(start<end){
            while(arr[start]>=arr[pivot] && arr[end]<=arr[pivot]){
                swap(arr,start,end);
                if(start==pivot||end==pivot) {
                    if (start == pivot) {
                        pivot = end;
                    } else {
                        pivot = start;
                    }
                }
            }
            while(arr[start]<arr[pivot]){
                start++;
            }
            while(arr[end]>arr[pivot]){
                end--;
            }
        }
        return pivot;
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
