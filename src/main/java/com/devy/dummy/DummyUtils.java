package com.devy.dummy;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Random;
import java.util.random.RandomGenerator;

@Slf4j
@Component
public class DummyUtils {

    public <O> O fill(Class<O> clazz) throws Exception{
        Random random = new Random();
        // 객체 생성
        Constructor<O> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        O instance = constructor.newInstance();

        log.info("before: {}", instance);

        // 객체 안의 필드
        Field[] fields = clazz.getDeclaredFields();

        for(Field field : fields) {
            field.setAccessible(true);

            Object value;
            // 문자열
            if(field.getType().equals(String.class)) {
                value = RandomStringUtils.randomAlphabetic(10);
            // 숫자
            } else if(field.getType().equals(Integer.class) || field.getType().equals(int.class)) {
                value = random.nextInt(Integer.MAX_VALUE);
            } else if(field.getType().equals(Double.class) || field.getType().equals(double.class)) {
                value = random.nextDouble(Double.MAX_VALUE);
            } else if(field.getType().equals(Long.class) || field.getType().equals(long.class)) {
                value = random.nextLong(Long.MAX_VALUE);
            } else if(field.getType().equals(Float.class) || field.getType().equals(float.class)) {
                value = random.nextFloat(Float.MAX_VALUE);
            // boolean 처리
            } else if(field.getType().equals(Boolean.class) || field.getType().equals(boolean.class)) {
                value = random.nextBoolean();
            // byte 처리
            } else if(field.getType().equals(Byte.class) || field.getType().equals(byte.class)) {
                value = random.nextInt(Integer.MAX_VALUE);
            } else if(field.getType().equals(Character.class) || field.getType().equals(char.class)) {
                value = random.nextInt(Integer.MAX_VALUE);
            } else if(field.getType().equals(Short.class) || field.getType().equals(short.class)) {
                value = random.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
            } else if(field.getType().equals(LocalDate.class)) {

            } else {
                throw new IllegalArgumentException();
            }
            field.set(instance, value);
        }


        //객체 타입 비교
            // long, Long
            // boolean, Boolean
            // int, Integer
            // double, Double
            // float, Float
            // String
            // Collection
                // Map
                // Set
                // List

        log.info("after: {}", instance);

        return instance;
    }

    private <T> void makeValue(Field field) throws Exception {

    }
}
