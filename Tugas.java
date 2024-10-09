import java.util.Scanner;

public class Tugas {

    /*
    buatkan sebuah program yang mengambil 2 input number dari user
    program tersebut akan print out yang paling besar
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int x;
        int y;
        System.out.println("masukan nilai x: ");
        x = scanner.nextInt();
        System.out.println("masukan nilai y: ");
        y = scanner.nextInt();

        if(x > y){
            System.out.println("nilai " + x + " lebih besar dari nilai " + y);

        }else if(y > x ){
            System.out.println("nilai " + y + " lebih besar dari nilai " + x);

        }else{
            System.out.println("kedua angka sama besarnya");
            System.exit( 0);
        }

    }
}