package util;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {

    public static final Pattern DATE_PATTERN_YYYY_MM_DD = Pattern.compile("^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))$");

    private RegexUtil() {
    }

    public static boolean isMatch(String source, String pattern) {
        return isMatch(source, Pattern.compile(pattern));
    }

    public static boolean isMatch(String source, Pattern pattern) {
        return pattern.matcher(source).find();
    }

    public static String getMatchFirstGroupValue(String source, String regexPattern) {
        Pattern r = Pattern.compile(regexPattern);
        Matcher m = r.matcher(source);
        return m.find() ? m.group() : null;
    }

    public static String formatReturn(String src) {
        return src.replaceAll("[\n|\r|\r\n|\n\r]+", "\n");
    }

    public static boolean isMobileNumber(String src) {
        return StringUtils.isEmpty(src) ? false : isMatch(src, "(^(13\\d|15[^4,\\D]|17[13678]|18\\d)\\d{8}|170[^346,\\D]\\d{7})$");
    }

    public static boolean isDateTime(String src) {
        return StringUtils.isEmpty(src) ? false : isMatch(src, "^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-)) (20|21|22|23|[0-1]?\\d):[0-5]?\\d:[0-5]?\\d$");
    }

    public static boolean isDate(String src) {
        return StringUtils.isEmpty(src) ? false : isMatch(src, "^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))$");
    }

    public static boolean isNumber(String src) {
        return StringUtils.isEmpty(src) ? false : isMatch(src, "^[0-9]*$");
    }

    public static boolean isJson(String src) {
        return StringUtils.isEmpty(src) ? false : isMatch(src, "(?<=\\{)\\s*[^{]*?(?=[\\},])");
    }

    public static String removeThriftSetProperty(String json) {
        return json.replaceAll("\\\"set[\\w]+\\\":[ ]{0,}(true|false),{0,1}", "").replaceAll("\"[\\w]+Iterator\":\\[[\\{\\\"$\\w:.\\[\\]\\},]{0,}],{0,1}", "").replaceAll(",}", "}");
    }

    public static void main(String[] args) {
        String s = "2009-10-01";
        System.out.println(isDate(s));
        s = "2009-10-41";
        System.out.println(isDate(s));
        s = "2009-10-21 12:00:00";
        System.out.println(isDateTime(s));
        s = "2009-10-21 12:00:70";
        System.out.println(isDateTime(s));
    }
}
