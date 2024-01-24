public class C5 {
    private String[] words;

    public C5 (String[] words){
        this.words = words;
    }

    public String[] getWords(){
        return words;
    }

    public boolean m(){
        String[] w = getWords();
        for (int i=0; i<w.length; i++){
            for (int j=0; j<w.length; j++){
                if (w[i] == w[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        String[] w1 = {"un", "sem", "stu"};
        String[] w2 = {"mo", "com", "mo", "pr"};
        System.out.println(new C5(w1).m());
        System.out.println(new C5(w2).m());
    }
}
