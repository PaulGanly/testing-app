package org.example;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    boolean isBlankStringTrim(String string) {
        return string == null || string.trim().isEmpty();
    }

    boolean isBlankStringNative(String string) {
        return string == null || string.isBlank();
    }

    boolean isBlankStringApache(String string) {
        return StringUtils.isBlank(string);
    }
}
