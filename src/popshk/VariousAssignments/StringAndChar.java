package popshk.VariousAssignments;

public class StringAndChar {
    public static void main(String[] args) {

        String text = "ОЛЕНЬ-северное животное.  В летнее время оленям  в тайге жарко, а в горах даже в пах июле холодно.\n" +
                "Олень как бы создан для северных пах просторов,жёсткого ветра,длинных ПАХ морозных     ночей.Олень легко бежит вперёд по тайге,подминает под себя кусты,переплывает быстрые реки.Олень не тонет,потому что каждая его шерстинка-это длинная трубочка,которую внутри наполняет воздух.\n" +
                "Нос у оленя покрыт серебристой       шёрсткой.Если бы шерсти пах на носу не было,олень бы его отморозил.";

       HowManyTimeRepeat(text,"пах");

       shortAndLong(text);

    }

    static void HowManyTimeRepeat(String text,String verb){
        int counter = 0;
        String [] textArray = clearVerbArrayString(text);
        for (int i=0;i<textArray.length;i++){
            if (textArray[i].equals(verb)) counter++;
        }

        System.out.println("This verb \""+verb+"\" repeated " + counter + " times");
    }

    static void shortAndLong(String text){
        int counter = 0;
        String []textArray = clearVerbArrayString(text);
        String min,max ; max = min = textArray[0];
            for (int i=0;i<textArray.length;i++) {
                    if (textArray[i].equals("") || textArray[i].equals(" ")) continue;
                        counter++;
                    if (max.length() < textArray[i].length()) max = textArray[i];
                    if (min.length() > textArray[i].length()) min = textArray[i];
            }
        System.out.println("Longest verb: \""+max+"\" Shortest verb: \""+min+"\" Total verbs in the text: "+counter);
    }

    public static String [] clearVerbArrayString(String text){
        String s = text.toLowerCase();
        char except[] = {',','.','-','?','!'};
        for (int i=0;i<except.length;i++) s=s.replace(except[i],' ');

        String []textArray = s.split(" ");

        for (int i=0;i<textArray.length;i++) textArray[i].trim();

        return textArray;
    }
}
