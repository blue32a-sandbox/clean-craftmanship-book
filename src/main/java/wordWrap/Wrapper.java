package wordWrap;

public class Wrapper {
    public String wrap(String s, int w) {
        if (w >= s.length())
            return s;
        else {
            int br = s.lastIndexOf(" ", w);
            if (br == -1)
                br = w;
            return s.substring(0, br).trim() + "\n" +
                   wrap(s.substring(br).trim(), w);
        }
    }
}
