import java.util.regex.*;

class Main {
    public static void main(String[] args) {

        /*
        * [abc] [^abc]
        * [a-z] [A-Z]
        * [0-9] [^0-9]
        * [^a-zA-Z0-9]
        * */
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher("a1b7@z# ");
        while(m.find()) {
            System.out.println(m.start()+"-------"+m.group());
        }
    }
}