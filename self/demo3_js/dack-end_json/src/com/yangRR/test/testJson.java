package com.yangRR.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yangRR.pojo.Dog;
import com.yangRR.pojo.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testJson {

    /**
     * 将对象转成json字符串
     * @throws JsonProcessingException
     */
    @Test
    public void testWriteJson() throws JsonProcessingException {
        Dog dog = new Dog("小黄");
        Person person = new Person("张三",10,dog);

        ObjectMapper objectMapper = new ObjectMapper();
        String personStr = objectMapper.writeValueAsString(person);
        System.out.println(personStr);
    }


    /**
     * 将json转为对象
     * @throws JsonProcessingException
     */
    @Test
    public void ReadJson() throws JsonProcessingException {
        String str = "{\"name\":\"张三\",\"age\":10,\"dog\":{\"name\":\"小黄\"}}";
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = objectMapper.readValue(str, Person.class);

        System.out.println(person);
    }


    @Test
    public void testMapToJson() throws JsonProcessingException {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("key1","value1");
        hashMap.put("key2","value2");

        ObjectMapper objectMapper = new ObjectMapper();
        String string = objectMapper.writeValueAsString(hashMap);

        System.out.println(string);

    }

    @Test
    public void testListAndStringToJson() throws JsonProcessingException {
        Dog dog = new Dog("小黄");
        Person person = new Person("张三",10,dog);

        List<Person> arrayList = new ArrayList<>();
        arrayList.add(person);

        String[] str = {"A","B","C"};

        ObjectMapper objectMapper = new ObjectMapper();
        String string = objectMapper.writeValueAsString(arrayList);

        System.out.println(string);

    }


}
