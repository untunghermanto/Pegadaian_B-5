package co.id.pegadaian.sprint.b5;
import java.util.ArrayList;

import co.id.pegadaian.sprint.b5.data.Data;
import co.id.pegadaian.sprint.b5.data.Read;

public class Inventory {

	public void showDataInventory() {
		Read read = new Read();
		
	    ArrayList<Data> dataArrayList = read.readData();

		String formatter = "| %-4s | %-15s | %-10s | %-25s | %-15s |";

		System.out.println("+------+-----------------+------------+---------------------------+-----------------+");
		System.out.println(String.format(formatter, "ID", "Product", "Category", "Description", "Price"));
		System.out.println("+------+-----------------+------------+---------------------------+-----------------+");

		for (Data data : dataArrayList) {
			if (data.getStatus().equalsIgnoreCase("gadai"))
				System.out.println(String.format(formatter, data.getId(), data.getNama(), data.getProductCategory(), data.getDescription(), data.getPrice()));
		}

		System.out.println("+------+-----------------+------------+---------------------------+-----------------+");
	}




}
