package com.twinleavs.twinleavs.controller;

import com.twinleavs.twinleavs.entity.Batch;
import com.twinleavs.twinleavs.entity.Gtin;
import com.twinleavs.twinleavs.service.GtinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class GtinController {

    @Autowired
    private GtinService gtinService;

    @GetMapping("/positive-batches")
    public ResponseEntity<List<Gtin>> getGtinsWithPositiveBatches() {
        return ResponseEntity.ok(gtinService.getGtinsWithPositiveBatches());
    }

    @GetMapping("/negative-or-zero-batches")
    public ResponseEntity<List<Batch>> getLatestNegativeOrZeroBatches() {
        return ResponseEntity.ok(gtinService.getLatestNegativeOrZeroQuantityBatches());
    }
}
