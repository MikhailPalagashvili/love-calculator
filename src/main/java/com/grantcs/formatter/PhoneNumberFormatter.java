package com.grantcs.formatter;

import com.grantcs.api.PhoneNumber;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class PhoneNumberFormatter implements Formatter<PhoneNumber> {
    @Override
    public PhoneNumber parse(String text, Locale locale) throws ParseException {
        String[] phoneNumberArray = text.split("-");
        String countryCode = phoneNumberArray[0];
        String number = phoneNumberArray[1];
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setCountryCode(countryCode);
        phoneNumber.setNumber(number);
        return phoneNumber;
    }

    @Override
    public String print(PhoneNumber object, Locale locale) {
        return null;
    }
}
