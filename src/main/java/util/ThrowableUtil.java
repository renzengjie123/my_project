package util;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ThrowableUtil {

    public ThrowableUtil() {
    }

    public static String getStackTrace(Throwable t) {
        return getStackTrace(t, true, -1);
    }

    public static String getStackTrace(Throwable t, int length) {
        return getStackTrace(t, true, length);
    }

    public static String getStackTrace(Throwable t, boolean removeLF) {
        return getStackTrace(t, removeLF, -1);
    }

    public static String getStackTrace(Throwable t, boolean removeLF, int length) {
        if (t == null) {
            return "";
        } else {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);

            String var6;
            try {
                t.printStackTrace(pw);
                String stackTrace = sw.toString();
                if (removeLF) {
                    stackTrace = StringUtil.replaceBlank(stackTrace);
                }

                if (length > 0) {
                    int len = stackTrace.length() >= length ? length : stackTrace.length();
                    String var7 = stackTrace.substring(0, len);
                    return var7;
                }

                var6 = stackTrace;
            } finally {
                if (pw != null) {
                    pw.close();
                }

            }

            return var6;
        }
    }
}
