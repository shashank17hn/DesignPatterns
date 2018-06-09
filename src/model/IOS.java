package model;

import interfaces.OS;

public class IOS implements OS{

	@Override
	public void specs() {
		System.out.println("I am IOS, I come with costly devices");
	}

}
