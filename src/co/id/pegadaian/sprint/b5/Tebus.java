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
		long utang=0;

		int tebus = 0;
		int id = 0;
        String formatter = "| %-4s | %-15s | %-10s | %-25s | %-15s |";
        System.out.println("+------+-----------------+------------+---------------------------+-----------------+");
        System.out.println(String.format(formatter, "ID", "Product", "Price", "Status", "Utang"));
        System.out.println("+------+-----------------+------------+---------------------------+-----------------+");
		for (Data value : dataArrayList) {
			if (!value.getStatus().equalsIgnoreCase("Lunas")) {
			    System.out.println(String.format(formatter, value.getId(), value.getProductCategory(), value.getPrice(), value.getStatus(), value.getUtang()));
			}
		}
        System.out.println("+------+-----------------+------------+---------------------------+-----------------+");

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
		loopStatus = true;
		while(loopStatus) {
			try {
				System.out.print("Masukkan uang yang ingin anda bayarkan:");
				utang=inputMenu.nextLong();
				int flag=0;
				for(int i =0;i<dataArrayList.size();i++) {
					if (dataArrayList.get(i).getId() == id) {
						long sisa = 0;
						sisa = dataArrayList.get(i).getUtang()-utang;
						if (sisa>0) {
							dataArrayList.get(i).setUtang(sisa);
							System.out.println("Pembayaran telah diterima. Sisa hutang anda adalah "+sisa);
							loopStatus = false;
							flag = 1;
							break;
						} else if(sisa == 0) {
							dataArrayList.get(i).setUtang(sisa);
							dataArrayList.get(i).setStatus("Lunas");
							System.out.println("Pinjaman anda telah lunas.");

							loopStatus = false;
							flag = 1;
							break;
						} else if(sisa<0) {
							System.out.println("Pembayaran anda melebihi sisa pinjaman anda. Sisa pinjaman anda adalah "+dataArrayList.get(i).getUtang());
							flag = 1;
						}
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
		new Write().writeUpdateData(dataArrayList);
	}
}
