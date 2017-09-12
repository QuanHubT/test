package com.mycompany.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * 위의 LoggerFactory부분은 로그를남기기위한 부분
	 * Simply selects the home view to render by returning its name.
	 * URL:http://localhost:8081/myapp/WEB-INF/views/home.jsp
	 * 프로토콜:http
	 * 도메인주소:localhost
	 * 사용포트:8010
	 * 사용서비스:myapp
	 * URI:/WEB-INF/views/home.jsp
	 * 
	 * @RequestMapping은 URI를 찾는것이다.
	 * 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		//home은 접속할 페이지의 이름(확장자 제외)
		return "home";
	}
	@RequestMapping(value = "/move")
    public String move() {
	//접속할 페이지의 이름( 확장자 제외)
		return "move";
	}
	@RequestMapping(value = "/loginProc")
    public String login() {
	//접속할 페이지의 이름( 확장자 제외)
		return "loginForm";
	}

} 
