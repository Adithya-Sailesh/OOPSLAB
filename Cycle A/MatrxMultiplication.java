import java.util.*;
public class MatrixMultiplication {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[10][10];
        int brr[][]=new int[10][10];
        int crr[][]=new int[10][10];
        System.out.println("Enter the number of rows of 1 matrix");
        int n=sc.nextInt();
        System.out.println("Enter the number of coulmn of 1 matrix");
        int m=sc.nextInt();
        System.out.println("Enter the number of Second matrix");
        int p=sc.nextInt();
        System.out.println("Enter the number of column 2 matrix");
        int q=sc.nextInt();
        System.out.println("Enter the elements in first matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements in second matrix");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                 brr[i][j]=sc.nextInt();
            }
        }
        if(n!=p){
            System.out.println("Cannot Multiply");

        }
        else{
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    int sum=0;
                    for(int k=0;k<n;k++){
                            sum=sum+arr[i][k]*brr[k][j];
                    }
                    crr[i][j]=sum;
                }
            }
            for(int i=0;i<p;i++){
                for(int j=0;j<q;j++){
                    System.out.print("\t"+crr[i][j]);
                }System.out.println();
            }
        }
    }
}
