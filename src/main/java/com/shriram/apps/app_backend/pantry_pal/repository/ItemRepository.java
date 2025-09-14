package com.shriram.apps.app_backend.pantry_pal.repository;

import com.shriram.apps.app_backend.pantry_pal.models.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {
}
