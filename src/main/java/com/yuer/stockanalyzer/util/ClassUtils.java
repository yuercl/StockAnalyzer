package com.yuer.stockanalyzer.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ClassUtils {

	public static Class<?> getGenericClass(Object obj) {
        Class<?> result =null;
        Type type = obj.getClass().getGenericSuperclass();
        if(type instanceof ParameterizedType){
             ParameterizedType pt =(ParameterizedType) type;
             Type[] fieldArgTypes = pt.getActualTypeArguments();
             result =(Class<?>) fieldArgTypes[0];
       }
       return result;
	 }

}