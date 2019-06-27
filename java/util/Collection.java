/*
 * Copyright (c) 1997, 2010, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package java.util;


public interface Collection<E> extends Iterable<E> {
    // Query Operations

    /**
     * 集合中元素的个数
     * @return
     */
    int size();

    /**
     * 判断是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 判断集合是否包含某个元素
     * @param o
     * @return
     */
    boolean contains(Object o);

    /**
     * 获取迭代器
     * @return
     */
    Iterator<E> iterator();

    /**
     * 将集合转化为数组
     * @return
     */
    Object[] toArray();

    /**
     * 集合转化为数组
     */
    <T> T[] toArray(T[] a);

    // Modification Operations

    /**
     * 添加元素
     * @param e
     * @return
     */
    boolean add(E e);

    /**
     * 移除元素
     * @param o
     * @return
     */
    boolean remove(Object o);


    // Bulk Operations

    /**
     * 判断一个集合是否包含另一个集合中的所有元素
     * @param c
     * @return
     */
    boolean containsAll(Collection<?> c);

    /**
     *  将另一个集合中的元素全部添加到该集合中
     * @param c
     * @return
     */
    boolean addAll(Collection<? extends E> c);

    /**
     * 移除共有元素
     * @param c
     * @return
     */
    boolean removeAll(Collection<?> c);

    /**
     * 移除该集合有，但是参数集合没有所有元素
     * @param c
     * @return
     */
    boolean retainAll(Collection<?> c);

    /**
     * 清空整个集合
     */
    void clear();


    // Comparison and hashing


    boolean equals(Object o);


    int hashCode();
}
