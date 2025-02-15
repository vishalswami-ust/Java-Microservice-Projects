package com.iiht.iocday2;
import org.springframework.context.ApplicationContext;
import java.util.logging.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger l = Logger.getLogger("TestShapes");
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
		
		//BeanFactory factory = new FileSystemXmlApplicationContext("beans.xml");
		Shape s = (Rectangle) factory.getBean("rect");
		//System.out.println(s.area());
		l.info(s.area() +"");
		
		Shape s1 = (Triangle) factory.getBean("Tria");
		//System.out.println(s1.area());
		l.info(s1.area() + "");
		
		Shape s2 = (Rhombus) factory.getBean("Rhom");
		//System.out.println(s2.area());
		l.info(s2.area() + "");
	}

}
