package wordWrap;

public class Wrapper {
    public String wrap(String s, int w) {
        if (w >= s.length())
            return s;
        else
            return s.substring(0, w) + "\n" + s.substring(w);
    }
}
