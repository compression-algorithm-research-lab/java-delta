package com.github.compression_algorithm_research_lab.delta.input;

import java.util.Iterator;

/**
 * @author CC11001100
 */
public interface Input<T> {

    Iterator<T> read();

}
