//import library Scanner
import java.util.Scanner; 
public class JavaChallange2 {
    public static void main(String[] args){
    int angka;
    String pesan;

    Scanner input = new Scanner(System.in);;

    System.out.println("*-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-");
    System.out.println("Rentang nilai " + "\n");
    System.out.println("A" + " : " + "81 - 100" + "\n" +
                        "B" + " : " + "61 - 80" + "\n" +
                        "C" + " : " + "41 - 60" + "\n" +
                        "D" + " : " + "21 - 40" + "\n" +
                        "E" + " : " + "0 - 20" + "\n");
    
    System.out.println("Hay Tasya, Silahkan input nilai kamu : ");
    angka = input.nextInt();
    

    if(angka >= 0 && angka <= 20){
        pesan = angka + " maka Grade E, Berusaha belajar labih giat lagi!";
    }else if(angka >= 21 && angka <= 40){
        pesan = angka + " maka Grade D, Lebih semangat lagi";
    }else if (angka >= 41 && angka <= 60){
        pesan = angka + " maka Grade C, Cukup bagus";
    }else if (angka >= 61 && angka <= 80){
        pesan = angka + " maka Grade B, Bagus hebat";
    }else if (angka >= 81 && angka <= 100){
        pesan = angka + " maka Grade A, Kamu Luar Biasa";
    }else {
        pesan = "Tidak Valid";
    }
    
    System.out.println("Nilai Kamu adalah " + pesan);
    System.out.println("*-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-");
    }
}