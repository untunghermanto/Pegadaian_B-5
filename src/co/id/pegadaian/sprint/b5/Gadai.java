package co.id.pegadaian.sprint.b5;
import java.util.Scanner;
public class Gadai {
    public static void Gadai(){

        Scanner inputMenu=new Scanner(System.in);
        boolean loopStatus = true;
        String nama = "";
        String product = "";
        String description = "";
        long price = 0;

        //loop Nama
        while(loopStatus)
        {
            try {
                System.out.print("Nama :");
                nama=inputMenu.nextLine();

                if (nama.length()<3 ||nama.length()>15) {
                    System.out.println("Inputan yang anda masukkan salah");
                }else
                {
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
        


    }
}
