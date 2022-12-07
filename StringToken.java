import java.util.*;
import java.io.*;
public class StringToken{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string of number with space");
        String str=sc.nextLine();
        StringTokenizer st=new StringTokenizer(str," ");
        int sum=0;
        int n;
        int c;
        while(st.hasMoreTokens()){
            n=Integer.parseInt(st.nextToken());
            sum=sum+n;
        }
        System.out.println(" sum"+sum);
    }
}
