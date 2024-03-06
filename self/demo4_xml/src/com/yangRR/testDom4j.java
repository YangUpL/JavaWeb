package com.yangRR;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class testDom4j {

    @Test
    public void testRead(){
        SAXReader saxReader = new SAXReader();
        InputStream resourceAsStream =
                testDom4j.class.getClassLoader().getResourceAsStream
                        ("jdbc.xml");

        try {
            //dom树
            Document document = saxReader.read(resourceAsStream);

            //获取根元素
            Element rootElement = document.getRootElement();
            System.out.println(rootElement.getName());


            //获取子元素
            List<Element> elements = rootElement.elements();
            for (Element element : elements) {
                System.out.println("\t" + element.getName());

                //获取属性
                Attribute idAttribute = element.attribute("id");
                System.out.println("\t\t" + idAttribute.getName() + "=" +
                        idAttribute.getValue());


                //继续获取子元素
                //获取子元素的属性和文本
                List<Element> elements1 = element.elements();
                for (Element element1 : elements1) {
                    System.out.println("\t\t" + element1.getName() + ":" + element1.getText());
                }
            }



        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}

