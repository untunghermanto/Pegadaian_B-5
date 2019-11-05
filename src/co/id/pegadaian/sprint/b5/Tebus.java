package co.id.pegadaian.sprint.b5;
import co.id.pegadaian.sprint.b5.data.Data;
import co.id.pegadaian.sprint.b5.data.Read;
import co.id.pegadaian.sprint.b5.data.Write;

import java.util.ArrayList;
import java.util.Scanner;


import java.util.Scanner;

public class Tebus {
	
	public static void tebus() {
		
		Read read = new Read();
        ArrayList<Data> dataArrayList = read.readData();
        
        Scanner inputMenu = new Scanner(System.in);
        boolean loopStatus = true;
        long price = 0;
        int utang=0;
        int tebus = 0;
        int id = 0;
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|ID|                PRODUCT|          PRICE|           STATUS|             UTANG|");
        System.out.println("---------------------------------------------------------------------------------");
        for (int i=0; i< dataArrayList.size(); i++) {
            System.out.println("| " +dataArrayList.get(i).getId()+"|             " +dataArrayList.get(i).getProductCategory() +"|      "+dataArrayList.get(i).getPrice() +"|         "+dataArrayList.get(i).getStatus()  +"|      "+dataArrayList.get(i).getPrice());    
            
            }
        System.out.println("---------------------------------------------------------------------------------");
 
        while(loopStatus) {
            try {
                System.out.print("Masukkan ID barang yang ingin ditebus:");
                id=inputMenu.nextInt();
                int flag=0;
                for (Data data : dataArrayList) {
                	if (data.getId() == id) {
                		loopStatus = false;
                		flag = 1;
                		break;
                    } 
                }
                if (flag==0) {
                	System.out.println("Id tidak ada");
                    
				}
                

            }catch(Exception e){
                System.out.println("Inputan yang anda masukkan salah");
                inputMenu.next();
                continue;
            }
        }

                
        
	}
}
