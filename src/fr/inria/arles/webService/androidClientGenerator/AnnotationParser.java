
package fr.inria.arles.webService.androidClientGenerator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ajay
 */
public class AnnotationParser {

    public static String[] parse(String text, String annotation, String... properties) {

        String[] ret = new String[properties.length];
        // System.out.println(annotation + " " + properties[0]);
        Pattern pattern;
        Matcher matcher;

        pattern = Pattern.compile("@\\s*" + Pattern.quote(annotation)
                + "\\s*" + Pattern.quote("(") + ".*" + Pattern.quote(")"));
        matcher =
                pattern.matcher(text);
        String prop;
        if (matcher.find()) {

            text = matcher.group();
            for (int i = 0; i < properties.length; i++) {
                pattern = Pattern.compile(Pattern.quote(properties[i])
                        + "\\s*=\\s*\"\\w+\"");
                matcher =
                        pattern.matcher(text);
                if (matcher.find()) {

                    prop = matcher.group();
                    pattern = Pattern.compile("\".+\"");
                    matcher =
                            pattern.matcher(prop);
                    if (matcher.find()) {

                        prop = matcher.group();
                        ret[i] = new String(prop.substring(1, prop.length() - 1));
                    }
                } else {
                    ret[i] = null;
                }
            }
            return ret;
        }
        return null;

    }
}
