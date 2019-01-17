package utils;

import jodd.datetime.JDateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * About:日期工具类
 * Other:
 * Created: jyhuang on 2016/6/17 14:37.
 * Editored:
 */
public class DateUtils {
    /**
     * 根据格式化类型将指定日期时间的格式化成相应的字符串形式的(y-年,M-月,d-日,H-时,m-分，s-秒,S-毫秒)日期时间;
     *
     * @param date   Date 指定的日期
     * @param format String 格式字符串
     * @return String 当前时间
     */
    public static String getCntDtStr(Date date, String format) {
        SimpleDateFormat dtFmt = new SimpleDateFormat(format);
        String nowDtStr = dtFmt.format(date);
        return nowDtStr;
    }

    /**
     * 计算两个日期之间相差的天数
     *
     * @param bdate 较小的时间,时间格式yyyy/MM/dd或yyyy/MM/dd HH:mm:ss
     * @param edate 较大的时间
     * @return 相差天数
     * @throws ParseException
     */
    public static int daysBetweenDay(String bdate, String edate) throws ParseException {
        bdate = bdate.substring(0, 10);
        edate = edate.substring(0, 10);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return daysBetweenDay(sdf.parse(bdate), sdf.parse(edate));
    }

    /**
     * 计算两个日期之间相差的天数
     *
     * @param bdate 较小的时间
     * @param edate 较大的时间
     * @return 相差天数
     * @throws ParseException
     */
    public static int daysBetweenDay(Date bdate, Date edate) throws ParseException {
        long between_days = (edate.getTime() - bdate.getTime()) / (1000 * 3600 * 24);
        return Integer.parseInt(String.valueOf(between_days));
    }

    /**
     * 取得系统当前的日期时间
     *
     * @return String 无分隔符
     */
    public static String curDateTimeWithoutOperator() {
        return getCntDtStr(new Date(), "yyyyMMddHHmmss");
    }

    /**
     * 取得系统当前的日期时间
     *
     * @return String yyyy/MM/dd HH:mm:ss
     */
    public static String curDateTime() {
        return getCntDtStr(new Date(), "yyyy/MM/dd HH:mm:ss");
    }

    /**
     * 取得系统当前的日期时间,精确到毫秒
     *
     * @return String yyyy/MM/dd HH:mm:ss:SSS
     */
    public static String curDateTimeSSS() {
        return getCntDtStr(new Date(), "yyyy/MM/dd HH:mm:ss.SSS");
    }

    /**
     * 取得系统当前的日期
     *
     * @return String yyyy/MM/dd
     */
    public static String curDate() {
        return getCntDtStr(new Date(), "yyyy/MM/dd");
    }

    /**
     * 取得系统当前的时间，返回时间格式是HHmmss的6位字符串
     *
     * @return 当前时间
     */
    public static String nowTime() {
        return getCntDtStr(new Date(), "HHmmss");
    }

    /**
     * 取得系统当前的时间，返回时间格式是HH的2位字符串
     *
     * @return 当前时间
     */
    public static String nowHour() {
        return getCntDtStr(new Date(), "HH");
    }

    /**
     * 取得系统当前的日期，返回时间格式是yyyyMMdd的6位字符串
     *
     * @return 当前日期
     */
    public static String today() {
        return getCntDtStr(new Date(), "yyyyMMdd");
    }

    /**
     * 取得系统当前的日期，返回时间格式是yyyyMMdd的6位字符串
     *
     * @return 当前日期
     */
    public static String tomonth() {
        return getCntDtStr(new Date(), "yyyyMM");
    }

    /**
     * 取得系统当前的年月，返回时间格式是yyyy/MM
     *
     * @return 当前日期
     */
    public static String curYearMonth() {
        return getCntDtStr(new Date(), "yyyy/MM");
    }

    /**
     * 取得当前系统日期的星期数。该星期数是从星期天开始的0-6的数值
     *
     * @return 星期几
     */
    public static long currentWeek() {
        Calendar now = new GregorianCalendar();
        Integer cntWeek = now.get(Calendar.DAY_OF_WEEK) - 1;
        return cntWeek.longValue();
    }

    /**
     * 取得当前系统日期的月份数。该月份是从1月开始的1~12的数值
     *
     * @return
     */
    public static long currentMonth() {
        Calendar now = new GregorianCalendar();
        Integer cntMonth = now.get(Calendar.MONTH) + 1;
        return cntMonth.longValue();
    }

    /**
     * 取得当前系统日期的日数。该日数是在所在月份中的从1号开始的1~31的数值
     *
     * @return
     */
    public static long currentDay() {
        Calendar now = new GregorianCalendar();
        Integer cntMonth = now.get(Calendar.DATE);
        return cntMonth.longValue();
    }

    /**
     * 取得去年时间，格式YYYY
     * 比如当前2018，则去年为2017
     *
     * @return
     */
    public static String lastYear(String year) {
        return offsetYear(year,-1);
    }
    /**
     * 取得上个月，格式YYYY/MM
     * 比如当前2018/01，则上个月为2017/12
     *
     * @return
     */
    public static String lastMonth(String month) {
        return offsetMonth(month,-1);
    }
    /**
     * 取得昨天日期，格式YYYY/MM/dd
     * 比如当前2018/01/01，则上个月为2017/12/31
     *
     * @return
     */
    public static String lastDay(String day){
        return offsetDay(day,-1);
    }

    /**
     * 获取年份的offset后的值
     * @param dateStr 格式YYYY，传空表示当前年份
     * @param offset
     * @return
     */
    public static String offsetYear(String dateStr,int offset) {
        return offsetDate(dateStr,"yyyy",offset,Calendar.YEAR);
    }

    /**
     * 获取月份的offset后的值
     * @param dateStr 格式YYYY/MM，传空表示当前月份
     * @param offset
     * @return
     */
    public static String offsetMonth(String dateStr,int offset) {
        return offsetDate(dateStr,"yyyy/MM",offset,Calendar.MONTH);
    }

    /**
     * 获取日期的offset后的值
     * @param dateStr 格式YYYY/MM/dd，，传空表示当天
     * @param offset
     * @return
     */
    public static String offsetDay(String dateStr,int offset) {
        return offsetDate(dateStr,"yyyy/MM/dd",offset,Calendar.DATE);
    }
    private static String offsetDate(String dateStr,String dateFormatStr,int offset,int offsetUnit) {
        try{
            Date date = null;
            SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatStr);
            if(StringUtils.isNotEmpty(dateStr)){
                date = dateFormat.parse(dateStr);
            }else{
                date = new Date();
            }
//            System.out.print(dateFormat.format(date)+"的"+offset+"是：");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date); // 设置为当前时间
            calendar.set(offsetUnit, calendar.get(offsetUnit) +offset);
//            calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) +offset);
            date = calendar.getTime();
//            System.out.println(dateFormat.format(date));
            return dateFormat.format(date);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 取得当前系统日期毫秒数，以字符串形式返回
     *
     * @return long 毫秒数
     */
    public static long currentMillitm() {
        return System.currentTimeMillis();
    }

    /**
     * 根据日期类型（年月周日时分秒）按一定的数量来修改指定的日期时间。
     *
     * @param date   已知日期时间 yyyy-MM-dd HH:mm:ss
     * @param type   待修改的日期类型：
     *               year = 年
     *               month = 月
     *               day = 日
     *               hour = 小时
     *               minute = 分钟
     *               second = 秒
     * @param format 返回日期格式
     * @return 返回计算之后的日期
     */
    public static String add(String date, String type, int cnt, String format) {
        date = date.replace("/", "-");
        JDateTime jdt = new JDateTime(date);
        if (type.equals("year")) {
            jdt.addYear(cnt);
        } else if (type.equals("month")) {
            jdt.addMonth(cnt);
        } else if (type.equals("day")) {
            jdt.addDay(cnt);
        } else if (type.equals("hour")) {
            jdt.addHour(cnt);
        } else if (type.equals("minute")) {
            jdt.addMinute(cnt);
        } else if (type.equals("second")) {
            jdt.addSecond(cnt);
        }
        return getCntDtStr(jdt.convertToDate(), format);
    }

    /**
     * 根据日期类型（年月周日时分秒）按一定的数量来修改指定的日期时间。
     *
     * @param type   待修改的日期类型：
     *               year = 年
     *               month = 月
     *               day = 日
     *               hour = 小时
     *               minute = 分钟
     *               second = 秒
     * @param format 返回日期格式
     * @return 返回计算之后的日期
     */
    public static String add(String type, int cnt, String format) {
        JDateTime jdt = new JDateTime();
        if (type.equals("year")) {
            jdt.addYear(cnt);
        } else if (type.equals("month")) {
            jdt.addMonth(cnt);
        } else if (type.equals("day")) {
            jdt.addDay(cnt);
        } else if (type.equals("hour")) {
            jdt.addHour(cnt);
        } else if (type.equals("minute")) {
            jdt.addMinute(cnt);
        } else if (type.equals("second")) {
            jdt.addSecond(cnt);
        }
        return getCntDtStr(jdt.convertToDate(), format);
    }


    /**
     * 比较date1与date2时间大小
     *
     * @param date1
     * @param date2
     * @return 大于0 date1大，小于0 date1小，等于0 date1与date2相等
     */
    public static int compareDate(String date1, String date2) {


        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try {
            Date dt1 = df.parse(date1);
            Date dt2 = df.parse(date2);
            if (dt1.getTime() > dt2.getTime()) {
                return 1;
            } else if (dt1.getTime() < dt2.getTime()) {
                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }

    /**
     * 计算两个日期之间相差的天数
     *
     * @param bdate 较小的时间
     * @param edate 较大的时间
     * @return 相差天数
     * @throws ParseException
     */
    public static int daysBetween(Date bdate, Date edate) throws ParseException {
        long between_days = (edate.getTime() - bdate.getTime()) / (1000 * 3600 * 24);
        return Integer.parseInt(String.valueOf(between_days));
    }

    /**
     * 计算两个日期之间相差的天数
     *
     * @param bdate 较小的时间,时间格式yyyy/MM/dd或yyyy/MM/dd HH:mm:ss
     * @param edate 较大的时间
     * @return 相差天数
     * @throws ParseException
     */
    public static int daysBetween(String bdate, String edate) throws ParseException {
        bdate = bdate.substring(0, 10);
        edate = edate.substring(0, 10);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return daysBetween(sdf.parse(bdate), sdf.parse(edate));
    }

    /**
     * 字符串的日期格式的计算
     */
    public static int secondsBetween(String smdate, String bdate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(smdate));
        long time1 = cal.getTimeInMillis();
        cal.setTime(sdf.parse(bdate));
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / 1000;  //% 3600 / 60
        return Integer.parseInt(String.valueOf(between_days));
    }

    /**
     * 字符串的日期相差天数
     */
    public static String getDifferDay(int differ) throws ParseException {
        Date dNow = new Date();   //当前时间
        Date dBefore;
        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(dNow);//把当前时间赋给日历
        calendar.add(Calendar.DAY_OF_MONTH, differ);  //设置为前一天 -1
        dBefore = calendar.getTime();   //得到前一天的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //设置时间格式
        String defaultStartDate = sdf.format(dBefore);    //格式化前一天
        String defaultEndDate = sdf.format(dNow); //格式化当前时间

        return defaultStartDate;
    }

    /**
     * 验证日期是否符合格式
     *
     * @param strDate
     * @param formatStr
     * @return
     */
    public static boolean isValidDate(String strDate, String formatStr) {
        if (StringUtils.isEmpty(strDate) || StringUtils.isEmpty(formatStr)) {
            return false;
        }
        SimpleDateFormat format = new SimpleDateFormat(formatStr);
        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);
            format.parse(strDate);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * 将String型格式化,比如想要将2011-11-11格式化成2011年11月11日,就StringPattern("2011-11-11","yyyy-MM-dd","yyyy年MM月dd日").
     *
     * @param date       String 想要格式化的日期
     * @param oldPattern String 想要格式化的日期的现有格式
     * @param newPattern String 想要格式化成什么格式
     * @return String
     */
    public static String StringPattern(String date, String oldPattern, String newPattern) {
        if (date == null || oldPattern == null || newPattern == null)
            return "";
        SimpleDateFormat sdf1 = new SimpleDateFormat(oldPattern);        // 实例化模板对象
        SimpleDateFormat sdf2 = new SimpleDateFormat(newPattern);        // 实例化模板对象
        Date d = null;
        try {
            d = sdf1.parse(date);   // 将给定的字符串中的日期提取出来
        } catch (Exception e) {            // 如果提供的字符串格式有错误，则进行异常处理
            e.printStackTrace();       // 打印异常信息
        }
        return sdf2.format(d);
    }

    /**
     * 字符串的日期格式的计算
     */
    public static int daysBetween(String smdate, String bdate, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Calendar cal = Calendar.getInstance();
            cal.setTime(sdf.parse(smdate));
            long time1 = cal.getTimeInMillis();
            cal.setTime(sdf.parse(bdate));
            long time2 = cal.getTimeInMillis();
            long between_days = (time2 - time1) / (1000 * 3600 * 24);

            return Integer.parseInt(String.valueOf(between_days));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return 0;
    }

    /**
     * 根据传入的时间格式将对于的字符串转换成对应的时间
     *
     * @param date
     * @param format
     * @return
     * @throws Exception
     */
    public static Date getCntDtDate(String date, String format) throws Exception {
        SimpleDateFormat dtFmt = new SimpleDateFormat(format);
        Date nowDt = dtFmt.parse(date);
        return nowDt;
    }


    /**
     * 得到UTC时间，类型为字符串，格式为"yyyy-MM-ddTHH:mmZ"<br />
     * 如果获取失败，返回null
     *
     * @return
     */
    public static String getUTCTimeStr() {
        //T代表后面跟着时间，Z代表UTC统一时间
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
//        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
//        String time = sdf.format(new Date());
//        return time;
        String timestamp = null;
        Calendar cal = Calendar.getInstance();
        DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dfm.setTimeZone(TimeZone.getTimeZone("GMT"));
        timestamp = dfm.format(cal.getTime());
        return timestamp;
    }

    /**
     * 得到指定月的天数
     */
    public static int getMonthLastDay(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DATE, 1);//把日期设置为当月第一天
        cal.roll(Calendar.DATE, -1);//日期回滚一天，也就是最后一天
        int maxDate = cal.get(Calendar.DATE);
        return maxDate;
    }

    /**
     * 得到前一日/月/年的日期
     */
    public static String getLastDate(String queryDate, String rangeDrop) throws Exception {
        Calendar c = Calendar.getInstance();
        String lastDate = "";
        if (Constants.RANGEDROP_DADS.equals(rangeDrop)) {
            c.setTime(DateUtils.getCntDtDate(queryDate, "yyyy/MM/dd"));
            c.add(Calendar.DATE, -1);
            Date m = c.getTime();
            lastDate = DateUtils.getCntDtStr(m, "yyyy/MM/dd");
        } else if (Constants.RANGEDROP_YEARS.equals(rangeDrop)) {
            c.setTime(DateUtils.getCntDtDate(queryDate, "yyyy"));
            c.add(Calendar.YEAR, -1);
            Date m = c.getTime();
            lastDate = DateUtils.getCntDtStr(m, "yyyy");
        } else if (Constants.RANGEDROP_MONTH.equals(rangeDrop)) {
            c.setTime(DateUtils.getCntDtDate(queryDate, "yyyy/MM"));
            c.add(Calendar.MONTH, -1);
            Date m = c.getTime();
            lastDate = DateUtils.getCntDtStr(m, "yyyy/MM");
        }
        return lastDate;
    }
}
