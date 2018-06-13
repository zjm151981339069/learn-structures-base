package com.zjm.learn.structures.learn.structures.base.d2_link.singlelink;

public class LinkList<T> {
	public Node<T> head;
	private int postion = 0;
	
	public LinkList() {
		this.head = null;
	}
	
	public void addFirstNode(T t) {
		Node<T> node = new Node<T>(t);
		node.next = head;
		head = node;
	}
	
	public Node<T> deleteFirstNode() {
		Node<T> temp = head;
		head = temp.next;
		return temp;
	}
	
	// 添加到任意节点
	public void add (int index, T t) {
		Node<T> node = new Node<T>(t);
		Node<T> current = head;
		Node<T> previous = head;
		while(postion!= index) {
			previous = current;
			current = current.next;
			postion++;
		}
		node.next = current;
		previous.next =node;
		postion=0;
		
	}
	
	// 删除指定节点
	public Node<T> deleteByPos(int index){
		Node<T> current = head;
		Node<T> previous = head;
		while(postion!=index) {
			previous = current;
			current = current.next;
			postion++;
		}
		if(current == head) {
			head = head.next;
		}else {
			postion = 0;
			previous.next = current.next;
		}
		return current;
	}
	
	public Node<T> deleteByData(T t){
		Node<T> current = head;
		Node<T> previous = head;
		while(current.data != t) {
			if(current.next == null) {
				return null;
			}
			previous = current;
			current = current.next;
			if(current==head) {
				head = head.next;
			}else {
				previous.next = current.next;
			}
		}
		return current;
	}
	
	public void displayAllNodes() {
		Node<T> current = head;
		while(current!=null) {
			current.display();
			current = current.next;
		}
	}
	
	public Node<T> findByPos(int index){
		Node<T> current = head;
		while(postion != index) {
			current = current.next;
			postion++;
		}
		return current;
	}
	
	public Node<T> findByData(T t){
		Node<T> current = head;
		while(current.data !=t) {
			if(current.next==null) {
				return null;
			}
			current = current.next;
		}
		return current;
	}
} 
