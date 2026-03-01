package JavaPrograms110;

import java.util.stream.Collectors;

public class AddDot {

    public static void main(String[] args) {
        String s="Pune";

        s.chars()
                .mapToObj(c->String.valueOf((char)c))
                .collect(Collectors.joining("."));


        String result =
                s.chars()
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining("."));

        String input = "Pune".toUpperCase();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(i));
            if (i < input.length() - 1) {
                sb.append(".");
            }
        }

        System.out.println(sb.toString());





    }
}
