public class Main {
    public static void main(String[] args) {
        int number = 215;
        System.out.println(triangle(number));
    }

    public static int triangle(int n) {
        int init = 1;
        int add = 2;
        for (int i = 1; i < n; i++) {
            init += add;
            add++;
        }
        return init;
    }
}

