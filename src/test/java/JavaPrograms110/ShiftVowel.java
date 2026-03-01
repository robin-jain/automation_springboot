package JavaPrograms110;

public class ShiftVowel {

    public static void main(String[] args) {
        String str = "eefrgaeiouAeiou";

        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {

            if ("AEIOUaeiou".indexOf(ch) != -1) {
                sb.append((char) (ch + 1));
            } else {
                sb.append(ch);
            }


        }
        System.out.println(sb);
    }
}
