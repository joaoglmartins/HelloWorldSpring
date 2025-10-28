package joaoglmartins.helloworld.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
	
	public HelloWorldService() {}
	
	public String sayHelloWorld(String message) {
		return "Hello " + message + "!";
	}
	
	public String helloWorldPage() {
		return "index";
	}
	
}
