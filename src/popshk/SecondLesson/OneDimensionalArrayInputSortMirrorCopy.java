package popshk.SecondLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OneDimensionalArrayInputSortMirrorCopy {
    public static void main(String[] args) {

        int[] m = {3,65,7,99,3,1,7,3,4,0};

        System.out.println(Arrays.toString(m));

        int a [] = new int[m.length/2];
        int b [] = new int[m.length/2];

        System.arraycopy(m,0,a,0,m.length/2);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.arraycopy(m,m.length/2,b,0,m.length/2);
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        int counter = m.length-1;

        for(int i = 0;i< m.length/2;i++){
           int c = m[counter];
            m[counter] = m[i];
            m[i] = c;
            counter--;
            
        }

        System.out.println(Arrays.toString(m));

    }
}
