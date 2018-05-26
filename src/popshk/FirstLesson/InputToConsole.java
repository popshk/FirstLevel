package popshk.FirstLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputToConsole {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input first number:");

        int a = Integer.parseInt(bf.readLine());

        System.out.println("Input second number:");

        int b = Integer.parseInt(bf.readLine());

        System.out.println(a + b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a * b);
    }
}
