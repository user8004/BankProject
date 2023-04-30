package com.bean;

import com.helper.IMessage;

public class WhatsappMsg implements IMessage {

	@Override
	public String convert(String msg) {
		
		return " whatsApp "+msg+" /whatsapp ";
	}

}
