import java.util.*;

class Selection {
    private Scanner sc = new Scanner(System.in);
    private int arr[] = new int[5];

    void select() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number");
            arr[i] = sc.nextInt();
        }
    }

    void sort1() {
         int i,j,val;
        for ( i = 1; i < 5; i++) {
         //arr=14,3,5
        val=arr[i];
        j=i-1;
        while(val<arr[j]){
          arr[j+1]=arr[j];
          j--;
          if(j==-1)
            break;
        }
        arr[j+1]=val;
        }
    }

    void output() {
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class bubble_sort {
    public static void main(String[] args) {
        Selection selection = new Selection();
        selection.select();

        System.out.println("Unsorted array:");
        selection.output();

        System.out.println("Sorting array...");
        selection.sort1();

        System.out.println("Sorted array:");
        selection.output();
    }
}
