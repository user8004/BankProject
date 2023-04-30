package com.testapp;

import com.helper.FactoryBuilder;

public class TestApplication {

	public static void main(String[] args) {
		FactoryBuilder factorybuilder= new FactoryBuilder();
		factorybuilder.build("whatsapp", "hiii");
		factorybuilder.build("Insta", "abc");

	}

}
