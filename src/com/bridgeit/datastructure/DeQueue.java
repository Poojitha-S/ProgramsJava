package com.bridgeit.datastructure;

public interface DeQueue<T> 
{
	public void rearEnqueue(T ele);
	public T rearDequeue();
	public T frontDequeue();
	public void frontEnqueue(T ele);
}
