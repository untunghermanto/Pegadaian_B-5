package co.id.pegadaian.sprint.b5;
import co.id.pegadaian.sprint.b5.data.Data;
import co.id.pegadaian.sprint.b5.data.Read;
import co.id.pegadaian.sprint.b5.data.Write;

import java.util.ArrayList;
import java.util.Scanner;

public class Gadai {
    public void gadai(){

        Scanner inputMenu = new Scanner(System.in);
        boolean loopStatus = true;
        String nama = "";
        String product = "";
        String description = "";
        long price = 0;

        //loop Nama
        while(loopStatus) {
            try {
                System.out.print("Nama :");
                nama=inputMenu.nextLine();

                if (nama.length()<3 ||nama.length()>15) {
                    System.out.println("Inputan yang anda masukkan salah");
                } else {
                    loopStatus = false;
                }

            }catch(Exception e){
                System.out.println("Inputan yang anda masukkan salah");
                inputMenu.next();
                continue;
            }
        }

        loopStatus = true;
        //loop Nama end
        //loop Product Category
        while(loopStatus) {
            try {
                System.out.print("Product Category :");
                product=inputMenu.nextLine();

                if (product.equalsIgnoreCase("Laptop")||product.equalsIgnoreCase("Motor")||product.equalsIgnoreCase("Emas")) {
                    loopStatus = false;

                } else {
                    System.out.println("Inputan yang anda masukkan salah");
                }

            } catch(Exception e){
                System.out.println("Inputan yang anda masukkan salah");
                inputMenu.next();
                continue;
            }
        }

        loopStatus = true;
        //loop Product Category end
        //loop Description
        while(loopStatus)
        {
            try {
                System.out.print("Description :");
                description=inputMenu.nextLine();
                description = description.trim();

                if (description.contains(" ")) {
                    loopStatus = false;

                } else {
                    System.out.println("Inputan yang anda masukkan salah");
                }

            } catch(Exception e){
                System.out.println("Inputan yang anda masukkan salah");
                inputMenu.next();
                continue;
            }
        }

        loopStatus = true;
        //loop Description end
        //loop Price
        while(loopStatus) {
            try {
                System.out.print("Price :");
                price=inputMenu.nextLong();

                if (price%10000 == 0 && price >0) {
                    loopStatus = false;

                } else {
                    System.out.println("Inputan yang anda masukkan salah");
                }

            } catch(Exception e){
                System.out.println("Inputan yang anda masukkan salah");
                inputMenu.next();
                continue;
            }
        }

        //loop Price end
        System.out.println("Detail Information :");
        System.out.println("==================================");
        System.out.println("Name : " + nama);
        System.out.println("Product Category : " + product);
        System.out.println("Description : " + description);
        System.out.println("Price : " + price);
        //Data data = new Data(nama, product, description, price, "Gadai", price);
        new Write().writeNewData(new Data(nama, product, description, price, "Gadai", price));
    }
}
