package co.id.pegadaian.sprint.b5.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read {
    public ArrayList<Data> readData(){
        ArrayList<Data> dataArrayList = new ArrayList<>();

        try {
            File f = new File("data gadai.txt");

            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine = "";

            System.out.println("Reading file using Buffered Reader");

            while ((readLine = b.readLine()) != null) {
                String[] dataList = readLine.split("~");

                Data data = new Data(
                        Integer.parseInt(dataList[0]),
                        dataList[1],
                        dataList[2],
                        dataList[3],
                        Long.parseLong(dataList[4]),
                        dataList[5],
                        Long.parseLong(dataList[6])
                );
                dataArrayList.add(data);
                //System.out.println(readLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataArrayList;
    }
}
