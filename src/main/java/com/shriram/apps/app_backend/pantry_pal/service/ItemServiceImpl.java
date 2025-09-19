package com.shriram.apps.app_backend.pantry_pal.service;

import com.shriram.apps.app_backend.pantry_pal.models.Item;
import com.shriram.apps.app_backend.pantry_pal.enums.PantryStatus;
import com.shriram.apps.app_backend.pantry_pal.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item createItem(Item item) {
        item.setId(UUID.randomUUID().toString());
        return itemRepository.save(item);
    }

    @Override
    public Item updateItemStatus(String id, PantryStatus status) {
        Optional<Item> optionalItem = itemRepository.findById(id);
        if (optionalItem.isPresent()) {
            Item item = optionalItem.get();
            item.setStatus(status);
            return itemRepository.save(item);
        }
        return null;
    }

    @Override
    public void deleteItem(String id) {
        itemRepository.deleteById(id);
    }
}
