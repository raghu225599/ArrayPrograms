public class DuplicatesNumbers {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
       // 1. WAP to find the duplicates present in an array.
        int [] arr={50,50,40,10,30,70};
        int[] store=new int[arr.length];
        int increase=0;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(isAnElementInStore(arr[i],store)){
                    break;
                }
                if(arr[i]==arr[j]){
                    store[increase++]=arr[i];
                }
            }
        }
        for(int k=0;k<store.length;k++){
            if(store[k]!=0)
                System.out.println(store[k]);
        }
    }
    static boolean isAnElementInStore(int element,int[] store){
        for(int k=0;k<store.length;k++) {
            if (element == store[k]){
                return true;
            }
        }
        return false;
    }
}