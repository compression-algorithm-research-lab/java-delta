package com.github.compression_algorithm_research_lab.delta.operator.change;

/**
 * @author CC11001100
 */
public class Add<LOCATION> extends Change<LOCATION> {

    private ValueType type;

    /**
     * 增加的值
     */
    private Object value;

    public Add() {
    }

}
