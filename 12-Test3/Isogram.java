public class Isogram {
    public static boolean isogram(String word) {
        boolean b = true;
        for (int j = 0; j < word.length(); j++) {
            // char a = word.charAt(0);
            for (int i = 0; i < word.length(); i++) {
                if (i != j && word.charAt(i) == word.charAt(j)) {
                    b = false;
                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(isogram("red sun"));
        System.out.println(isogram("blue water"));
        System.out.println(isogram("BLUE water"));
        System.out.println(isogram("my blue water"));
    }
}
