package com.shriram.apps.app_backend.pantry_pal.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.shriram.apps.app_backend.pantry_pal.models.Item;
import com.shriram.apps.app_backend.pantry_pal.enums.PantryStatus;
import com.shriram.apps.app_backend.pantry_pal.service.ItemService;

@RestController
@RequestMapping("/pantry-pal")
public class PantryController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @PostMapping("/items")
    public Item createItem(@RequestBody Item item) {
        return itemService.createItem(item);
    }

    @PatchMapping("/items/{id}/status")
    public Item updateItemStatus(@PathVariable String id, @RequestParam PantryStatus status) {
        return itemService.updateItemStatus(id, status);
    }

    @DeleteMapping("/items/{id}")
    public void deleteItem(@PathVariable String id) {
        itemService.deleteItem(id);
    }

}
