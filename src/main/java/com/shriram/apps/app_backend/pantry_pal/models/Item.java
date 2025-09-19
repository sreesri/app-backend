package com.shriram.apps.app_backend.pantry_pal.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.shriram.apps.app_backend.pantry_pal.enums.PantryStatus;

import lombok.Data;

@Document
@Data
public class Item {

    @Id
    private String id;
    private String name;
    private PantryStatus status;
    private int quantity;
    private LocalDate expirationDate;

}
