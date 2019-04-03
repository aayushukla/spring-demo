package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.MessageProvider;
import com.capgemini.spring.provider.GMMessageProvider;
import org.springframework.context.*;
public class MessageRenderer {
	
	private MessageProvider message;

	public void setMessageRenderer(MessageProvider message) {
		this.message=message;
	}

	public void render() {
		System.out.println(message.getMessage());
	}
}
	

		