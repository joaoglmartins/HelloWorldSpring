package joaoglmartins.helloworld.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import joaoglmartins.helloworld.model.Resource;
import joaoglmartins.helloworld.service.ResourceService;

@RestController
@RequestMapping("/api/resources")
public class ResourceController {

    private final ResourceService service;

    public ResourceController(ResourceService service) {
        this.service = service;
    }

    @GetMapping
    public List<Resource> get(@RequestParam(required = false) String id) {
    	if (id == null) return service.findAll();
    	
    	Resource resource = service.findById(id);
    	
    	if (resource == null) return Collections.emptyList();
    	
    	return Collections.singletonList(resource);
    }
    
    @PostMapping
    public Resource post(@RequestBody Resource resource) {
        return service.create(resource);
    }
}
