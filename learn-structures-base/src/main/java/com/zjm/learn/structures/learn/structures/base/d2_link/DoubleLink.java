package com.zjm.learn.structures.learn.structures.base.d2_link;

public class DoubleLink<T> {
	private DNode<T> mHead; 
	private int mCount = 0;
	
	
	// 该类承载前后数据指针以及对象本身的数据内容
	private class DNode<T>{
		public DNode prev;
		public DNode next;
		public T value;
		public DNode(DNode prev, DNode next, T value) {
			this.prev = prev;
			this.next = next;
			this.value = value;
		}
	}
	
	//构造函数
	public DoubleLink() {
		mHead = new DNode<T>(null,null,null);
		mHead.prev= mHead.next = mHead;
		mCount = 0;
	}
	
	
	// 返回节点数据长度
	public int size() {
		return mCount;
	}
	// 返回链表是否为空
	
	public boolean isEmpty() {
		return mCount == 0;
	}
	
}
