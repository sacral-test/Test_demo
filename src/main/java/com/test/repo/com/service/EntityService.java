
package com.test.repo.com.service;

import com.test.repo.com.model.Entity;
import com.test.repo.com.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService {

    private final EntityRepository entityRepository;

    @Autowired
    public EntityService(EntityRepository entityRepository) {
        this.entityRepository = entityRepository;
    }

    public Entity saveEntity(Entity entity) {
        return entityRepository.save(entity);
    }

    public Entity getEntityById(Long id) {
        return entityRepository.findById(id).orElse(null);
    }

    public List<Entity> getAllEntities() {
        return entityRepository.findAll();
    }

    public void deleteEntity(Long id) {
        entityRepository.deleteById(id);
    }

    // Add more business methods as needed

}
