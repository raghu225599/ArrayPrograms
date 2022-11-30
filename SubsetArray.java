//6. WAP to check whether an array is a subset of another array.
public class SubsetArray {
    public static void main(String[] args){
        int[] intArray={10,92,87,12,15,45};
        int[] subsetArray={45,92,10};
        int ifFlagBlock=0;
        for(int i=0;i<subsetArray.length;i++){
            int flag=0;
            for(int j=0;j<intArray.length;j++) {
                if(subsetArray[i]==intArray[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                ifFlagBlock=1;
                System.out.println("The subsetArray is not a subset of intArray");
                break;
            }
        }
        if(ifFlagBlock==0){
            System.out.println("given subsetArray is subset of intArray");
        }
    }
}