package com.ethlo.time;

import java.time.OffsetDateTime;

/**
 * Optional dependency that is stubbed to satisfy Android build
 */
public class ITU {
    public static OffsetDateTime parseDateTime(String text)
    {
        throw new UnsupportedOperationException();
    }
}
