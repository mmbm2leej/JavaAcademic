import java.util.Scanner;
import java.io.File;

public class FileReader {

   public static void main(String[] args) throws Exception  {

     File f = new File("textfile.txt");
     Scanner scan = new Scanner(f);

     int cntDay=0;

     while (scan.hasNextLine()) {
       String s = scan.nextLine();
       // System.out.println(s);
       String[] s_arr = s.split(" ");

       for (int i=0; i<s_arr.length; i++)
          if (s_arr[i].toLowerCase().contains("day"))
             cntDay++;

     }  

     System.out.println("count day = " + cntDay);  

   }


}
