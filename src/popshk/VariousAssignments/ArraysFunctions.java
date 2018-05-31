package popshk.VariousAssignments;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.abs;

public class ArraysFunctions {
    public static void main(String[] args) {
        Random random =new Random();
        byte [] b1 = new byte[10];
        byte [] b2 = new byte[10];
        random.nextBytes(b1);
        random.nextBytes(b2);

        int [] m = new int[10];
        for (int i=0;i<10;i++){
            m[i]=random.nextInt(89);
            b1[i] = (byte) (abs(b1[i]/2));
            b2[i] = (byte) (abs(b2[i]/2));
        }

        System.out.println(Arrays.toString(b1));
        System.out.println(Arrays.toString(b2));
        System.out.println(Arrays.toString(m));
    }

    private static boolean equalsByteArray(byte [] m1 , byte [] m2){
            return false;
    }

    private static String toStringForIntArray(int [] m){
        StringBuilder s = new StringBuilder("[");
            return s.append("]").toString();
    }

}
