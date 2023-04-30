package com.bean;

import com.helper.IMessage;

public class Insta implements IMessage {

	@Override
	public String convert(String msg) {
		// TODO Auto-generated method stub
		return " insta "+msg+" /insta ";
	}

}
