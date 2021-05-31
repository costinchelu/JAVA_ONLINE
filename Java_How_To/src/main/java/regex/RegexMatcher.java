package regex;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {

    public static void main(String[] args) {
        final String regexExpression = "[Ll]orem";
        final String textToCheck = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus in condimentum massa. " +
                "Pellentesque quis accumsan ligula. Vivamus eu nisl est. Ut convallis dui quam, " +
                "quis finibus odio molestie eu. Nulla vitae urna congue, elementum massa ultrices, " +
                "euismod magna. Vivamus eleifend egestas mattis. Cras a tempor velit. Suspendisse tempor enim " +
                "vel metus ullamcorper molestie.\nSed ultrices nisl non lacus ultrices elementum. Praesent fringilla, " +
                "tellus quis aliquet eleifend, ex erat sollicitudin metus, et tristique neque arcu non arcu. " +
                "Suspendisse sit amet arcu eleifend, lorem lobortis metus vitae, laoreet arcu. Suspendisse tellus lorem, " +
                "tincidunt vitae dictum ut, lacinia eget lorem libero. Pellentesque habitant morbi tristique senectus et " +
                "netus et malesuada fames ac turpis egestas.";

        final Pattern pattern = Pattern.compile(regexExpression, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(textToCheck);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }

        Map<String, String> regexMap = getStringStringMap();
    }

    private static Map<String, String> getStringStringMap() {
        Map<String, String> regexMap = new HashMap<>();
        regexMap.put("Case insensitive operator for 'Lorem' or 'lorem'", "(?i)lorem");
        regexMap.put("Match a non printable character like new line", "\n");
        regexMap.put("Matches any character in the square brackets. For special regex characters, we need escape", "[Ll]orem");
        regexMap.put("^ Will invert matching in the square bracket when it is placed at the beginning of the bracket", "[^Ll]orem");
        regexMap.put("any character including line break", ".");

        return regexMap;

    }
}
