import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Aufgabe1 {

    public static void main(String[] args) {
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            file = new File("test.txt"); // relativer pfad im project
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            ArrayList<String> arrayList = new ArrayList();
            while (true) {
                String zeile = br.readLine();
                if(zeile==null) break;
                arrayList.add(zeile);
            }
            for(String s: arrayList){
                System.out.println(s);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        } finally{
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
