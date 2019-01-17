import java.io.*;

public class Aufgabe3 {
    public static void main(String[] args) throws IOException {
        File file = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        String zeilenumbruch = System.getProperty("line.separator");
        try {
            file = new File("test2.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < 5 ; i++) {
                bw.write( (i+1) + zeilenumbruch);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        } finally {
            bw.close();
        }
    }
}
