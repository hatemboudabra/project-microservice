package com.example.inventory_service.controller;

import com.example.inventory_service.dto.InventoryResponse;
import com.example.inventory_service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;
    // http://localhost:8082/api/inventory/iphone12,iphone13
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInstock(@RequestParam List<String> skuCode){

        return inventoryService.isInStock(skuCode);
    }
}
