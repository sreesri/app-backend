package com.shriram.apps.app_backend.pantry_pal.service;

import com.shriram.apps.app_backend.pantry_pal.models.Item;
import com.shriram.apps.app_backend.pantry_pal.enums.PantryStatus;
import java.util.List;

public interface ItemService {
    List<Item> getAllItems();
    Item createItem(Item item);
    Item updateItemStatus(String id, PantryStatus status);
    void deleteItem(String id);
}
