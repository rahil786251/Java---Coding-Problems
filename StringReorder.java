//This Java program rearranges a given string by extracting and reordering specific parts.



public class String_Pass {
    public static String rearrangeString(String str) {
        if (str.length() < 6) {
            return "String is too short!";
        }

        int midStart = str.length() / 2 - 1;
        String mid3 = str.substring(midStart, midStart + 3);
        String first3 = str.substring(0, 3);
        String last3 = str.substring(str.length() - 3);

        return mid3 + first3 + last3;
    }

    public static void main(String[] args) {
        String input = "rahilb";
        String result = rearrangeString(input);
        System.out.println(result); 
    }
}
