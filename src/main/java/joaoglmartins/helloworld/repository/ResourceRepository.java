package joaoglmartins.helloworld.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import joaoglmartins.helloworld.model.Resource;

public interface ResourceRepository extends JpaRepository<Resource, UUID> {
}