package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Test
	public void givenAutowiredAnnotation_WhenSetOnConstructor_ThenDependencyValid_usingXMLConfiguration() {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		InjectFormatterUsingConstructor article = (InjectFormatterUsingConstructor) context.getBean("injectFormatterBean");

		String originalText = "This is a text !";
		String formattedArticle = article.format(originalText);

		assertTrue(originalText.toUpperCase().equals(formattedArticle));
	}
}

