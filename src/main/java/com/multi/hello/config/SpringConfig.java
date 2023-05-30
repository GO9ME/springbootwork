package com.multi.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.multi.hello.dao.BoardDAO;
import com.multi.hello.service.BoardService;

//설정 정보를 담고있는 자바객체로 인식시키기 위해서 
@Configuration
public class SpringConfig {
	// BoardService객체를 만드는 경우 BoardDAO가 주입되도록 매개변수 있는 생성자를 호출해서 작업
	@Bean
	public BoardService boardservice() {
		return new BoardService(boardDAO());
	}

	// 메소드를 정의해서 빈을 생성해서 리턴하도록 설정
	@Bean
	public BoardDAO boardDAO() {
		return new BoardDAO();
	}
}
