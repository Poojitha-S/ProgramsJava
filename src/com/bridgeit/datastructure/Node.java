package com.bridgeit.datastructure;

public class Node<T> implements Comparable<T> 
{
	private T data;
	private Node<T> next;
	public Node() {
		this.data = null;
		this.next = null;
	}
	public Node(T data) {
		super();
		this.data = data;
		this.next = null;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	@Override
	public boolean equals(Object ele) {
		if (this.getData().equals(ele))
			return true;
		return false;
	}
	@Override
	public int compareTo(T ele) {
		return ((Comparable<T>) this.getData()).compareTo(ele);
	}
}
