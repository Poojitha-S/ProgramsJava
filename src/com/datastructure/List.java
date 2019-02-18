package com.datastructure;

public interface List<T>
{
	public boolean isEmpty();
	public void add(T item);
	public void print();
	public boolean search(T item);
	public void remove(T item);
	public int size();
	public void append(T item);
	public int index(T item);
	public T pop();
	public T pop(int pos);
}
