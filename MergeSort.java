//4. WAP to sort an array using Merge Sort Algorithm.
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args){
        int[] arr={70,24,60,80,10,11,90};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr){
        int start=0;
        int end=arr.length-1;
        mergeSort(arr,start,end);
    }
    public static void mergeSort(int[] arr,int s,int e){
        if(e-s==0){
            return;
        }
        int mid=(s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);

        mergeAlgorithm(arr,s,mid,e);
    }
    static void mergeAlgorithm(int[] arr,int start ,int mid ,int end){
        int k=0,i=start,j=mid+1;
        int[] mix=new int[end-start+1];
        while(i<=mid&&j<=end){
            if(arr[i]>arr[j]){
                mix[k]=arr[j];
                j++;
                k++;
            }
            else{
                mix[k]=arr[i];
                i++;
                k++;
            }
        }
        while(i<=mid){
            mix[k]=arr[i];
            k++;
            i++;
        }
        while(j<=end){
            mix[k]=arr[j];
            k++;
            j++;
        }

        k=0;
        while(k<mix.length) {
            arr[start+k] = mix[k];
            k++;
        }
    }
}
