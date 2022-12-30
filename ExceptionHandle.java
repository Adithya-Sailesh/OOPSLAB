import java.util.Scanner;
public class ExceptionHandle {
  void add(int[] a,int[] b) throws IndexOutOfBoundsException{
      if(a.length!=b.length){
          throw new IndexOutOfBoundsException("out of range");
      }
      else{
          for(int i=0;i<a.length;i++){
              System.out.println(a[i]+b[i]);
          } } }
  public static void main(String args[]){
      ExceptionHandle h= new ExceptionHandle();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of elements in 1");
      int n=sc.nextInt();
      System.out.println("Enter the number of elements in 2");
      int m=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[m];
      System.out.println("Enter the elements in a");
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      System.out.println("Enter the elements in b");
      for(int i=0;i<m;i++){
        b[i]=sc.nextInt();
      }
      try{
          h.add(a,b);
      }
      catch(IndexOutOfBoundsException e){
          System.out.println("caught"+e);
      }
      finally{
          System.out.println("Completed program");
      } }     }
