package co.id.pegadaian.sprint.b5.data;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Write {
    public void writeData(String nombreArchivo) {
        
        FileWriter fw = null;
        try{
            File f = new File("data gadai.txt");
            fw = new FileWriter(f, true);
        }catch(Exception e){
            e.printStackTrace();
        }

        PrintWriter pw = new PrintWriter(fw);
        pw.println(nombreArchivo);
        pw.flush();

        try{
            fw.flush();
            pw.close();
            fw.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
