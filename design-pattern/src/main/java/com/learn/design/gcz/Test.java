package com.learn.design.gcz;

public class Test {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.register(new James());
		movie.register(new Maybe());
		movie.play();

		//James james = new James(movie);


	}
}
