package com.networknt.schema.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Optional dependency that is stubbed to satisfy Android build
 */
public class YamlMapperFactory {
    public static ObjectMapper getInstance() {
        throw new UnsupportedOperationException();
    }
}
