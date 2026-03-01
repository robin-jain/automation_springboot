package JavaPrograms110;

import java.util.HashMap;

public class Anagram {


    public static boolean anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[256];

        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        for (int i = 0; i < ch1.length; i++) {
            count[ch1[i]] = count[ch1[i]] + 1;
            count[ch2[i]]--;


        }
        System.out.println(count[105] + "   :    " + "i");
//        System.out.println(Arrays.toString(count));
        for (int c = 0; c < 256; c++) {

            if (count[c] > 0) {
                System.out.println("++++++++++" + count[c]);
                return false;
            }
        }
        return true;


    }

    public static boolean hashmapMethod(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }


        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ch1.length; i++) {
            map.put(ch1[i], map.getOrDefault(ch1[i], 0) + 1);

        }
        for (int i = 0; i < ch2.length; i++) {
            if(!map.containsKey(ch2[i])){
                return false;
            }
            map.put(ch2[i],map.get(ch2[i])-1);

            if(map.get(ch2[i])==0){
                map.remove(ch2[i]);
            }

        }


        return map.isEmpty();


    }


    public static void main(String[] args) {
//        System.out.println(anagram("Triangle", "Integral"));
        System.out.println(hashmapMethod("Triangle", "Integral"));
    }
}
