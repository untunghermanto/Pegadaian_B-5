package co.id.pegadaian.sprint.b5;
import java.util.ArrayList;

import co.id.pegadaian.sprint.b5.data.Data;
import co.id.pegadaian.sprint.b5.data.Read;

public class Inventory {

	public Inventory() {
		
	int i;
	Read read = new Read();
    ArrayList<Data> dataArrayList = read.readData();
	
	System.out.println("---------------------------------------------------------------------------------");
	System.out.println("|ID|                NAMA|          PRODUCT|           DESCRIPTION|         PRICE|");
	System.out.println("---------------------------------------------------------------------------------");
	}




}
