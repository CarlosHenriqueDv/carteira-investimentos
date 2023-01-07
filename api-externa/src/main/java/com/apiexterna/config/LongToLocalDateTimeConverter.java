package com.apiexterna.config;

import com.fasterxml.jackson.databind.util.StdConverter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * carteira-investimentos
 *
 * @author cshen on 07/01/2023.
 */
public class LongToLocalDateTimeConverter extends StdConverter<Long, LocalDateTime> {
    public LocalDateTime convert(final Long value) {
        return Instant.ofEpochSecond(value).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}
