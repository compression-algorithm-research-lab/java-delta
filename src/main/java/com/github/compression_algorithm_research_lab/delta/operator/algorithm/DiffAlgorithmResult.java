package com.github.compression_algorithm_research_lab.delta.operator.algorithm;

import com.github.compression_algorithm_research_lab.delta.operator.change.Change;

import java.util.List;

/**
 * @author CC11001100
 */
public class DiffAlgorithmResult<ITEM, LOCATION> {

    /**
     * 原始数据
     */
    private ITEM item;

    /**
     * 与之前的比较，发生的变化
     */
    private List<Change<LOCATION>> changeList;

}
