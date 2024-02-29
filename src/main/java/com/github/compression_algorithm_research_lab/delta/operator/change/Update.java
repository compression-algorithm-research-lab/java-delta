package com.github.compression_algorithm_research_lab.delta.operator.change;

/**
 * @author CC11001100
 */
public class Update<LOCATION> extends Change<LOCATION> {

    private ValueType fromType;

    private Object fromValue;

    private ValueType toType;

    private Object toValue;

    public Update() {
    }

}
