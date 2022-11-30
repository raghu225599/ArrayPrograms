//5. WAP to sort an array using Selection Sort Algorithm.
public class SelectionSort {
    public static void main(String[] args){
        int[] arr={60,72,54,85,32,64,28,26,14,10,9};
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
