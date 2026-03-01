package JavaPrograms110;

import java.util.HashMap;
import java.util.Set;

public class DuplicateInString {


    public static void duplicateInStr(String string) {

        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = string.toCharArray();

        for (int i = 0; i < string.length(); i++) {
            if (chars[i] != ' ') {
                map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
            }
//
        }

        System.out.println(map);

        Set<Character> c = map.keySet();

        for (Character c1 : c) {
            if (map.get(c1) > 1) {
                System.out.println(" occurrence is  : "+ map.get(c1) + " for character : " + c1);
            }
        }
    }

    public static void main(String[] args) {
        duplicateInStr("Better Butter");
    }
}
