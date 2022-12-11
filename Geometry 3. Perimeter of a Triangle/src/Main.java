import java.util.Arrays;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        //System.out.println("hello, world");
        int[][] point = {{0,0},{0,1},{1,0}};
        System.out.println(perimeter(point));
    }
    static double perimeter(int[][] point) {
        double AB, BC, CA;
        int size = 2;
        double[] A = new double[size];
        A[0] = point[0][0];
        A[1] = point[0][1];
        double[] B = new double[size];
        B[0] = point[1][0];
        B[1] = point[1][1];
        double[] C = new double[size];
        C[0] = point[2][0];
        C[1] = point[2][1];
        AB = Math.sqrt(Math.pow(B[0] - A[0], 2) + Math.pow(B[1] - A[1],2));
        BC = Math.sqrt(Math.pow(C[0] - B[0], 2) + Math.pow(C[1] - B[1],2));
        CA = Math.sqrt(Math.pow(A[0] - C[0], 2) + Math.pow(A[1] - C[1],2));
        return AB + BC + CA;
    }
}
