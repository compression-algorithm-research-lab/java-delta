package com.github.compression_algorithm_research_lab.delta.operator.change;

/**
 * 用枚举来表示基础数据类型
 *
 * @author CC11001100
 */
public enum ValueType {

    STRING,

    DOUBLE,

    FLOAT,

    LONG,

    INTEGER,

    SHORT,

    BYTE,

    CHARACTER,

    BOOLEAN;


    /**
     * 把对象转换为枚举值
     *
     * @param o
     * @return
     */
    public static ValueType typeOf(Object o) {
        if (o == null) {
            return null;
        }
        return typeByClass(o.getClass());
    }

    /**
     * 根据Class转换为枚举值
     *
     * @param clazz
     * @return
     */
    public static ValueType typeByClass(Class clazz) {
        if (clazz == String.class) {
            return STRING;
        } else if (clazz == Double.class || clazz == double.class) {
            return DOUBLE;
        } else if (clazz == Float.class || clazz == float.class) {
            return FLOAT;
        } else if (clazz == Long.class || clazz == long.class) {
            return LONG;
        } else if (clazz == Integer.class || clazz == int.class) {
            return INTEGER;
        } else if (clazz == Short.class || clazz == short.class) {
            return SHORT;
        } else if (clazz == Byte.class || clazz == byte.class) {
            return BYTE;
        } else if (clazz == Change.class || clazz == char.class) {
            return CHARACTER;
        } else if (clazz == Boolean.class || clazz == boolean.class) {
            return BOOLEAN;
        } else {
            return null;
        }
    }

}
