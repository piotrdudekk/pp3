public class Verse {
    private String sentence;
    private int line;

    public Verse(String sentence, int line) {
        this.sentence = sentence;
        this.line = line;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

}
