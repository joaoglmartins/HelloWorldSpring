package joaoglmartins.helloworld.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import org.springframework.stereotype.Service;

import joaoglmartins.helloworld.model.Resource;
import joaoglmartins.helloworld.repository.ResourceRepository;

@Service
public class ResourceService {
	
	private final ResourceRepository repository;
	
	public ResourceService(ResourceRepository repository) {
		this.repository = repository;
	}
	
	public List<Resource> findAll() {
		return repository.findAll();
	}
	
	public Resource findById(String id) {
		try {
			return repository.findById(UUID.fromString(id)).get();			
		} catch (NoSuchElementException e) {
			return null;
		}
	}
	
	public Resource create(Resource resource) {
		return repository.save(resource);
	}
}
