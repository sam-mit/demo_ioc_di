package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class TextFormatter {
    public String format(String text) {
        return text.toUpperCase();
    }
}
