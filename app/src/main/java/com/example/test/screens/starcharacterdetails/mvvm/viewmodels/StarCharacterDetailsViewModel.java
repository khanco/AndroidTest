package com.example.test.screens.starcharacterdetails.mvvm.viewmodels;

import com.example.test.utils.Constants;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StarCharacterDetailsViewModel {

    public String getHeightInMetersFromCms(String heightInCms) {

        try {

            double height = Double.parseDouble(heightInCms);
            DecimalFormat df = new DecimalFormat(Constants.DECIMAL_FORMAT);
            return String.valueOf(df.format(height * Constants.METER_CONVERSION_MULTIPLIER));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getRecordDateTime(String datetime) {

        DateFormat originalFormat = new SimpleDateFormat(Constants.SERVER_DATE_FORMAT, Locale.ENGLISH);
        DateFormat targetFormat = new SimpleDateFormat(Constants.USER_READABLE_DATE_FORMAT, Locale.ENGLISH);
        Date date;

        try {

            date = originalFormat.parse(datetime);
            return targetFormat.format(date);

        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }
}
