package modul2;

public class looping {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Perulangan For ke-"+i);
        }
        System.out.println("Selesai Perulangan For");
        int j = 0;
        while (j < 5) {
            System.out.println("Perulangan While ke-" + j);
            j++;
        }
        System.out.println("Selesai Perulangan While");

        int k = 0;
        do {
            System.out.println("perulangan do-While ke-" + k);
            k++;
        } while (k < 5);
        System.out.println("Selesai Perulangan do-while");
    }
}
