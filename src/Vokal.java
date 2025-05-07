public class Vokal { // Nomor 2
    public static int hitungVokal(String str){
        str = str.toLowerCase();
        int count = 0;
        for (char c : str.toCharArray()){
            if ("aiueo" .indexOf(c) != -1 ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hitungVokal("Rangga Hishbu Shafar"));
    }

}