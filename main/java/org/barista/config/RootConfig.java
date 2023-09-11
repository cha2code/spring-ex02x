package org.barista.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

// root-context.xml에 해당하는 클래스

@Configuration
@ComponentScan(basePackages = {"org.barista.sample"})
@MapperScan(basePackages = {"org.barista.mapper"})
public class RootConfig {
	
	@Bean
	public  DataSource dataSource() {
		
		HikariConfig config = new HikariConfig();
		//config.setDriverClassName("com.mysql.cj.jdbc.Driver");
		//config.setJdbcUrl("jdbc:mysql://localhost:3306/glory_db");
		config.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		config.setJdbcUrl("jdbc:log4jdbc:mysql://localhost:3306/glory_db");
		config.setUsername("glory");
		config.setPassword("1234");
		
		HikariDataSource dataSource = new HikariDataSource(config);
		
		return dataSource;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		
		return (SqlSessionFactory) sqlSessionFactory.getObject();
	}

}

/*
@Configuration

- 설정 파일을 만들거나 bean을 등록하기 위한 어노테이션

- spring에서 CGLIB라는 바이트 조작 라이브러리를 사용, AppConfig를 상속 받은
	임의의 클래스를 생성 후, 그것을 spring bean으로 등록함

- 생성 된 임의의 클래스를 통해 싱글톤 유지
	(실제로 싱글톤을 사용하진 않으나 위의 이유로 싱글톤이 되게 함)
	
- 의존성 주입 설정 (생성자 주입, setter 주입)

 - @Configuration 어노테이션 아래에 @ComponentScan(basePackages="패키지 경로")를 사용하면
 	해당 패키지안에 있는 bean클래스의 어노테이션을 분석할 수 있도록 설정해줄 수 있다.
*/

/*
 @ComponentScan(basePackages = {""})
 
 - @Configuration이 붙은 bean 설정 클래스에 붙여서
 	스테레오 타입 어노테이션이 붙은 bean들을 자동으로 스캔해서 등록함
 	(여기서는 bean에 등록할 패키지 지정)
 	
 - 스테레오 타입 어노테이션 : bean으로 등록하기 위한 어노테이션
 	(이것을 이용해서 어떤 계층의 bean인지 지정 가능)
 
 -  해당 패키지와 하위 패키지에 대해서 @Component같은 스테레오 타입 어노테이션이 붙은 클래스를
 	모두 찾아서 bean으로 등록한다
*/

/*
Hikari

- Connection pooling을 제공하는 JDBC DataSource의 구현체
*/

/*
DataSource

- 물리적인 DB에 연결하기 위한 Factory
- 이름, 비밀번호, url을 사용해 DB에 연결
- DataManager를 사용하지 않고 DB 연결이 가능함
*/