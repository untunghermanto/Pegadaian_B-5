package co.id.pegadaian.sprint.b5;
import co.id.pegadaian.sprint.b5.data.Data;
import co.id.pegadaian.sprint.b5.data.Read;
import co.id.pegadaian.sprint.b5.data.Write;

import java.util.ArrayList;
import java.util.Scanner;


import java.util.Scanner;

public class Tebus {
	
	public void tebus() {
		
		Read read = new Read();
        ArrayList<Data> dataArrayList = read.readData();
        
        Scanner inputMenu = new Scanner(System.in);
        boolean loopStatus = true;
        long price = 0;
        int utang=0;
        int tebus = 0;

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|ID|                PRODUCT|          PRICE|           STATUS|             UTANG|");
        System.out.println("---------------------------------------------------------------------------------");
        for (int i=0; i< dataArrayList.size(); i++) {
            System.out.println("| " +dataArrayList.get(i).getId()+"|             " +dataArrayList.get(i).getProductCategory() +"|      "+dataArrayList.get(i).getPrice() +"|         "+dataArrayList.get(i).getStatus()  +"|      "+dataArrayList.get(i).getPrice());    
            
            }

                
        
	}
}
