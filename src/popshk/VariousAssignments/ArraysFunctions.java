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
        System.out.println(toStringForIntArray(m));
        System.out.println(equalsByteArray(b1,b2));
        System.out.println(equalsByteArray(b1,b1));

        int [] a = {1,1,2,3,2,4,5,6,4};

        noReplay(a);

        int [] x = {1,3,5,7,9,3,6,8};
        int [] y = {0,2,4,6};

        System.out.println(toStringForIntArray(TwoToOne(x,y)));
    }

    private static boolean equalsByteArray(byte [] m1 , byte [] m2){
        if (m1.length!=m2.length) return false;

        for (int i=0;i<m1.length;i++){
            if(m1[i]!=m2[i]) return false;
        }
            return true;
    }

    private static String toStringForIntArray(int [] m){
        StringBuilder s = new StringBuilder("[");

            for (int i=0;i<m.length;i++){
                s.append(m[i]);
                if (i!=m.length-1) s.append(",").append(" ");
            }

            return s.append("]").toString();
    }

    private static void noReplay(int [] m){
        int counter;

        for (int i=0;i<m.length;i++){
            counter=0;
                for (int j=0;j<m.length;j++){
                    if (m[i]==m[j]) counter++;
                }
         if(counter==1) System.out.print(m[i]+", ");
        }
    }

    private static int [] TwoToOne(int [] a, int [] b){
        int [] m =new int[a.length+b.length];

        System.arraycopy(a,0,m,0,a.length);
        System.arraycopy(b,0,m,a.length,b.length);

        Arrays.sort(m);

        return m;
    }

}
