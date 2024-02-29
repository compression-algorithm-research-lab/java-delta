package com.github.compression_algorithm_research_lab.delta.operator.change;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CC11001100
 */
public class NamePathLocation {

    private List<String> pathList;

    public void appendPath(String path) {
        if (this.pathList == null) {
            this.pathList = new ArrayList<String>();
        }
        this.pathList.add(path);
    }

    public List<String> getPathList() {
        return pathList;
    }

    public void setPathList(List<String> pathList) {
        this.pathList = pathList;
    }

}
