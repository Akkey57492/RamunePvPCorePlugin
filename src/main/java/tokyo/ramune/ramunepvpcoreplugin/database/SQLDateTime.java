package tokyo.ramune.ramunepvpcoreplugin.database;

import java.util.Calendar;

public class SQLDateTime {

    private final Calendar cal = Calendar.getInstance();
    private final int year;
    private final int month;
    private final int day;
    private final int hour;
    private final int minute;
    private final int second;

    public SQLDateTime(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.day = month;
        this.month = month;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public SQLDateTime(String sqlDateTime) {
        year = sqlDateTime.charAt(0) + sqlDateTime.charAt(1) + sqlDateTime.charAt(2) + sqlDateTime.charAt(3);
        month = sqlDateTime.charAt(5) + sqlDateTime.charAt(6);
        day = sqlDateTime.charAt(8) + sqlDateTime.charAt(9);
        hour = sqlDateTime.charAt(11) + sqlDateTime.charAt(12);
        minute = sqlDateTime.charAt(14) + sqlDateTime.charAt(15);
        second = sqlDateTime.charAt(17) + sqlDateTime.charAt(18);
    }

    public SQLDateTime() {
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) + 1;
        day = cal.get(Calendar.DAY_OF_MONTH);
        hour = cal.get(Calendar.HOUR_OF_DAY);
        minute = cal.get(Calendar.MINUTE);
        second = cal.get(Calendar.SECOND);
    }

    public String getDate() {
        StringBuilder date = new StringBuilder();
        date.append(year);
        date.append("-");

        if (String.valueOf(month).length() == 1) {
            date.append("0");
            date.append(month);
        }
        if (String.valueOf(month).length() == 2) {
            date.append(month);
        }
        date.append("-");
        if (String.valueOf(day).length() == 1) {
            date.append("0");
            date.append(day);
        }
        if (String.valueOf(day).length() == 2) {
            date.append(day);
        }
        date.append(" ");
        if (String.valueOf(hour).length() == 1) {
            date.append("0");
            date.append(hour);
        }
        if (String.valueOf(hour).length() == 2) {
            date.append(hour);
        }
        date.append(":");
        if (String.valueOf(minute).length() == 1) {
            date.append("0");
            date.append(minute);
        }
        if (String.valueOf(minute).length() == 2) {
            date.append(minute);
        }
        date.append(":");
        if (String.valueOf(second).length() == 1) {
            date.append("0");
            date.append(second);
        }
        if (String.valueOf(second).length() == 2) {
            date.append(second);
        }
        return date.toString();
    }

    public String toString() {
        StringBuilder date = new StringBuilder();
        date.append(year);
        date.append("-");

        if (String.valueOf(month).length() == 1) {
            date.append("0");
            date.append(month);
        }
        if (String.valueOf(month).length() == 2) {
            date.append(month);
        }
        date.append("-");
        if (String.valueOf(day).length() == 1) {
            date.append("0");
            date.append(day);
        }
        if (String.valueOf(day).length() == 2) {
            date.append(day);
        }
        date.append(" ");
        if (String.valueOf(hour).length() == 1) {
            date.append("0");
            date.append(hour);
        }
        if (String.valueOf(hour).length() == 2) {
            date.append(hour);
        }
        date.append(":");
        if (String.valueOf(minute).length() == 1) {
            date.append("0");
            date.append(minute);
        }
        if (String.valueOf(minute).length() == 2) {
            date.append(minute);
        }
        date.append(":");
        if (String.valueOf(second).length() == 1) {
            date.append("0");
            date.append(second);
        }
        if (String.valueOf(second).length() == 2) {
            date.append(second);
        }
        return date.toString();
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
