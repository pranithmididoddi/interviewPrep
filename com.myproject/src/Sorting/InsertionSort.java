package Sorting;

public class InsertionSort {

    public void insertionSort(int[] array){

        for(int i=1;i<array.length;i++){
            for(int j=i;j>0;j--){
                if(array[j]>array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }
    }
}
