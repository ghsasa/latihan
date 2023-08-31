import java.util.Scanner;

public class JobVacancy{
    public static void main(String[] args){
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jenisKelamin;
        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2;
        boolean isPassingKoor, isPassingAdmin;
        Scanner input = new Scanner (System.in);

        System.out.println("Selamat datang di PT. NEO Technology");
        System.out.println("=========================================\n");
        System.out.println("Silahkan input Data Anda");
        System.out.println("Nama : ");
        nama = input.next();

        System.out.println("Umur : ");
        umur = input.nextInt();

        System.out.println("Jenis Kelamin (Pria/Wanita) : ");
        jenisKelamin = input.next();

        System.out.println("Lulusan (SMK/D3/S1) : ");
        lulusan = input.next();

        System.out.println("Pengalaman : ");
        pengalaman = input.nextInt();

        System.out.println("Penampilan : ");
        penampilan = input.nextDouble();

        reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 19 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;
        reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 22 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 4;

        isPassingKoor = reqKoor1 || reqKoor2;


        reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur > 17 && umur <= 20 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 6.0 || pengalaman >= 2);
        reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur > 19 && umur <= 21 && lulusan.equalsIgnoreCase("S1") && penampilan >= 7.0 && pengalaman >= 2;

        isPassingAdmin = reqAdmin1 || reqAdmin2;

        System.out.println();
        System.out.println(nama+ ", Terima Kasih sudah mengiuti Lowongan Kerja di PT. Neo Technology.\n");
        System.out.println("Berikut adalah hasil dari Rekruitment untuk Koordinator dan Admin :");
        System.out.println("Hasil Kelulusan untuk Koordinator : " + isPassingKoor);
        System.out.println("Hasil Kelulusan untuk Admin : " + isPassingAdmin);

    } 
}