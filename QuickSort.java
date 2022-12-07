public class QuickSort{
    public  int partition(int arr[],int low,int high){
        int pivot=arr[low];
        int left=low;
        int right=high;
        while(left<right){
            while(arr[left]<=pivot){
                left=left+1;
            }
            while(arr[right]>pivot){
                right=right-1;
            }
            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        
        arr[low]=arr[right];
        arr[right]=pivot;
        return right;
        }

    
    public void quicksort(int arr[],int low,int high){
        if(low<high){
        int p=partition(arr,low,high);
        quicksort(arr,low,p-1);
        quicksort(arr,p+1,high);   
        }

    }
    public static void main(String arg[]){
        QuickSort o=new QuickSort();
        int [] arr={3,5,97,8,98,34,6};
        o.quicksort(arr,0,6);
        for(int i=0;i<7;i++){
            System.out.println(arr[i]);
        }
    }
}
