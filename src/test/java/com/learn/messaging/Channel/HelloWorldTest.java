package com.learn.messaging.Channel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("helloworld.xml")
public class HelloWorldTest {

	@Autowired
	@Qualifier("messageChannel")
	MessageChannel messageChannel;

	@Test
	public void testHelloWorld() {
		Message<String> helloWorld = new GenericMessage<String>("Hello World");
		messageChannel.send(helloWorld);
	}
}