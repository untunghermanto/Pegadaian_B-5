package co.id.pegadaian.sprint.b5.data;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Write {

    private int generateID(){
        int id = -1;

        Read read = new Read();
        ArrayList<Data> dataArrayList = read.readData();

        for (Data data : dataArrayList) {
            id = data.getId();
        }

        id++;
        return id;
    }

    public String generateString(Data data){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(generateID() + "~");
        stringBuffer.append(data.getNama() + "~");
        stringBuffer.append(data.getProductCategory() + "~");
        stringBuffer.append(data.getDescription() + "~");
        stringBuffer.append(data.getPrice() + "~");
        stringBuffer.append(data.getStatus() + "~");
        stringBuffer.append(data.getUtang());

        return stringBuffer.toString();
    }

    private String generateUpdateData(ArrayList<Data> updateData){
        StringBuffer stringBuffer = new StringBuffer();

        for (Data updateDatum : updateData) {
            stringBuffer.append(updateDatum.getId() + "~");
            stringBuffer.append(updateDatum.getNama() + "~");
            stringBuffer.append(updateDatum.getProductCategory() + "~");
            stringBuffer.append(updateDatum.getDescription() + "~");
            stringBuffer.append(updateDatum.getPrice() + "~");
            stringBuffer.append(updateDatum.getStatus() + "~");
            stringBuffer.append(updateDatum.getUtang() + "\n");
        }
        
        return stringBuffer.toString();
    }

    public void writeUpdateData(ArrayList<Data> data){
        String updateData = generateUpdateData(data);

        FileWriter fw = null;
        try{
            File f = new File("data gadai.txt");
            fw = new FileWriter(f, false);
        }catch(Exception e){
            e.printStackTrace();
        }

        PrintWriter pw = new PrintWriter(fw);
        pw.print(updateData);
        pw.flush();

        try{
            fw.flush();
            pw.close();
            fw.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void writeNewData(Data data) {
        String nombreArchivo = generateString(data);
        
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
