package joaoglmartins.helloworld.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import org.springframework.stereotype.Service;

import joaoglmartins.helloworld.model.Resource;
import joaoglmartins.helloworld.repository.ResourceRepository;

@Service
public class ResourceService {
	
	private final ResourceRepository resourceRepository;
	
	public ResourceService(ResourceRepository resourceRepository) {
		this.resourceRepository = resourceRepository;
	}
	
	public List<Resource> findAll() {
		return resourceRepository.findAll();
	}
	
	public Resource findById(String id) {
		try {
			return resourceRepository.findById(UUID.fromString(id)).get();			
		} catch (NoSuchElementException e) {
			return null;
		}
	}
}
