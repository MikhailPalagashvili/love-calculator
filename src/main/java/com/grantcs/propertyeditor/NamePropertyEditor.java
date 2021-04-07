package com.grantcs.propertyeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String convertedStringValueToUpperCase = text.toUpperCase();
        setValue(convertedStringValueToUpperCase);
    }
}
