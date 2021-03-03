package com.crowdlending.util

import java.text.SimpleDateFormat

class VOUtil {

    public static final String DATE_FORMAT = "dd/MM/yyyy"
    public static final String JSON_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss"

    static String dateToString(Date date, String dateFormat = DATE_FORMAT) {
        if (date) {
            try {
                String dateStr = new SimpleDateFormat(dateFormat)?.format(date)
                return dateStr
            } catch (Exception e) {
                println "Exception in 'dateToString() at VOUtil' ===>>> ${e.message}"
            }
        }
        return ""
    }

}


