package com.learn.design.gcz;

/**
 * 观察者
 */
public class James implements MovieListener{

	public void watchAv(){
		System.out.println("----");
	}

	public void wc(){
		System.out.println("--wc--");
	}

	public void kj(){
		System.out.println("--kj--");
	}

	@Override
	public void update(MovieEvent movieEvent) {

		MovieAEvent movieAEvent = (MovieAEvent) movieEvent;
		int type = movieAEvent.getType();
		if(type==1){
			kj();
		}else{
			wc();
		}

	}
}
