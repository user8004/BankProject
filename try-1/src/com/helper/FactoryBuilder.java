package com.helper;

import com.bean.Insta;
import com.bean.WhatsappMsg;

public class FactoryBuilder {

	public void build(String mesgType,String msg)
	{
		IMessage converter= null;
		if("whatsapp".equals(mesgType))
		{
			converter=new WhatsappMsg();
		}
		else if("Insta".equals(mesgType))
		{
			converter=new Insta();
		}
		String cMsg=converter.convert(msg);
		System.out.println(cMsg);
	
	}
}
