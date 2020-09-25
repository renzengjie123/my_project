package util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.format.datetime.DateFormatter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Slf4j
public class DateUtil {

    public static final long MILLISECONDS_SECOND = 1000L;
    public static final long MILLISECONDS_MINUTE = 60000L;
    public static final long MILLISECONDS_HOUR = 3600000L;
    public static final long MILLISECONDS_DAY = 86400000L;
    public static final long MILLISECONDS_WEEK = 604800000L;
    public static final long SECONDS_MONTH = 2764800L;
    public static final int MINUTE_HOUR = 60;
    public static final String DATE_SHORT_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";
    public static final String MM_dd_yyyy_HH_mm_ss = "MM/dd/yyyy HH:mm:ss";
    public static final String MM_dd_yyyy = "MM/dd/yyyy";
    public static final String yyyy_MM_dd = "yyyy-MM-dd";
    public static final String yyyy_MM = "yyyy-MM";
    public static final String HH_mm_ss = "HH:mm:ss";
    public static final String HH_mm = "HH:mm";
    public static final String yyyy_MM_dd_HH_mm = "yyyy-MM-dd HH:mm";
    public static final String yyyyMMdd = "yyyyMMdd";
    public static final String yyyyMMddHH = "yyyyMMddHH";
    public static final String yyyyMMddHHmmss = "yyyyMMddHHmmss";
    public static final String yyyyMMddHHmmssSSS = "yyyyMMddHHmmssSSS";
    private static final String[] weekEnNames = new String[]{"sun", "mon", "tue", "wed", "thu", "fri", "sat"};
    static final Calendar calendar = Calendar.getInstance();

    private DateUtil() {

    }

    public void method(){

    }

    public static String getYearString(String time) {
        if (StringUtils.isEmpty(time)) {
            return null;
        } else {
            return time.length() > 1 ? time.substring(0, 4) : time;
        }
    }

    public static Date getNowDate() throws ParseException {
        return getString2Date(getNowDate2String());
    }

    public static String getNowDate2String() {
        return DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");
    }

    public static String getNowDate2String(String format) {
        return DateFormatUtils.format(new Date(), format);
    }

    public static String getTimestamp2String(Timestamp timestamp) {
        return DateFormatUtils.format(timestamp, "yyyy-MM-dd HH:mm:ss");
    }

    public static String getDate2String(Date date) {
        return getDate2String(date, "yyyy-MM-dd HH:mm:ss");
    }

    public static String getDate2String(Date date, String format) {
        return date == null ? null : DateFormatUtils.format(date, format);
    }

    public static Date getString2Date(String date) throws ParseException {
        return getString2Date(date, "yyyy-MM-dd HH:mm:ss");
    }

    public static Date getString2Date(String date, String format) throws ParseException {
        String[] date_format = new String[]{format};
        return DateUtils.parseDate(date, date_format);
    }

    public static long getPhpTime() {
        return System.currentTimeMillis() / 1000L;
    }

    public static Long getTimeFromPhp(Integer timestamp) {
        return timestamp != null ? 1000L * (long)timestamp : null;
    }

    public static long getPhpTime(Date d) {
        return d == null ? 0L : d.getTime() / 1000L;
    }

    public static String getTodayBegin2String() {
        return DateFormatUtils.format(getTodayBegin(), "yyyy-MM-dd HH:mm:ss");
    }

    public static String getYesterdayBegin2String() {
        return DateFormatUtils.format(getYesterdayBegin(), "yyyy-MM-dd HH:mm:ss");
    }

    public static String getTodayEnd2String() {
        return DateFormatUtils.format(getTodayEnd(), "yyyy-MM-dd HH:mm:ss");
    }

    public static String getYesterdayEnd2String() {
        return DateFormatUtils.format(getYesterdayEnd(), "yyyy-MM-dd HH:mm:ss");
    }

    public static Date getTodayBegin() {
        return getBegin4Date(new Date());
    }

    public static Date getYesterdayBegin() {
        return getBegin4Date(addDays(new Date(), -1));
    }

    public static Date getTodayEnd() {
        return getEnd4Date(new Date());
    }

    public static Date getYesterdayEnd() {
        return getEnd4Date(addDays(new Date(), -1));
    }

    public static Date getBegin4Date(Date date) {
        calendar.setTime(date);
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return calendar.getTime();
    }

    public static Date getEnd4Date(Date date) {
        calendar.setTime(date);
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 23, 59, 59);
        return calendar.getTime();
    }

    public static String getElapsedTime(Date startTime) {
        String elapsed_time = "0天 00:00:00";
        long left_milliSeconds = System.currentTimeMillis() - startTime.getTime();
        if (left_milliSeconds <= 0L) {
            return elapsed_time;
        } else {
            long days = left_milliSeconds / 86400000L;
            if (days < 0L) {
                return elapsed_time;
            } else {
                long hours = (left_milliSeconds - days * 86400000L) / 3600000L;
                if (hours < 0L) {
                    elapsed_time = days + "天 00:00:00";
                    return elapsed_time;
                } else {
                    long minutes = (left_milliSeconds - days * 86400000L - hours * 3600000L) / 60000L;
                    if (minutes < 0L) {
                        elapsed_time = days + "天 " + StringUtil.leftPad(hours + "", 2, '0') + ":00:00";
                        return elapsed_time;
                    } else {
                        long seconds = (left_milliSeconds - days * 86400000L - hours * 3600000L - minutes * 60000L) / 1000L;
                        if (seconds < 0L) {
                            elapsed_time = days + "天 " + StringUtil.leftPad(hours + "", 2, '0') + ":" + StringUtil.leftPad(minutes + "", 2, '0') + ":00";
                            return elapsed_time;
                        } else {
                            elapsed_time = days + "天 " + StringUtil.leftPad(hours + "", 2, '0') + ":" + StringUtil.leftPad(minutes + "", 2, '0') + ":" + StringUtil.leftPad(seconds + "", 2, '0');
                            return elapsed_time;
                        }
                    }
                }
            }
        }
    }

    public static String getLeftTime(Date deadline) {
        String left_time = "0天 00:00:00";
        long left_milliSeconds = deadline.getTime() - System.currentTimeMillis();
        if (left_milliSeconds <= 0L) {
            return left_time;
        } else {
            long days = left_milliSeconds / 86400000L;
            if (days < 0L) {
                return left_time;
            } else {
                long hours = (left_milliSeconds - days * 86400000L) / 3600000L;
                if (hours < 0L) {
                    left_time = days + "天 00:00:00";
                    return left_time;
                } else {
                    long minutes = (left_milliSeconds - days * 86400000L - hours * 3600000L) / 60000L;
                    if (minutes < 0L) {
                        left_time = days + "天 " + StringUtil.leftPad(hours + "", 2, '0') + ":00:00";
                        return left_time;
                    } else {
                        long seconds = (left_milliSeconds - days * 86400000L - hours * 3600000L - minutes * 60000L) / 1000L;
                        if (seconds < 0L) {
                            left_time = days + "天 " + StringUtil.leftPad(hours + "", 2, '0') + ":" + StringUtil.leftPad(minutes + "", 2, '0') + ":00";
                            return left_time;
                        } else {
                            left_time = days + "天 " + StringUtil.leftPad(hours + "", 2, '0') + ":" + StringUtil.leftPad(minutes + "", 2, '0') + ":" + StringUtil.leftPad(seconds + "", 2, '0');
                            return left_time;
                        }
                    }
                }
            }
        }
    }

    public static Date addMonths(Date src, int addMonths) {
        calendar.setTime(src);
        calendar.add(2, addMonths);
        return calendar.getTime();
    }

    public static Date addMonths(int addMonths) {
        return addMonths(new Date(), addMonths);
    }

    public static Date addDays(Date src, int addDays) {
        calendar.setTime(src);
        calendar.add(5, addDays);
        return calendar.getTime();
    }

    public static Date addDays(int addDays) {
        return addDays(new Date(), addDays);
    }

    public static Date addHours(Date src, int addHours) {
        calendar.setTime(src);
        calendar.add(10, addHours);
        return calendar.getTime();
    }

    public static Date addHours(int addHours) {
        return addHours(new Date(), addHours);
    }

    public static Date addMinutes(Date src, int addMinutes) {
        calendar.setTime(src);
        calendar.add(12, addMinutes);
        return calendar.getTime();
    }

    public static Date addMinutes(int addMinutes) {
        return addMinutes(new Date(), addMinutes);
    }

    public static Date addSeconds(Date src, int addSeconds) {
        calendar.setTime(src);
        calendar.add(13, addSeconds);
        return calendar.getTime();
    }

    public static Date addSeconds(int addSeconds) {
        return addSeconds(new Date(), addSeconds);
    }

    public static int getDayOfWeek() {
        return getDayOfWeek(new Date());
    }

    public static int getDayOfWeek(Date date) {
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        calendar.setTime(date);
        int day = calendar.get(7);
        return day - 1;
    }

    public static String getWeekName() {
        return weekEnNames[getDayOfWeek()];
    }

    public static String getWeekName(Date date) {
        return weekEnNames[getDayOfWeek(date)];
    }

    public static int getDayOfWeekCN(Date date) {
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        calendar.setTime(date);
        int day = calendar.get(7);
        return day == 1 ? 7 : day - 1;
    }

    public static String formatDate(Date src, String formatPattern) {
        if (src == null) {
            return "";
        } else {
            DateFormat fmt = new SimpleDateFormat(formatPattern);
            return fmt.format(src);
        }
    }

    public static String formatDate(Date src) {
        return formatDate(src, "yyyy-MM-dd HH:mm:ss");
    }

    public static String formatDate() {
        return formatDate(new Date(), "yyyy-MM-dd");
    }

    public static String formatDate(String formatPattern) {
        return formatDate(new Date(), formatPattern);
    }

    public static Date getDate(int year, int month, int day) {
        calendar.clear();
        calendar.set(year, month - 1, day);
        return calendar.getTime();
    }

    public static Date parseDate(String dateString, String formatPattern) throws Exception {
        return parseDate(dateString, formatPattern, (Date)null, false);
    }

    public static Date parseDate(String dateString) {
        if (StringUtils.isEmpty(dateString)) {
            return null;
        } else {
            try {
                if (RegexUtil.isDateTime(dateString)) {
                    return parseDate(dateString, "yyyy-MM-dd HH:mm:ss");
                } else if (RegexUtil.isDate(dateString)) {
                    return parseDate(dateString, "yyyy-MM-dd");
                } else {
                    return RegexUtil.isDate(dateString) ? parseDate(dateString, "yyyy-MM") : timestamp2Date(dateString, (Date)null);
                }
            } catch (Exception var2) {
                return null;
            }
        }
    }

    public static Date parseDate(String dateString, boolean throwExceptionWhenParseFail) throws Exception {
        return parseDate(dateString, "yyyy-MM-dd HH:mm:ss", (Date)null, throwExceptionWhenParseFail);
    }

    public static Date parseDate(String dateString, String formatPattern, Date defaultValue, boolean throwExceptionWhenParseFail) throws Exception {
        try {
            if (!StringUtils.isEmpty(dateString) && !StringUtils.isEmpty(formatPattern)) {
                DateFormatter dateFormatter = new DateFormatter();
                dateFormatter.setPattern(formatPattern);
                return dateFormatter.parse(dateString, Locale.CHINA);
            } else {
                return null;
            }
        } catch (Exception var5) {
            log.error("DateUtil.parseDate出错:" + ThrowableUtil.getStackTrace(var5) + ",dateString:" + dateString + ",formatPattern:" + formatPattern);
            if (throwExceptionWhenParseFail) {
                throw var5;
            } else {
                return defaultValue;
            }
        }
    }

    public static Date timestamp2Date(String timestamp, Date defaultValue) {
        if (StringUtils.isEmpty(timestamp)) {
            return defaultValue;
        } else {
            timestamp = timestamp.trim();
            if (timestamp.length() == 10) {
                timestamp = timestamp + "000";
            }

            Long time = NumberUtil.getLongValue(timestamp);
            return new Date(time);
        }
    }

    public static Date timestamp2Date(String timestamp) {
        return timestamp2Date(timestamp, new Date());
    }

    public static String formatTimestamp(String timestamp) {
        return formatDate(timestamp2Date(timestamp, new Date()));
    }

    public static String formatTimestamp(String timestamp, String formatter) {
        return formatDate(timestamp2Date(timestamp, new Date()), formatter);
    }

    public static int getDayOfMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(5);
    }

    public static int getDayOfMonth() {
        return Calendar.getInstance().get(5);
    }

    public static int getMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(2);
    }

    public static Date getMinDate(Date date1, Date date2) {
        return date1.getTime() < date2.getTime() ? date1 : date2;
    }

    public static long parseSecond(String date, String format) {
        if (StringUtils.isEmpty(format)) {
            format = "yyyy-MM-dd HH:mm:ss";
        }

        Date date1 = null;
        if (StringUtils.isNumeric(date) && date.length() == 13) {
            date1 = new Date(NumberUtil.getLongValue(date));
        } else {
            try {
                date1 = parseDate(date, format);
            } catch (Exception var4) {
                log.error("DateUtil.parseDate出错:" + ThrowableUtil.getStackTrace(var4) + ",dateString:" + date + ",formatPattern:" + format);
                return getPhpTime();
            }
        }

        return date1 == null ? getPhpTime() : date1.getTime() / 1000L;
    }

    public static Date getDate(String formatPattern) {
        SimpleDateFormat format = new SimpleDateFormat(formatPattern);

        try {
            return parseDate(format.format(new Date()), formatPattern);
        } catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static Date getDate(int min) {
        Calendar c = Calendar.getInstance();
        c.add(12, min);
        return c.getTime();
    }

    public static int getHour(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(11);
    }

    public static int getMinute(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(12);
    }

    public static int getCurrTotalMinute(Date date) {
        return getHour(date) * 60 + getMinute(date);
    }

    public static int getDiffDay(Date date1, Date date2) {
        long time1 = date1.getTime();
        long time2 = date2.getTime();
        long diff = time1 - time2;
        return (int)(diff / 86400000L);
    }

    public static int getDiffMinutes(Date date1, Date date2) {
        long time1 = date1.getTime();
        long time2 = date2.getTime();
        long diff = time1 - time2;
        return (int)(diff / 60000L);
    }

    public static int getDiffHours(Date date1, Date date2) {
        long time1 = date1.getTime();
        long time2 = date2.getTime();
        long diff = time1 - time2;
        return (int)(diff / 3600000L);
    }

    public static int getDiffWeeks(Date date1, Date date2) {
        long time1 = date1.getTime();
        long time2 = date2.getTime();
        long diff = time1 - time2;
        return (int)(diff / 604800000L);
    }

    /** @deprecated */
    @Deprecated
    public static int minutesBetween(Date sDate, Date eDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(sDate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(eDate);
        long time2 = cal.getTimeInMillis();
        long minutesBetween = (time2 - time1) / 60000L;
        return Integer.valueOf(String.valueOf(minutesBetween));
    }

    public static Boolean isBefore(String sDate, String eDate) {
        Date sDate1 = null;
        Date eDate1 = null;

        try {
            sDate1 = getString2Date(sDate);
            eDate1 = getString2Date(eDate);
        } catch (ParseException var5) {
            log.info("时间比较出错");
            return null;
        }

        if (null != sDate1 && null != eDate1) {
            return sDate1.before(eDate1) ? true : false;
        } else {
            log.info("时间比较出错");
            return null;
        }
    }

    public static String getFirstDayOfCurrentMouth() {
        Calendar c = Calendar.getInstance();
        c.add(2, 0);
        c.set(5, 1);
        return getDate2String(c.getTime(), "yyyy-MM-dd");
    }

    public static String getLastDayOfCurrentMouth() {
        Calendar c = Calendar.getInstance();
        c.set(5, c.getActualMaximum(5));
        return getDate2String(c.getTime(), "yyyy-MM-dd");
    }

    public static int getDaysOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getActualMaximum(5);
    }

    public static String getPreWeekTime(int index) {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(7) - 1;
        int offset = index - dayOfWeek;
        calendar.add(5, offset - 7);
        return getDate2String(calendar.getTime(), "yyyy-MM-dd");
    }

    public static String getFirstDayOfMouth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, year);
        calendar.set(2, month - 1);
        calendar.set(5, calendar.getMinimum(5));
        return getDate2String(calendar.getTime(), "yyyy-MM-dd");
    }

    public static String getFirstDayOfNextMouth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, year);
        calendar.set(2, month);
        calendar.set(5, calendar.getMinimum(5));
        return getDate2String(calendar.getTime(), "yyyy-MM-dd");
    }

    public static int getSeason(Date date) {
        int season = 0;
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int month = c.get(2);
        switch(month) {
            case 0:
            case 1:
            case 2:
                season = 1;
                break;
            case 3:
            case 4:
            case 5:
                season = 2;
                break;
            case 6:
            case 7:
            case 8:
                season = 3;
                break;
            case 9:
            case 10:
            case 11:
                season = 4;
        }

        return season;
    }

    public static int getTimeProcess() {
        Calendar cl = Calendar.getInstance();
        BigDecimal dayCount = new BigDecimal(cl.getActualMaximum(5));
        BigDecimal dayOfMon = new BigDecimal(cl.get(5));
        return dayOfMon.divide(dayCount, 2, 4).multiply(new BigDecimal(100)).intValue();
    }

    public static boolean isToday(Date date) {
        return isThisTime(date, "yyyy-MM-dd");
    }

    public static boolean isThisMonth(String dateString) {
        Date date = parseDate(dateString);
        return isThisTime(date, "yyyy-MM");
    }

    public static boolean isThisMonthFormat(String dateString, String format) throws Exception {
        Date date = parseDate(dateString, format);
        return isThisTime(date, format);
    }

    public static boolean isThisMonth(Date date) {
        return isThisTime(date, "yyyy-MM");
    }

    private static boolean isThisTime(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String param = sdf.format(date);
        String now = sdf.format(new Date());
        return param.equals(now);
    }

    public static List<String> getWeekResults(String a, String b) throws ParseException {
        new SimpleDateFormat("yyyy-mm-dd");
        Date ad = getString2Date(a, "yyyy-MM-dd");
        Date bd = getString2Date(b, "yyyy-MM-dd");
        Calendar cl1 = Calendar.getInstance();
        cl1.setTime(ad);
        Calendar cl2 = Calendar.getInstance();
        cl2.setTime(bd);
        Map<Integer, List<String>> result = new HashMap();

        for(int num = 0; cl2.compareTo(cl1) >= 0; ++num) {
            int count = 7;
            if (!result.containsKey(num)) {
                result.put(num, new ArrayList());
            }

            for(int i = 0; i < count && cl2.compareTo(cl1) >= 0; ++i) {
                ((List)result.get(num)).add(getDate2String(cl1.getTime(), "yyyy-MM-dd"));
                if (cl1.get(7) == 6) {
                    cl1.add(7, 1);
                    break;
                }

                cl1.add(7, 1);
            }
        }

        List<String> time = new ArrayList();
        Iterator var15 = result.entrySet().iterator();

        while(var15.hasNext()) {
            Map.Entry<Integer, List<String>> entry = (Map.Entry)var15.next();
            List<String> temp = (List)entry.getValue();
            String str = (String)temp.get(0) + "~" + (String)temp.get(temp.size() - 1);
            time.add(str);
        }

        return time;
    }

    public static List<String> getBetweenDays(String startTime, String endTime) {
        List<String> days = new ArrayList();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date start = dateFormat.parse(startTime);
            Date end = dateFormat.parse(endTime);
            Calendar tempStart = Calendar.getInstance();
            tempStart.setTime(start);
            Calendar tempEnd = Calendar.getInstance();
            tempEnd.setTime(end);
            tempEnd.add(5, 1);

            while(tempStart.before(tempEnd)) {
                days.add(dateFormat.format(tempStart.getTime()));
                tempStart.add(6, 1);
            }
        } catch (ParseException var8) {
            var8.printStackTrace();
        }

        return days;
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(getWeekResults("2017-12-01", "2018-02-02"));
    }
}
