package utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private final Pattern pattern;

    public Regex(String pattern) {
        this.pattern = Pattern.compile(pattern);
    }

    public String find(String input, int group) {
        Matcher matcher = pattern.matcher(input);
        matcher.find();
        return matcher.group(group);
    }

    public boolean isFound(String input) {
        return pattern.matcher(input).find();
    }
}
