package com.zjm.learn.structures.learn.structures.base.d2_link;

public class DoubleLink<T> {
	private DNode<T> mHead;
	private int mCount = 0;

	// 该类承载前后数据指针以及对象本身的数据内容
	private class DNode<T> {
		public DNode prev;
		public DNode next;
		public T value;

		public DNode(DNode prev, DNode next, T value) {
			this.prev = prev;
			this.next = next;
			this.value = value;
		}
	}

	// 构造函数
	public DoubleLink() {
		mHead = new DNode<T>(null, null, null);
		mHead.prev = mHead.next = mHead;
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

	// 获取第index位置的节点
	private DNode<T> getNode(int index) {
		if (index < 0 || index > mCount) {
			throw new IndexOutOfBoundsException();
		}
		// 正向查找
		if (index <= mCount / 2) {
			DNode<T> node = mHead.next;
			for (int i = 0; i < index; i++) {
				node = node.next;
			}
			return node;
		}
		if (index > mCount / 2) {
			DNode<T> prev = mHead.prev;
			int reindex = mCount - index - 1;
			for (int i = 0; i < reindex; i++) {
				prev = prev.prev;
			}
			return prev;
		}
		return mHead;
	}

	// 获取index 位置的数据
	public T get(int index) {
		return getNode(index).value;
	}

	// 获取第1个节点的值
	public T getFirst() {
		return getNode(0).value;
	}

	// 获取最后一个节点的值
	public T getLast() {
		return getNode(mCount - 1).value;
	}
	
	// 插入节点到index 位置之前
	public void insert(int index ,T t) {
		if (index == 0) {
			DNode<T> node = new DNode<T>(mHead, mHead.next,t);
			mHead.next.prev = node;
			mHead.next = node;
			mCount++;
			return;
		}
		 DNode<T> inode = getNode(index);
		 DNode<T> tnode = new DNode<T>( inode.prev, inode,t);
		 inode.prev.next = tnode;
		 inode.next = tnode;
		 mCount++;
		 return;
	}
	
	// 插入到第一个节点
	public void insertFirst(T t) {
		insert(0, t);
	}
	
	// 将节点追加到链表的末尾
	public void appendLast(T t) {
		DoubleLink<T>.DNode<T> dNode = new DNode<T>(mHead.prev,mHead,t);
		mHead.prev.next = dNode;
		mHead.prev = dNode;
		mCount++;
	}
	// 删除指定index位置的节点
	public void del(int index) {
		DoubleLink<T>.DNode<T> node = getNode(index);
		node.prev.next = node.next;
		node.next.prev = node.prev;
		node = null;
		mCount--;
	}
	
	// 删除第一个节点
	public void deleteFirst() {
		del(0);
	}
	
	// 删除最后一个节点
	public void deleteLast() {
		del(mCount-1);
	}
}
