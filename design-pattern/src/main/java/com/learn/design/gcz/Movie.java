package com.learn.design.gcz;

import java.util.ArrayList;
import java.util.List;

/**
*
*@author: rui.xu
*@create: ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}
*@description: ${description}
*/
public class Movie {
	List<MovieListener> movieListeners= new ArrayList<>();

	public void register(MovieListener movieListener){
		movieListeners.add(movieListener);
	}

	public void play() {
		System.out.println("发布一个电影开始播放事件");
		MovieAEvent movieEvent = new MovieAEvent();
		movieEvent.setType(1);
		for (MovieListener movieListener : movieListeners) {
			movieListener.update(movieEvent);
		}

		test();

	}

	public  void test(){
		System.out.println("经常的地方");
		MovieAEvent movieEvent = new MovieAEvent();
		movieEvent.setType(2);
		for (MovieListener movieListener : movieListeners) {
			movieListener.update(movieEvent);
		}

	}

}
