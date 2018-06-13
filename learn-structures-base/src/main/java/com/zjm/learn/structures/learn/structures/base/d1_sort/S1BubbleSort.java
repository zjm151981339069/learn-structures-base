package com.zjm.learn.structures.learn.structures.base.d1_sort;

import java.util.Arrays;

/**
 * 冒泡排序方法
 * 
 * @author Administrator
 *
 */
public class S1BubbleSort {
	// 未改进版本，如果序列本身已经排列好了还是会继续排序
	public static int[] name(int[] a) {
		int length = a.length;
		int temp = 0;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

	// 改进版本，如果序列本身已经排列好了不再继续排序
	public static int[] sortOptimize(int[] a) {
		int length = a.length;
		int temp = 0;
		int flag = 0;
		for (int i = 0; i < length - 1; i++) {
			flag = 0;
			for (int j = 0; j < length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;
				}
			}
			// 待排序的序列以及排好了，结束排序
			if(flag==0) {
				break;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int a[] = { 1, 4, 2, 5, 7, 3, 6, 20, -1, 60, 13,5,0,9999,299,100 };
		//int[] name = name(a);
		int[] name = sortOptimize(a);
		System.out.println(Arrays.toString(name));
	}
}
