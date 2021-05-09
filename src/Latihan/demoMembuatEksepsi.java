package Latihan;

public class demoMembuatEksepsi {

    public static int hitungFaktorial(int n)
            throws negativeNumberException {
        if (n < 0) {
            throw new negativeNumberException("Bilangan tidak boleh negatif", n); // baris 31, baris darimana ini pak?
        }
        int hasil = 1;
        for (int i = n; i >= 1; i--) {
            hasil *= i;
        }
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println("Pada saat menghitung 5!");
        try {
            System.out.println("Hasil = " + hitungFaktorial(5));
        } catch (negativeNumberException nne) {
            System.out.println("Bilangan : " + nne.getBilangan());
            nne.printStackTrace();
        }
        System.out.println("\nPada saat menghitung -5!");
        try {
            System.out.println("Hasil = " + hitungFaktorial(-5)); // baris 55, baris apa yang dituju pak?
        } catch (negativeNumberException nne) {
            System.out.println("Bilangan : " + nne.getBilangan());
            nne.printStackTrace();
        }
    }
}
