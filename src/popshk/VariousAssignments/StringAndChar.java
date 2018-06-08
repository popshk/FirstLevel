package popshk.VariousAssignments;

import java.util.Arrays;

public class StringAndChar {
    public static void main(String[] args) {
        reposition();

        String text = "ОЛЕГ-северное животное.В летнее время оленям в тайге жарко,а в горах даже в июле холодно.\n" +
                "Олень как бы создан для северных просторов,жёсткого ветра,длинных морозных ночей.Олень легко бежит вперёд по тайге,подминает под себя кусты,переплывает быстрые реки.Олень не тонет,потому что каждая его шерстинка-это длинная трубочка,которую внутри наполняет воздух..\n" +
                "Нос у оленя покрыт серебристой шёрсткой.Если бы шерсти на носу не было,олень бы его отморозил.";
    }


    static void reposition(){
        String s = "word1 word2 word3";
        String [] word = s.split(" ");
        for (int i=0;i<word.length;i++) word[i] += " ";
        String res = word[2] + word[1] + word[0];
        System.out.println(res);
    }

    static String HowManyTimeRepeat(String text,String verb){
        int count; String buf;
        text.toLowerCase(); verb.toLowerCase();

        char [] textC = text.toCharArray();

        char [] verbC = verb.toCharArray();

        for (int i=0;i<textC.length;i++){
            buf = null;
            for (int j=0;j<verbC.length;j++){
                if (textC[i]==verbC[j]) buf +=textC[i];

            }

        }

        return "This verb \"" + verb +"\" repeat "+/*count+*/"times";

    }
}
