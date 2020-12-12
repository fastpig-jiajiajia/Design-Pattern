package com.learn.design.gcz;

public class MovieAEvent implements MovieEvent {
	private int type;

	public void setType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}
}
