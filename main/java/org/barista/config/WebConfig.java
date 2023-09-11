package org.barista.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// root-context.xml 을 대신하는 클래스 생성
		return new Class[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return null;
	}

}

/*
AbstractAnnotationConfigDispatcherServletInitializer

 - root application context와 servlet application context를 지정하고 올리는 방식이
 	복잡하게 구성되어 있어 사용하기 어려운 단점을 보완함
 
 - 해당 기능이 이미 구현 된 클래스를 상속 받아 보다 쉽게 적용이 가능함
 
 - spring xml 설정을 java class로 하는 방법

*/