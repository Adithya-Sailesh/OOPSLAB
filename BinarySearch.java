import java.util.*;
public class BinarySearch{
    public static void main(String arg[]){
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        System.out.println("Enter the sorted");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the searching element");
        int ch=sc.nextInt();
        int flag=0;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==ch){
                System.out.println("Found at index"+mid);
                flag=1;
                break;
            }
            else if(ch>=arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if(flag==0){
            System.out.println("Not found");
        }
    }
}
