public class maxencontrar {
    public static void main(String[] args) {
        int maiorvalor = 0;
        maiorvalor = max(140, 1100);
        System.out.println(maiorvalor);
    }

    public static int max(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

}


