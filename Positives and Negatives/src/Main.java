public class Main {
    public static void main(String[] args) {
        int[] array = {-2, 2, -2, 1, -1, 1, -1, 5, -5};
        System.out.println(alternateSign(array));
    }

    public static boolean alternateSign(int[] arr) {
        boolean isPlus;
        int i = 1;
        boolean isCurrent = false;
        if (arr[0] > 0) {
            isPlus = true;
        } else if (arr[0] < 0) {
            isPlus = false;
        } else {
            return false;
        }
        while (i < arr.length) {
            if (arr[i] < 0) {
                isCurrent = false;
            } else if (arr[i] > 0) {
                isCurrent = true;
            } else {
                return false;
            }
            if ((isPlus ^ isCurrent)) {
                isPlus = isCurrent;
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}
