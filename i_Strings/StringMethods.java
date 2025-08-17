/*
[1] .length()
[2] .charAt()
[3] .equals()
[4] .equalsIgnoreCase()
[5] .compareTo(str2)
[6] .subString(beginIndex) | .subString(beginIndex, lastindex)
[7] .toUpperCase() | .toLowerCase()
[8] .trim()
[9] .replace()
[10] .contains("a")
[11] .startsWith()
[12] .endsWith()
[13] .isEmpty() -> if space then false then prefer isBlank
[14] .isBlank()
[15] .indexOf()
[16] .lastIndexOf()
[17] String.valueOf()
[18] String.format()
*/
public class StringMethods {

    public static void main(String... args){
        String name = "Rupam Thakre";
        int length = name.length();
        char c = name.charAt(length - 1);

        /*
        * .compareTo() - compare 2 strings lexicograpically
        */
        String str1 = "remote";
        String str2 = "car";
        int i = str1.compareTo(str2);
        System.out.println(i);

    }
}