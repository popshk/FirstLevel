package popshk.VariousAssignments;


public class StringAndChar {
    public static void main(String[] args) {
        reposition();

        String text = "ОЛЕНЬ-северное животное.В летнее время оленям в тайге жарко,а в горах даже в пах июле холодно.\n" +
                "Олень как бы создан для северных пах просторов,жёсткого ветра,длинных ПАХ морозных ночей.Олень легко бежит вперёд по тайге,подминает под себя кусты,переплывает быстрые реки.Олень не тонет,потому что каждая его шерстинка-это длинная трубочка,которую внутри наполняет воздух..\n" +
                "Нос у оленя покрыт серебристой шёрсткой.Если бы шерсти пах на носу не было,олень бы его отморозил.";

       HowManyTimeRepeat(text,"в");

    }


    static void reposition(){
        String s = "word1 word2 word3";
        String [] word = s.split(" ");
        for (int i=0;i<word.length;i++) word[i] += " ";
        String res = word[2] + word[1] + word[0];
        System.out.println(res);
    }

    static void HowManyTimeRepeat(String text,String verb){
        int count,result=0;

        char [] textC = text.toLowerCase().toCharArray();
        char [] verbC = verb.toLowerCase().toCharArray();

        for (int i=0;i<textC.length;i++){
            count=0;
            if (textC[i]==verbC[0]) {
                for (int j = 0; j < verbC.length; j++) {
                    if (j==verbC.length-1 && textC[i+j]==verbC[j]&& textC[i+verbC.length]==' ') count++;
                }
            }
            if (count==1) result++;
        }
        System.out.println("This verb \""+verb+"\" repeated " + result + " times");
    }

}
