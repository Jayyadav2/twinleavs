package com.twinleavs.twinleavs.controller;

import com.twinleavs.twinleavs.entity.Batch;
import com.twinleavs.twinleavs.entity.Gtin;
import com.twinleavs.twinleavs.service.GtinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GtinController {
    @Autowired
    private GtinService gtinService;

    @PostMapping("/initialize")
    public ResponseEntity<String> initializeData(@RequestBody List<Gtin> gtins) {
        // Persist data in the database
        gtinService.saveAll(gtins);
        return ResponseEntity.ok("Data initialized successfully.");
    }

    @GetMapping("/gtin/{gtin}")
    public ResponseEntity<Gtin> getGtinDetails(@PathVariable String gtin) {
        return ResponseEntity.ok(gtinService.getGtinDetails(gtin));
    }

    @GetMapping("/batches/positive")
    public ResponseEntity<List<Batch>> getBatchesWithPositiveQuantity() {
        return ResponseEntity.ok(gtinService.getBatchesWithPositiveQuantity());
    }

    @GetMapping("/batches/latest-negative-or-zero")
    public ResponseEntity<List<Batch>> getLatestBatchesWithNegativeOrZeroQuantity() {
        return ResponseEntity.ok(gtinService.getLatestBatchesWithNegativeOrZeroQuantity());
    }
}
