package sort;

public class bubblesort {
    public static void main(String[] args) {
    int arr[]={5,4,2,3,1};
    int temp;
    System.out.println("sortted array is the");
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                // swap
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }  
        }
    }
       System.out.println( arr[arr.length-1]);
         


    }
}
