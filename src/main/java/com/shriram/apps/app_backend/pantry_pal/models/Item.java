package com.shriram.apps.app_backend.pantry_pal.models;

import org.springframework.data.mongodb.core.mapping.Document;

import com.shriram.apps.app_backend.pantry_pal.enums.PantryStatus;

import lombok.Data;

@Document
@Data
public class Item {

    private String id;
    private String name;
    private PantryStatus status;
    private int quantity;
    private String expirationDate;

}
