package com.github.compression_algorithm_research_lab.delta.operator.algorithm;

import java.util.List;

/**
 * @author CC11001100
 */
public interface DiffAlgorithm<ITEM, LOCATION> {

    List<DiffAlgorithmResult<ITEM, LOCATION>> diff(ITEM item1, ITEM item2);

}
