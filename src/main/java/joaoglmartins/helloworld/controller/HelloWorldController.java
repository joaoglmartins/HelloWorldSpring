package joaoglmartins.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import joaoglmartins.helloworld.service.HelloWorldService;

@Controller
public class HelloWorldController {
	private final HelloWorldService service;
	
	public HelloWorldController(HelloWorldService service) {
        this.service = service;
    }

//	@GetMapping
//	public String get(@RequestParam(defaultValue = "World") String q) {
//		return service.sayHelloWorld(q);
//	}
	
	@GetMapping("/index")
	public String get(Model model) {
		return "index";
	}
	
	

}
