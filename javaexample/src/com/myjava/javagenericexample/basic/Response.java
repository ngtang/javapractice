package com.myjava.javagenericexample.basic;

public class Response<T> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
