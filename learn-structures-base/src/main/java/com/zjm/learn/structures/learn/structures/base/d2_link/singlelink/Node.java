package com.zjm.learn.structures.learn.structures.base.d2_link.singlelink;

/**
 * 单个节点模型
 * @author Administrator
 *
 * @param <T>
 */
public class Node<T> {
	public T data;
	protected Node<T> next;
	
	public Node(T t) {
		this.data = t;
	}
	
	public void display() {
		System.out.println(data + " ");
	}
}
