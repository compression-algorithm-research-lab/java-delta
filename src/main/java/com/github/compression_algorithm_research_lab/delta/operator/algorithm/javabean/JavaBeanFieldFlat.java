package com.github.compression_algorithm_research_lab.delta.operator.algorithm.javabean;

import com.github.compression_algorithm_research_lab.delta.operator.change.NamePathLocation;
import com.github.compression_algorithm_research_lab.delta.operator.change.ValueType;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author CC11001100
 */
public class JavaBeanFieldFlat {

    /**
     * 用于避免环型引用陷入死循环
     */
    private final Set<String> visitedLocationSet = new HashSet<String>();

    private Object o;

    public void f() {

        Set<Object> visitedObjectSet = new HashSet<Object>();
        Queue<VisitJavaBeanContext> queue = new LinkedList<VisitJavaBeanContext>();
        queue.add(new VisitJavaBeanContext(new NamePathLocation(), this.o));

        while (!queue.isEmpty()) {
            VisitJavaBeanContext context = queue.poll();
            if () {

            }
        }


    }

    private void visitJavaBeanByContext(VisitJavaBeanContext context) {
        Class<?> clazz = o.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Object o1 = declaredField.get(context.getBeanInstance());
            if (o1 == null) {

            }
            if (ValueType.typeOf()) {

            }
        }
    }

    /**
     * 遍历Java Bean时每个任务的上下文
     */
    public static class VisitJavaBeanContext {

        /**
         * 当前Bean的基础路径，因为当前Bean可能是一个根路径，也可能是一个内嵌的复合对象啥的
         */
        private NamePathLocation baseNamePathLocation;

        /**
         * 对象实例
         */
        private Object beanInstance;

        public VisitJavaBeanContext() {
        }

        public VisitJavaBeanContext(NamePathLocation baseNamePathLocation, Object beanInstance) {
            this.baseNamePathLocation = baseNamePathLocation;
            this.beanInstance = beanInstance;
        }

        public NamePathLocation getBaseNamePathLocation() {
            return baseNamePathLocation;
        }

        public void setBaseNamePathLocation(NamePathLocation baseNamePathLocation) {
            this.baseNamePathLocation = baseNamePathLocation;
        }

        public Object getBeanInstance() {
            return beanInstance;
        }

        public void setBeanInstance(Object beanInstance) {
            this.beanInstance = beanInstance;
        }

    }


}
