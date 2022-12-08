import java.io.*;
import java.util.*;
class StringTokenizerWithFile{
    public static void main(String[] args) {
        try{
            FileWriter Mywriter=new FileWriter("Hello.txt"); //entering element
            Mywriter.write("Adithya 123 Sailesh 456 \n");
            
            Mywriter.close();
            System.out.println("inserted");
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{                                                //displaying data in file chumma for rassam
            File obj=new File("Hello.txt");
            Scanner sc=new Scanner(obj);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
           }

        catch(Exception e){
            System.out.println(e);
        }
        try{                                                //reading and using String tokenizer for taking each token
            File obj=new File("Hello.txt");
            Scanner sc=new Scanner(obj);
            while(sc.hasNextLine()){
                String data=sc.nextLine();
                StringTokenizer st=new StringTokenizer(data," ");
                while(st.hasMoreTokens()){
                    String nm=st.nextToken();
                    System.out.println("Name: "+nm);
                    int n=Integer.parseInt(st.nextToken());
                    System.out.println("Number:"+n);
                }
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
