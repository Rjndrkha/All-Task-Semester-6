package fungsi1;

public class Practicum3 {

    static int luasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String args[]) {
        int luasan = luasPersegi(5);
        System.out.println("Luas Persegi dengan sisi 5 = " + luasan);
    }
}
