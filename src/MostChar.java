import java.util.HashMap; // Nomor 6

public class MostChar {
    public static char mostFrequent(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()){
            if (c != ' '){
                map.put(c, map.getOrDefault(c,0) +1);
            }
        }

        char maxChar = ' ';
        int maxCount = 0;

        for (char c : map.keySet()){
            if (map.get(c)> maxCount){
                maxCount = map.get(c);
                maxChar = c;
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequent("Rangga Hishbu Shafar"));
    }
}
