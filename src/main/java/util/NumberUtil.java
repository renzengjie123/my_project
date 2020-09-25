package util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.format.number.NumberStyleFormatter;
import org.springframework.util.NumberUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;

@Slf4j
public class NumberUtil {

    private static final char[] digits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S', 'T', 'U', 'W', 'X', 'Y', 'Z'};

    public static String numericToString(long i, byte system) {
        long num = 0L;
        if (i < 0L) {
            num = 4294967294L + i + 2L;
        } else {
            num = i;
        }

        char[] buf = new char[32];

        byte charPos;
        for(charPos = 32; num / (long)system > 0L; num /= (long)system) {
            --charPos;
            buf[charPos] = digits[(int)(num % (long)system)];
        }

        --charPos;
        buf[charPos] = digits[(int)(num % (long)system)];
        return new String(buf, charPos, 32 - charPos);
    }

    public static long stringToNumeric(String s, byte system) {
        char[] buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);
        long num = 0L;

        for(int i = 0; i < buf.length; ++i) {
            for(int j = 0; j < digits.length; ++j) {
                if (digits[j] == buf[i]) {
                    num = (long)((double)num + (double)j * Math.pow((double)system, (double)(buf.length - i - 1)));
                    break;
                }
            }
        }

        return num;
    }

    private NumberUtil() {
    }

    public static <T extends Number> T parseNumber(String text, Class<T> targetClass) {
        if (StringUtils.isEmpty(text)) {
            return null;
        } else {
            Number n = null;

            try {
                n = NumberUtils.parseNumber(text, targetClass);
            } catch (Exception var4) {
                log.error(var4.getMessage(), var4);
            }

            return (T)n;
        }
    }

    public static <T extends Number> T parseNumber(Object obj, Class<T> targetClass) {
        if (obj == null) {
            return null;
        } else if (StringUtils.isEmpty(obj.toString())) {
            return null;
        } else {
            Number n = null;

            try {
                n = NumberUtils.parseNumber(obj.toString(), targetClass);
            } catch (Exception var4) {
                log.error(var4.getMessage(), var4);
            }

            return (T)n;
        }
    }

    public static long getLongValue(Long v) {
        return v == null ? 0L : v;
    }

    public static long getLongValue(Integer b) {
        return b == null ? 0L : b.longValue();
    }

    public static long getLongValue(BigDecimal v) {
        return v == null ? 0L : v.longValue();
    }

    public static int getIntValue(BigDecimal b) {
        return b == null ? 0 : b.intValue();
    }

    public static int getIntValue(Integer b) {
        return b == null ? 0 : b;
    }

    public static int getIntValue(Long b) {
        if (b == null) {
            return 0;
        } else if (b <= 2147483647L && b >= -2147483648L) {
            return b.intValue();
        } else {
            throw new NumberFormatException("Long转化BInteger, 越界...");
        }
    }

    public static int getIntValue(Byte b) {
        return b == null ? 0 : b.intValue();
    }

    public static byte getByteValue(Byte b) {
        return b == null ? 0 : b;
    }

    public static byte getByteValue(Integer b) {
        if (b == null) {
            return 0;
        } else if (b <= 127 && b >= -128) {
            return b.byteValue();
        } else {
            throw new NumberFormatException("Integer转化Byte, 越界...");
        }
    }

    public static byte getByteValue(Long b) {
        if (b == null) {
            return 0;
        } else if (b <= 127L && b >= -128L) {
            return b.byteValue();
        } else {
            throw new NumberFormatException("Long转化Byte, 越界...");
        }
    }

    public static short getShortValue(Integer b) {
        if (b == null) {
            return 0;
        } else if (b <= 32767 && b >= -32768) {
            return b.shortValue();
        } else {
            throw new NumberFormatException("Integer转化Short, 越界...");
        }
    }

    public static short getShortValue(Short b) {
        return b == null ? 0 : b;
    }

    public static double getDoubleValue(Double b) {
        return b == null ? 0.0D : b;
    }

    public static double getDoubleValue(BigDecimal b) {
        return b == null ? 0.0D : b.doubleValue();
    }

    public static BigDecimal getBiDecimal(String s) {
        return StringUtils.isEmpty(s) ? null : new BigDecimal(s);
    }

    public static BigDecimal getBiDecimal(Integer s) {
        return s == null ? null : new BigDecimal(s);
    }

    public static BigDecimal getBiDecimal(Double s) {
        return s == null ? null : new BigDecimal(s);
    }

    public static Long getLongValue(BigDecimal b, Boolean nullToZero) {
        if (b == null) {
            return nullToZero ? 0L : null;
        } else {
            return b.longValue();
        }
    }

    public static String formatNumber(Number num, String pattern, Locale locale) {
        if (num == null) {
            return null;
        } else {
            NumberStyleFormatter formatter = new NumberStyleFormatter();
            formatter.setPattern(pattern);
            return formatter.print(num, locale);
        }
    }

    public static String formatNumber(Number num, String pattern) {
        if (num == null) {
            return null;
        } else {
            NumberStyleFormatter formatter = new NumberStyleFormatter();
            formatter.setPattern(pattern);
            return formatter.print(num, Locale.SIMPLIFIED_CHINESE);
        }
    }

    public static double setScale(Double b, int scale) {
        return b == null ? 0.0D : setScale(b, scale);
    }

    public static double setScale(BigDecimal b, int scale) {
        return b == null ? 0.0D : setScale(b.doubleValue(), scale);
    }

    public static double setScale(double b, int scale) {
        BigDecimal decimal = new BigDecimal(b);
        return decimal.setScale(scale + 1, RoundingMode.HALF_UP).setScale(scale, RoundingMode.HALF_UP).doubleValue();
    }

    public static String formatNumber(Number num) {
        return formatNumber(num, "#.##", Locale.SIMPLIFIED_CHINESE);
    }

    public static String getString(Short num) {
        return num == null ? "" : num + "";
    }

    public static String getString(Integer num) {
        return num == null ? "" : num + "";
    }

    public static String getString(Long num) {
        return num == null ? "" : num + "";
    }

    public static String getString(Double num) {
        return num == null ? "" : num + "";
    }

    public static String getString(Float num) {
        return num == null ? "" : num + "";
    }

    public static byte getByteValue(String str) {
        return getByteValue(str, (byte)0);
    }

    public static byte getByteValue(String str, byte defaultValue) {
        return StringUtils.isBlank(str) ? defaultValue : Byte.valueOf(str);
    }

    public static short getShortValue(String str) {
        return getShortValue(str, (short)0);
    }

    public static short getShortValue(String str, short defaultValue) {
        return StringUtils.isBlank(str) ? defaultValue : Short.valueOf(str);
    }

    public static int getIntValue(String str) {
        return getIntValue((String)str, 0);
    }

    public static int getIntValue(String str, int defaultValue) {
        return StringUtils.isBlank(str) ? defaultValue : Integer.valueOf(str);
    }

    public static int getIntValue(Object obj) {
        return obj == null ? 0 : getIntValue(obj.toString());
    }

    public static int getIntValue(Object obj, int defaultValue) {
        return obj == null ? defaultValue : getIntValue(obj.toString(), defaultValue);
    }

    public static long getLongValue(String str) {
        return getLongValue(str, 0L);
    }

    public static long getLongValue(String str, long defaultValue) {
        return StringUtils.isBlank(str) ? defaultValue : Long.valueOf(str);
    }

    public static double getDoubleValue(String str, double defaultValue) {
        return StringUtils.isBlank(str) ? defaultValue : Double.valueOf(str);
    }

    public static double getDoubleValue(double value, int length) {
        BigDecimal bigDecimal = new BigDecimal(value);
        return bigDecimal.setScale(length, 4).doubleValue();
    }

    public static BigDecimal getBiDecimal(Object object) {
        return object == null ? null : getBiDecimal(object.toString());
    }

    public static long getLongValue(Object obj) {
        return obj == null ? 0L : getLongValue(obj.toString());
    }

    public static BigDecimal add(BigDecimal a, BigDecimal b) {
        BigDecimal result = new BigDecimal(0);
        if (a != null) {
            result = result.add(a);
        }

        if (b != null) {
            result = result.add(b);
        }

        return result;
    }

    public static String getString2(BigDecimal a) {
        return setScale((BigDecimal)a, 2) + "";
    }
}
