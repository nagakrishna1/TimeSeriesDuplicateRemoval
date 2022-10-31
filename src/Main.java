import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String inputStream = sc.nextLine();
      ArrayList<String> list = new ArrayList<>();
      while(inputStream!=null) {
      
        list.add(inputStream);
        if (sc.hasNextLine()) {
            inputStream = sc.nextLine();
        } else {
            inputStream = null;
        }
      }
      int n = list.get(0).length();
      String flag=list.get(0).substring(n - 1);
      for(int i=0;i<list.size();i++){
        n = list.get(i).length();
        if(list.get(i).substring(n - 1).equals(flag)){
           System.out.println(list.get(i));
           if(flag=="0"){
              flag="1";
           }else{
              flag="0";
           }
        }
      }
  }
}