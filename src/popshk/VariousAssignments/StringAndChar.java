package popshk.VariousAssignments;

public class StringAndChar {
    public static void main(String[] args) {
        reposition();
    }

    static void reposition(){
        String s = "word1 word2 word3";
        String [] word = s.split(" ");
        for (int i=0;i<word.length;i++) word[i] += " ";
        String res = word[2] + word[1] + word[0];
        System.out.println(res);
    }
}
