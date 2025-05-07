import java.util.HashMap; // Nomor 4

public class CountChar {
    public static void countCharacter(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()){
            if (c != ' '){
                map.put(c, map.getOrDefault(c, 0)  + 1);
            }
        }
        System.out.println(map);
    }    

    public static void main(String[] args) {
        countCharacter("RANGGA HISHBU SHAFAR");
    }
}
