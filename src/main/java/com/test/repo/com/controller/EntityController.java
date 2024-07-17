
package com.test.repo.com.controller;

import com.test.repo.com.model.Entity;
import com.test.repo.com.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entities")
public class EntityController {

    private final EntityService entityService;

    @Autowired
    public EntityController(EntityService entityService) {
        this.entityService = entityService;
    }

    @PostMapping
    public Entity saveEntity(@RequestBody Entity entity) {
        return entityService.saveEntity(entity);
    }

    @GetMapping("/{id}")
    public Entity getEntityById(@PathVariable Long id) {
        return entityService.getEntityById(id);
    }

    @GetMapping
    public List<Entity> getAllEntities() {
        return entityService.getAllEntities();
    }

    @DeleteMapping("/{id}")
    public void deleteEntity(@PathVariable Long id) {
        entityService.deleteEntity(id);
    }

    // Add more API endpoints as needed

}
