package com.networknt.schema.regex;

/**
 * Optional dependency that is stubbed to satisfy Android build
 */
public class JoniRegularExpression implements RegularExpression {
    JoniRegularExpression(String regex) {}
    @Override
    public boolean matches(String value) {
        throw new UnsupportedOperationException();
    }
}
