package com.store;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStore {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		ChocoLinkedList e1 =  (ChocoLinkedList) c.getBean("chocolinkedlist");
		
		System.out.println(e1.getChocolinkedlist());
	}
}
