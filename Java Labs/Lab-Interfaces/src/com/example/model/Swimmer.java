package com.example.model;

public interface Swimmer {
	int NUMBER_OF_FEET_IN_A_LEAGUE = 18228;
	void swim();
	default void dive() {
		System.out.println("Diving");
	}
	static int convertFeetToLeague(int feet) {
		return feet/NUMBER_OF_FEET_IN_A_LEAGUE;
	}
}
