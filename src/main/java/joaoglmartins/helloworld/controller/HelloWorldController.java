package joaoglmartins.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import joaoglmartins.helloworld.service.HelloWorldService;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
	private final HelloWorldService service;
	
	public HelloWorldController(HelloWorldService service) {
        this.service = service;
    }

	@GetMapping
	public String get(@RequestParam(defaultValue = "World") String q) {
		return service.sayHelloWorld(q);
	}

}
