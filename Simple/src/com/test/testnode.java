package com.test;

public class testnode <T extends Comparable <T>>  {
	private T data;
	private testnode<T> next;
	
	public testnode(T data){
		this.data=data;
		setNext(null);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public testnode<T> getNext() {
		return next;
	}

	public void setNext(testnode<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return String.valueOf(data);
	}
	
	
	

}
