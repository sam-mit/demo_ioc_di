package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan("com.example.demo")
public class DemoUsingComponentScanIT {

    @Autowired
    private InjectFormatterUsingConstructor injectFormatterUsingConstructor;

    @Test
    public void givenAutowiredAnnotation_WhenSetOnConstructor_ThenDependencyValid_usingComponentScan() {

        String originalText = "This is a text !";
        String formattedArticle = injectFormatterUsingConstructor.format(originalText);

        assertTrue(originalText.toUpperCase().equals(formattedArticle));
    }

}
