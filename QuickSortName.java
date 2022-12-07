import java.util.*;
public class QuickSortName{
    public int part(String arr[],int low,int high){
         String pivot=arr[low];
         int left=low;
         int right=high;
         while(left<right){
             while(arr[left].compareTo(pivot)<=0){
                 left=left+1;
             }
             while(arr[right].compareTo(pivot)>0){
                 right=right-1;
             }
             if(left<right){
                 String temp=arr[left];
                 arr[left]=arr[right];
                 arr[right]=temp;
             }
         }arr[low]=arr[right];
         arr[right]=pivot;
         return right;
    }
    public void quicksort(String arr[],int low,int high){
        if(low<high){
            int p=part(arr,low,high);
            quicksort(arr,low,p-1);
            quicksort(arr,p+1,high);
        }

    }
    public static void main(String arhg[]){
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[10];
        QuickSortName obj=new QuickSortName();
        System.out.println("Enter the number of names");
        int n=sc.nextInt();
        System.out.println("Enter the names");
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
            
        }
        obj.quicksort(arr,0,n-1);
        System.out.println("Sorted list");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
}
