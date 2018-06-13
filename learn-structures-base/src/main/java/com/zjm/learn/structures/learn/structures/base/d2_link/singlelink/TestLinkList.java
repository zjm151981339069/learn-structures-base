package com.zjm.learn.structures.learn.structures.base.d2_link.singlelink;

public class TestLinkList {
	public static void main(String[] args) {
		LinkList<Integer> linkList = new LinkList<Integer>();
		linkList.addFirstNode(20);
		linkList.addFirstNode(21);
		linkList.addFirstNode(19);
		// print19,21,20
		linkList.add(1, 22); // print19,22,21,20
		linkList.add(2, 23); // print19,22,23,21,20
		linkList.add(3, 99); // print19,22,23,99,21,20
		// 调用此方法会print 19,22,23,99,21,20
		linkList.displayAllNodes();
	}
}