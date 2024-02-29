package com.github.compression_algorithm_research_lab.delta.operator.algorithm.javabean;

import com.github.compression_algorithm_research_lab.delta.operator.algorithm.DiffAlgorithm;
import com.github.compression_algorithm_research_lab.delta.operator.algorithm.DiffAlgorithmResult;
import com.github.compression_algorithm_research_lab.delta.operator.change.NamePathLocation;

import java.util.List;
import java.util.Map;

/**
 * @author CC11001100
 */
public class JavaBeanDiffAlgorithm<ITEM> implements DiffAlgorithm<ITEM, NamePathLocation> {

    public List<DiffAlgorithmResult<ITEM, NamePathLocation>> diff(ITEM item1, ITEM item2) {



        return null;
    }

    public Map<NamePathLocation, Object> flatJavaBean() {
        
    }

}
