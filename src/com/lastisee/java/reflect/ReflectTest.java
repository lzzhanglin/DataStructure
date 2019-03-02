package com.lastisee.java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author lzzhanglin
 * @date 2019/2/25 13:56
 */
public class ReflectTest {
    public static  Car initByDefaultConst() throws Throwable {
//        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        ClassLoader classLoader = Car.class.getClassLoader();
        Class clazz = classLoader.loadClass("com.lastisee.java.reflect.Car");

        Constructor constructor = clazz.getDeclaredConstructor((Class[]) null);
        Car car = (Car) constructor.newInstance();

        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "上汽大众2018款朗逸");

        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "白色");

        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 260);

        Field field = clazz.getDeclaredField("maxSpeed");

        field.setAccessible(true);
        field.setInt(car,280);



        return car;
    }


    public static void main(String[] args)throws Throwable {
        ClassLoader classLoader = Car.class.getClassLoader();
        Class cl = Class.forName("com.lastisee.java.reflect.Car");

//        Car car = initByDefaultConst();
//        car.introduce();
    }
}
