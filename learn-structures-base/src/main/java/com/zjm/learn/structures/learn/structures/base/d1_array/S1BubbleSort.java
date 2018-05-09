package com.zjm.learn.structures.learn.structures.base.d1_array;

import java.util.Arrays;

/**
 * 冒泡排序方法
 * @author Administrator
 *
 */
public class S1BubbleSort {
	public static int[] name(int[] a) {
		int length = a.length;
		int temp = 0;
		for (int i = 0; i < length-1; i++) {
			for (int j = 0; j < length-1-i; j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;					
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		 int a[] = {1,4,2,5,7,3,6,20,-1,60,13 }; 
		int[] name = name(a);
		System.out.println(Arrays.toString(name));
	}
}
