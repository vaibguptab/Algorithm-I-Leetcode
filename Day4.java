package Algorithm_I;

public class Day4 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        Q344(s);

        String sc = "Let's play holi";
        System.out.println(Q557(sc));
    }

    private static String Q557(String sc) {
        return null;
    }

    public static void Q344(char[] s) {
        int start = 0,end = s.length-1;
        while (start<end){
            char c = s[start];
            s[start] = s[end];
            s[end] = c;
            start++;
            end--;
        }
    }
}
