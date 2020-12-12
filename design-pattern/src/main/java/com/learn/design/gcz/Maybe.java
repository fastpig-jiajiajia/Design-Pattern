package com.learn.design.gcz;


/**
*@author: rui.xu
*@date: 2020/12/12 15:42
*@description: 
*/
public class Maybe implements MovieListener{

	private int i;

	public void watchAv(){
		System.out.println("----");
	}

	public void shutdown(){
		System.out.println("--shutdown--");
	}

	@Override
	public void update(MovieEvent movieEvent) {
		MovieAEvent movieAEvent = (MovieAEvent) movieEvent;
		int type = movieAEvent.getType();
		if(type==1){
			shutdown();
		}
	}
}
