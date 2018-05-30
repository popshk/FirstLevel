package popshk.ThirdLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;;

public class TicTacToe {

    public static void main(String[] args) throws IOException {
        final String s ="-";

        String [][] m = new String[3][3];

        for (int i=0;i<m.length;i++){
            for (int j=0;j<m.length;j++){
                    m[i][j]=s;
                        System.out.print(m[i][j] + " ");
            }
                            System.out.println();
        }

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            int counter = 2;
            String value;

            while (true){
                if (counter%2==0){
                    value = "X";
                } else {
                    value = "0";
                }
            try {

                System.out.println(value + " - your turn, set row:");
                int mi =Integer.parseInt(read.readLine()) - 1;

                System.out.println("Set colum:");
                int mj = Integer.parseInt(read.readLine()) - 1;

                if (m[mi][mj].equals("-")) {
                    m[mi][mj] = value;
                    ArrayToString(m);
                    if (NoWinner(m)){
                        System.out.println(":(......");
                        break;
                    }
                    if (WinnerTest(m,value)){
                        System.out.println(value+" - WINNER!!!");
                            break;
                    }
                } else{
                    System.out.println("The cell is occupied !!!");
                    ArrayToString(m);
                    continue;
                }

            } catch (NumberFormatException n){
                System.out.println("Invalid value !!!");
                continue;
            } catch (ArrayIndexOutOfBoundsException a){
                System.out.println("You have to input from 1 to 3 !!!");
                continue;
            }
                counter++;
            }

    }

    private static void ArrayToString(String m [][]){
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m.length;j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean WinnerTest(String m [][],String value){
        boolean colums,rows;
        boolean toLeft = true,toRight = true;
        for (int i=0;i<m.length;i++){
                colums = true;
                rows = true;

            toRight &= (m[i][i].equals(value));
            toLeft &= (m[3-i-1][i].equals(value));

            for (int j=0;j<m.length;j++){
                colums &= (m[j][i].equals(value));
                rows &= (m[i][j]).equals(value);
            }

            if (colums||rows)return true;
        }

        if (toLeft||toRight) return true;
        return false;
    }

    private static boolean NoWinner(String [][] m){
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m.length;j++){
                if (m[i][j].equals("-")) return false;
            }
        }
        return true;
    }

}
