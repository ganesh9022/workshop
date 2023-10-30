
import java.util.*;

public class binary_search {
    public static void main(String args[]){
  int arr[]=new int[5];
    int key;
    Scanner sc=new Scanner(System.in);

     for(int i=0;i<5;i++){
               System.out.println("Enter the array");
                arr[i]=sc.nextInt();
  
  System.out.println("enter the key");
  key=sc.nextInt();
int in=0, j=4,mid,flag=0,pos;

 mid=(in+j)/2;
 while(in<=j && flag==0)   
 {  
   if(arr[mid]<key){
   flag=1;
   pos=mid+1;
   }
   if(arr[mid]<key){
   j=mid-1;
   }
   if(arr[mid]>key){
    in=mid+1;
   }
 }
 if(flag==1){
  System.out.println("found");
 }
 else{
    System.out.println("not found");
 }
}

    }
}
