package com.github.compression_algorithm_research_lab.delta.operator.change;

/**
 * 用于表示发现的变化情况
 *
 * @author CC11001100
 */
public class Change<LOCATION> {

    /**
     * 用于表示发生了变化的项的名称，比如如果是json的话可能就是一个键名称，如果是class的话可能就是一个成员变量名称
     */
    private LOCATION location;

    public Change() {
    }

    public <V> V getAs(Object value) {
        if (value == null) {
            return null;
        } else {
            return (V) value;
        }
    }

}
