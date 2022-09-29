package Task;

public class Nomer3 {

    public static void main(String[] args) {
        int array[] = new int[11];
        tampil(array);
    }

    static void tampil(int array[]) {
        int angka = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                angka += 1;
                System.out.println("[" + i + "] : " + angka);

            } else {
                System.out.println(" ");
            }

        }
    }
}
