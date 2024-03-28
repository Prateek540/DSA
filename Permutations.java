public class Permutations {
    public static void main(String[] args) {
        Permutation("LILY", "");
    }
    
    public static void Permutation(String str, String comb) {
        if(str.length() == 0) {
            System.out.println(comb);
            return;
        }
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            Permutation(str.substring(0, i) + str.substring(i+1), comb+ch);
        }
        
    }
}
