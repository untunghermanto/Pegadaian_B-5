package co.id.pegadaian.sprint.b5;

import co.id.pegadaian.sprint.b5.data.Data;
import co.id.pegadaian.sprint.b5.data.Read;
import co.id.pegadaian.sprint.b5.data.Write;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Data dataGadai = new Data();

    	Scanner inputMenu=new Scanner(System.in);
		System.out.println("Pegadaian System");
		for (int i = 0; i < 16; i++) {
			System.out.print('=');
			
		}
		System.out.println();
		System.out.println("1. Gadai\n2. Tebus\n3. Tampilkan Inventory\n4. Exit");
		boolean notExitStatus=true;
		do {
			
			try {System.out.print("Opsi :");
			int pilihanMenu=inputMenu.nextInt();
			
				if (pilihanMenu>4 ||pilihanMenu<1) {
					System.out.println("Inputan yang anda masukkan salah");
				}
				else if (pilihanMenu==1) {
				}
				else if(pilihanMenu == 2) {
			
				}
				else if(pilihanMenu==3){
					Inventory inven = new Inventory();
					inven.showDataInventory();
				}
				else {
					System.out.println("Aplikasi Ditutup");
					System.out.println("Bye");
					notExitStatus=false;
				}
				
			}catch(Exception e){
				System.out.println("Inputan yang anda masukkan salah");
				inputMenu.next();
				continue;
		
			}
		}while (notExitStatus);
        

        //Data data = new Data("Motor bebek", "Motor", "Kharisma", 0, "Gadai", 0);
        //Write write = new Write();
        //write.writeData(write.generateString(data));

        Read read = new Read();
        ArrayList<Data> dataArrayList = read.readData();
        System.out.println(dataArrayList.get(2).getUtang());
        dataArrayList.get(2).setUtang(20000);
        System.out.println(dataArrayList.get(2).getUtang());

        Write write = new Write();
        write.writeUpdateData(dataArrayList);
    }
}
