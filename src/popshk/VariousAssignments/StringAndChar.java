package popshk.VariousAssignments;

import java.util.Arrays;

public class StringAndChar {
    public static void main(String[] args) {
        reposition();

        String text = "ОЛЕНЬ-северное животное.В летнее время оленям в тайге жарко,а в горах даже в пах июле холодно.\n" +
                "Олень как бы создан для северных пах просторов,жёсткого ветра,длинных ПАХ морозных ночей.Олень легко бежит вперёд по тайге,подминает под себя кусты,переплывает быстрые реки.Олень не тонет,потому что каждая его шерстинка-это длинная трубочка,которую внутри наполняет воздух.\n" +
                "Нос у оленя покрыт серебристой шёрсткой.Если бы шерсти пах на носу не было,олень бы его отморозил.";

       HowManyTimeRepeat(text,"в");

      shortAndLong(text);

    }


    static void reposition(){
        String s = "word1 word2 word3";
        String [] word = s.split(" ");
        for (int i=0;i<word.length;i++) word[i] += " ";
        String res = word[2] + word[1] + word[0];
        System.out.println(res);
    }

    static void HowManyTimeRepeat(String text,String verb){
        int counter = 0;

        String s = text.replace(',',' ').replace('.',' ').replace('-',' ').toLowerCase();

        String []textArray = s.split(" ");

        for (int i=0;i<textArray.length;i++){
            if (textArray[i].equals(verb)) counter++;
        }

        System.out.println("This verb \""+verb+"\" repeated " + counter + " times");
    }

    static void shortAndLong(String text){
       String s = text.replace(',',' ').replace('.',' ').replace('-',' ');
        String []textArray = s.split(" ");
            String min,max ; max = min = textArray[0];
            for (int i=0;i<textArray.length;i++) {
                if (max.length()<textArray[i].length()) max = textArray[i];
                if (min.length()>textArray[i].length()) min = textArray[i];
            }
        System.out.println(Arrays.toString(textArray));
        System.out.println(max+" "+min);
    }
}
