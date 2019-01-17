package spring.lang;

import org.springframework.stereotype.Component;

@Component("vn")
public class Vietnamese implements Language {

	public String getGreeting() {
		return "Xin chao";
	}

	public String getBye() {
		return "Tam biet";
	}

}
