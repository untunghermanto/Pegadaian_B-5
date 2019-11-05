package co.id.pegadaian.sprint.b5;
import java.util.ArrayList;

import co.id.pegadaian.sprint.b5.data.Data;
import co.id.pegadaian.sprint.b5.data.Read;

public class Inventory {

	public void showDataInventory() {
		Read read = new Read();
		
	    ArrayList<Data> dataArrayList = read.readData();
		
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("|ID|                NAMA|          PRODUCT|           DESCRIPTION|         PRICE|");
		System.out.println("---------------------------------------------------------------------------------");
	
		for (int i=0; i< dataArrayList.size(); i++) {
			System.out.println("| " +dataArrayList.get(i).getId() + "|    " +dataArrayList.get(i).getNama() + "|       " +dataArrayList.get(i).getProductCategory() + "|         "+dataArrayList.get(i).getDescription()  +"|      "+dataArrayList.get(i).getPrice());	
			
			}
	}




}
