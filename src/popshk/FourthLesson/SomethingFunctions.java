package popshk.FourthLesson;

import java.util.Arrays;

public class SomethingFunctions {
    public static void main(String[] args) {
        String x = "x";
        int y = 10;
        double z = 9.8;
        int [] m1 = {1,3,5,7,9};
        int [] m2 = {0,2,4,6,8};
        double [] d1 = {1.8,3.6,5.4,7.2,9.0};
        double [] d2 = {0.9,2.7,4.5,6.3,8.1};

        SomethingFunctions s = new SomethingFunctions();
        System.out.println("addArr : " + Arrays.toString(s.addArr(m1,m2)));
        System.out.println("addArr : " + Arrays.toString(s.addArr(d1,d2)));

        System.out.println("ByteLength : " + ByteLength(m1));

        AddOneThreeElementsGetSum(m1);

        String res=ReturnString(x,y,z);
        System.out.println("ReturnString : " + res);
    }

    private int[] addArr(int [] x, int [] y){
        int [] m = new int[x.length + y.length];
        System.arraycopy(x,0,m,0,x.length);
        System.arraycopy(y,0,m,x.length,y.length);
            return m;
    }

    private double[] addArr(double [] x, double [] y){
        double [] m = new double[x.length + y.length];
        System.arraycopy(x,0,m,0,x.length);
        System.arraycopy(y,0,m,x.length,y.length);
        return m;
    }

    private static int ByteLength(int [] x){
        return x.length*4;
    }

    private static void AddOneThreeElementsGetSum(int [] x){

        assert (x.length>=3);

            int sum = 0;
        for (int i = 0;i<3;i++){
            x[i]+=1;
            sum +=x[i];
        }
        System.out.println("Array after : " +Arrays.toString(x));
        System.out.println("First three elements sum : "+sum);
    }

    private static String ReturnString(String x,int y,double z){
        String res = x+" + "+y+" + "+z;
        return res;
    }
}
