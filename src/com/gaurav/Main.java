package com.gaurav;

import java.lang.annotation.Annotation;

@MyAnnotation(a = 10, b = 20)
public class Main {
	public static void main(String[] args) {
		Class<Main> myClass = Main.class;
		Annotation[] annotations = myClass.getAnnotations();
		
		for(Annotation annotation: annotations) {
			if(annotation instanceof MyAnnotation) {
				MyAnnotation myAnnotation = (MyAnnotation) annotation;
				int sum = myAnnotation.a() + myAnnotation.b();
				
				System.out.println("The value of sum is " + sum);
			}
		}
	}
}
