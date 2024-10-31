package com.ethlo.time;

import java.time.DateTimeException;

/**
 * Optional dependency that is stubbed to satisfy Android build
 */
public class LeapSecondException extends DateTimeException {
    LeapSecondException(String string) {
        super(string);
    }

    public boolean isVerifiedValidLeapYearMonth()
    {
        throw new UnsupportedOperationException();
    }
}
