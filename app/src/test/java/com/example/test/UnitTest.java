package com.example.test;

import com.example.test.screens.starcharacterdetails.mvvm.viewmodels.StarCharacterDetailsViewModel;
import junit.framework.Assert;
import org.junit.Test;

public class UnitTest {

    @Test
    public void validateHeightConversion() {
        StarCharacterDetailsViewModel viewModel = new StarCharacterDetailsViewModel();
        String height = viewModel.getHeightInMetersFromCms("100");
        Assert.assertEquals("Height conversion", "1", height);
        height = viewModel.getHeightInMetersFromCms("250");
        Assert.assertEquals("Height conversion", "2.5", height);
    }

    @Test
    public void validateDateConversion() {
        StarCharacterDetailsViewModel viewModel = new StarCharacterDetailsViewModel();
        String dateTime = viewModel.getRecordDateTime("2014-12-09T13:50:51.644000Z");
        Assert.assertEquals("DateTime Conversion", "2014/01/09 14:01", dateTime);
    }
}
