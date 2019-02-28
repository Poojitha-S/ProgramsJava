package com.bridgeit.datastructure;

public class TestDuplicatesRemoval {

	public static void main(String[] args) {
		RemovalOfDuplicates<Integer> r=new RemovalOfDuplicates<Integer>();
		r.add(1);
		r.add(3);
		r.add(1);
		r.add(2);
		r.add(8);
		r.print();
	}

}
