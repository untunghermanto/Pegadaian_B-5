package co.id.pegadaian.sprint.b5;

import co.id.pegadaian.sprint.b5.data.Data;
import co.id.pegadaian.sprint.b5.data.Read;
import co.id.pegadaian.sprint.b5.data.Write;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	boolean notExitStatus = true;

    	do {
			Scanner inputMenu=new Scanner(System.in);
			System.out.println("Pegadaian System");

			for (int i = 0; i < 16; i++) {
				System.out.print('=');
			}

			System.out.println();
			System.out.println("1. Gadai\n2. Tebus\n3. Tampilkan Inventory\n4. Exit");

			try {
				System.out.print("Opsi :");

				int pilihanMenu = inputMenu.nextInt();
			
				if (pilihanMenu > 4 || pilihanMenu < 1) {
					System.out.println("Inputan yang anda masukkan salah");
				} else if (pilihanMenu == 1) {
					new Gadai().gadai();
				} else if(pilihanMenu == 2) {
					Tebus.tebus();
				} else if(pilihanMenu == 3){
					new Inventory().showDataInventory();
				} else {
					System.out.println("Aplikasi Ditutup");
					System.out.println("Bye");
					notExitStatus = false;
				}
			} catch(Exception e){
				System.out.println("Inputan yang anda masukkan salah");
				inputMenu.next();
				continue;
			}
		} while (notExitStatus);
    }
}
