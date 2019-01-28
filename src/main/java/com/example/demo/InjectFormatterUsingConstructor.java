package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.context.annotation.Configuration;

@Component
public class InjectFormatterUsingConstructor {
    private TextFormatter textFormatter;

    @Autowired
    public InjectFormatterUsingConstructor(TextFormatter textFormatter1) {
        this.textFormatter = textFormatter1;
    }

    public String format(String text) {
        return textFormatter.format(text);
    }
}
