import java.util.*;

class Matrix{
    int row;
    int col;
    Matrix(int a ,int b){
        row=a;
        col=b;
    }
}
public class MatrixMulti {
 public static void main(String args[]){
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        int c[][]=new int[10][10];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows for 1st matrix");
        int r1=sc.nextInt();
        System.out.println("Enter the number of Columnss for 1st matrix");
        int c1=sc.nextInt();
        Matrix M1=new Matrix(r1,c1);
        System.out.println("Enter the number of rows for 2st matrix");
        int r2=sc.nextInt();
        System.out.println("Enter the number of Columnss for 2st matrix");
        int c2=sc.nextInt();
        Matrix M2=new Matrix(r2,c2);
        System.out.println("Enter the elements of first matrix");
        for(int i=0;i<M1.row;i++){
            for(int j=0;j<M1.col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of first matrix");
        for(int i=0;i<M2.row;i++){
            for(int j=0;j<M2.col;j++){
                b[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<M1.row;i++){
            for(int j=0;j<M2.col;j++){
                c[i][j]=0;
                for(int k=0;k<M1.col;k++){
                    c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                }
                
            }
        }
        for(int i=0;i<M1.row;i++){
            for(int j=0;j<M2.col;j++){
                System.out.print("\t"+c[i][j]);
            }System.out.println();
        }
      
    }
    

}
