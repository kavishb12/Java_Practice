package academy.learnjava;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Input");
        }
        else{
            int RkiloBytes = kiloBytes%1024;
            int megaBytes = kiloBytes/1024;
            System.out.println(kiloBytes+" KB = "+megaBytes+ " MB and "+RkiloBytes+" KB");
        }

    }
}
