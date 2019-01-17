import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Aufgabe4 {
    public static void main(String[] args) {
        File fileroot = null;
        try {
            fileroot = new File("testfolder");
            String[] paths;
            paths = fileroot.list();
            for (String s:paths){
                System.out.println("Dateinhalt von: "+fileroot.getPath()+"/"+ s);
                File file = null;
                FileReader fr = null;
                BufferedReader br = null;
                try {
                    file = new File(fileroot.getPath()+"/"+s); // auf Mac/Linux werden Ordnersturkturen mit / dargestellt, bei Windows dies ersetzen durch \\
                    fr = new FileReader(file);
                    br = new BufferedReader(fr);
                    ArrayList<String> arrayList = new ArrayList<>();
                    while (true) {
                        String zeile = br.readLine();
                        if(zeile==null) break;
                        arrayList.add(zeile);
                    }
                    for(String st: arrayList){
                        System.out.println(st);
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
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
