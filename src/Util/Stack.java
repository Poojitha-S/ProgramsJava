package Util;
public class Stack<T>
{
private int maxsize;
private T[] stack_array;
private int top;


@SuppressWarnings("unchecked")
public Stack()
{
maxsize=1000;
stack_array=(T[])new Object[maxsize];
top=-1;

}
	@SuppressWarnings("unchecked")
	public Stack(int size)
	{
	maxsize=size;
	stack_array=(T[])new Object[size];
	top=-1;
	}
	
	/**
	 * @param element is to be pushed
	 */
	public void push(T element)
	{
		stack_array[++top]=element;
	}
	
	/**
	 * @return top most element
	 */
	public T pop()
	{
		return stack_array[top--];
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	
	/**
	 * @return the size of stack
	 */
	public int size()
	{	if(!(isEmpty()))
		{
		return top+1;
		}
	else
		return 0;
	}
	
	public T peak()
	{
		return stack_array[top];
	}
	
	/**
	 * @return the position of top
	 */
	public boolean isFull()
	{
	return (top==maxsize-1);
	}
	
	public int getStackCapacity()
	{
		return maxsize;
	}
}
