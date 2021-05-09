package Latihan;

public class ArrayIndexDemo {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        try { // untuk menentukan bagian statement program dimana akan terjadi pengucualian dan harus diikuti blok catch atau finally
            nums[4] = 3;
        } catch (Exception e) { // untuk menangani kesalahan / pengucualian yang terjadi. blok ini dapat diikuti oleh blok finally dan tidak dapat berdiri sendiri tanpa blok try.
            System.out.println(e);
        }
        System.out.println("" + nums[2]);
    }
}
