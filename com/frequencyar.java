import java.util.Scanner;

class frequency{

    int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
int key;

void inputdata(){
    for(int i=0;i<5;i++){
        System.out.println("Enter the nmber");
        arr[i]=sc.nextInt();

    }
    System.out.println("Enter the key");
    key=sc.nextInt();

}
void count(){   
    int count=0;

    for(int i=0;i<5;i++){
        if(arr[i]==key){
            count=count+1;
        }
    }System.out.println("number is "+ count);
}
}
class frequencyar{
public static void main(String args[]){
 
    frequency aa=new frequency();
    aa.inputdata();
    aa.count();

}}