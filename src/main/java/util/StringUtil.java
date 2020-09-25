package util;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    public static final Pattern p1 = Pattern.compile("[\t|\r|\n]");
    public static final Pattern p2 = Pattern.compile("[\"|\\\\]");
    static final Pattern SLASH = Pattern.compile("[\"|\\\\]");
    static final Pattern REG_BLANK = Pattern.compile("[\t|\r|\n]");

    public StringUtil() {
    }

    public static String trimStart(String source, Character characters) {
        return source.replaceAll("^[" + characters + "]+", "");
    }

    public static String trimEnd(String source, Character characters) {
        return source.replaceAll("[" + characters + "]+$", "");
    }

    public static boolean hasEmptyData(Collection<String> dataList) {
        if (CollectionUtils.isEmpty(dataList)) {
            throw new RuntimeException("集合为空");
        } else {
            Iterator var1 = dataList.iterator();

            String data;
            do {
                if (!var1.hasNext()) {
                    return false;
                }

                data = (String)var1.next();
            } while(!StringUtils.isEmpty(data));

            return true;
        }
    }

    public static String leftPad(String str, int length, char ch) {
        if (str.length() >= length) {
            return str;
        } else {
            char[] chs = new char[length];
            Arrays.fill(chs, ch);
            char[] src = str.toCharArray();
            System.arraycopy(src, 0, chs, length - src.length, src.length);
            return new String(chs);
        }
    }

    public static String rightPad(String str, int length, char ch) {
        if (str.length() >= length) {
            return str;
        } else {
            char[] chs = new char[length];
            Arrays.fill(chs, ch);
            char[] src = str.toCharArray();
            System.arraycopy(src, 0, chs, 0, src.length);
            return new String(chs);
        }
    }

    public static String getValue(String str) {
        return StringUtils.isBlank(str) ? "" : str;
    }

    public static String getValue(Object str) {
        if (str == null) {
            return "";
        } else {
            return StringUtils.isBlank(str.toString()) ? "" : str.toString();
        }
    }

    public static boolean isBlank(String str) {
        return StringUtils.isBlank(str);
    }

    public static boolean isNotBlank(String str) {
        return !StringUtils.isBlank(str);
    }

    public static boolean isBlank(Object str) {
        return StringUtils.isBlank(getValue(str));
    }

    public static String addSlashes(String src) {
        return src == null ? "" : src.replace("'", "\\'").replace("\"", "\\\"");
    }

    public static String urlencode(String src) {
        if (src == null) {
            return "";
        } else {
            try {
                return URLEncoder.encode(src, "utf-8");
            } catch (UnsupportedEncodingException var2) {
                return src;
            }
        }
    }

    public static String urldecode(String src) {
        if (src == null) {
            return "";
        } else {
            try {
                return URLDecoder.decode(src, "utf-8");
            } catch (UnsupportedEncodingException var2) {
                return src;
            }
        }
    }

    public static String replaceBlank(String str) {
        String dest = "";
        if (!StringUtils.isEmpty(str)) {
            Matcher m = REG_BLANK.matcher(str);
            dest = m.replaceAll("");
        }

        return dest;
    }

    public static String replaceQuota(String str) {
        String dest = "";
        if (!org.springframework.util.StringUtils.isEmpty(str)) {
            Matcher m = SLASH.matcher(str);
            dest = m.replaceAll("'").replace("''", "'");
        }

        return dest;
    }

    public static Map<String, String> convertOptionParametersStringToMap(String optionParametersString, String char1stLev, String char2ndLev) {
        Map<String, String> map = new LinkedHashMap();
        if (optionParametersString != null && char1stLev != null && char2ndLev != null && optionParametersString.length() > 0 && char1stLev.length() > 0 && char2ndLev.length() > 0 && optionParametersString.contains(char2ndLev)) {
            optionParametersString.trim();
            String[] parametersValueArray;
            if (optionParametersString.contains(char1stLev)) {
                String[] optionParameters = optionParametersString.split(char1stLev);
                parametersValueArray = optionParameters;
                int var6 = optionParameters.length;

                for(int var7 = 0; var7 < var6; ++var7) {
                    String parametersValue = parametersValueArray[var7];
                    if (parametersValue != null && (parametersValue == null || parametersValue.length() != 0)) {
                        parametersValue.trim();
                        if (parametersValue.contains(char2ndLev)) {
                            int count = getCount(parametersValue, char2ndLev);
                            if (count == 1) {
                                parametersValueArray = parametersValue.split(char2ndLev);
                                String key = parametersValueArray[0];
                                String value = parametersValueArray[1];
                                if (key != null && key.length() > 0) {
                                    map.put(key, value);
                                }
                            }
                        }
                    }
                }
            } else if (optionParametersString.contains(char2ndLev)) {
                int count = getCount(optionParametersString, char2ndLev);
                if (count == 1) {
                    parametersValueArray = optionParametersString.split(char2ndLev);
                    String key = parametersValueArray[0];
                    String value = parametersValueArray[1];
                    if (key != null && key.length() > 0) {
                        map.put(key, value);
                    }
                }
            }

            return map;
        } else {
            return map;
        }
    }

    public static int getCount(String string, String subString) {
        int index = 0;
        int count = 0;
        if (string != null && subString != null && string.length() > 0 && subString.length() > 0) {
            while((index = string.indexOf(subString, index)) != -1) {
                index += subString.length();
                ++count;
            }
        }

        return count;
    }

    public static String transferFuzzyQuery(String fuzzyQuery) {
        if (isNotBlank(fuzzyQuery) && fuzzyQuery.contains("%")) {
            String replaceMent = "\\%";
            String replace = fuzzyQuery.replace("%", replaceMent);
            return replace;
        } else {
            return fuzzyQuery;
        }
    }

    public static String makeQueryStringAllRegExp(String str) {
        return StringUtils.isBlank(str) ? str : str.replace("\\", "\\\\").replace("*", "\\*").replace("+", "\\+").replace("|", "\\|").replace("{", "\\{").replace("}", "\\}").replace("(", "\\(").replace(")", "\\)").replace("^", "\\^").replace("$", "\\$").replace("[", "\\[").replace("]", "\\]").replace("?", "\\?").replace(",", "\\,").replace(".", "\\.").replace("&", "\\&");
    }
}
