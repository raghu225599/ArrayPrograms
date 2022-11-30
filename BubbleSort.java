//3. WAP to sort an array using Bubble Sort Algorithm.
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {50, 80, 30, 27, 40, 10, 12};
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length-i;j++) {
                if (j+1<arr.length && arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}