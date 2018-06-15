package popshk.VariousAssignments;

public class StringAndChar {
    public static void main(String[] args) {

        String text = "ОЛЕНЬ-северное животное.  В летнее время оленям  в тайге жарко, а в горах даже в пах июле холодно.\n" +
                "Олень как бы создан для северных пах просторов,жёсткого ветра,длинных ПАХ морозных     ночей.Олень легко бежит вперёд по тайге,подминает под себя кусты,переплывает быстрые реки.Олень не тонет,потому что каждая его шерстинка-это длинная трубочка,которую внутри наполняет воздух.\n" +
                "Нос у оленя покрыт серебристой       шёрсткой.Если бы шерсти пах на носу не было,олень бы его отморозил.";

        String text1 = "ОЛЕНЬ-северное животное.  В летнее время оленям  в тайге жарко, а в горах";
       HowManyTimeRepeat(text,"пах");

       shortAndLong(text);

       String result = new StringAndChar().myStringRaplace(text1,'о','й');
        System.out.println(result);

        System.out.println(myIndexOf(text1,"время"));

        System.out.println(mySubstring(text,0,15));

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

    public  String myStringRaplace(String string, char replaceable, char substitute){
        String s = string;
        StringBuilder sb = new StringBuilder();
        char [] c = s.toCharArray();
            for (int i=0;i<c.length;i++){
                if(c[i]==replaceable) c[i]=substitute;
                    sb.append(c[i]);
            }
        return sb.toString();
    }

    public static int myIndexOf(String string,String sub){
        boolean b;
            for (int i=0;i<string.length()-sub.length();i++){
                b=true;
                    for (int j=0;j<sub.length();j++){
                        b = b & (string.charAt(i+j))==sub.charAt(j);
                        if (!b) break;
                    }
                        if (b) return i;
            }
            return -1;
    }

    static String mySubstring(String string,int from,int to){
        String s = string;
        StringBuilder sb = new StringBuilder();
        char [] c = s.toCharArray();
            for (int i=from;i<to-1;i++){
                sb.append(c[i]);
            }
                return sb.toString();
    }

    static String myTrim(String string){
        String s = string;
        char [] c = s.toCharArray();
            if (c[0]==' ' && c[c.length-1]==' '){

            }
                return string;
    }
}
