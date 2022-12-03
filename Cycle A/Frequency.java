import java.util.*;
public class Frequency {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=sc.nextLine();
        System.out.println("Enter the charatcter to find Frequency");
        String find=sc.nextLine();
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)==find.charAt(0)){
                count=count+1;
            }
        }
        System.out.println("Frequency ="+count);
    }
}
