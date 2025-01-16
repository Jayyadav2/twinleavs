package com.twinleavs.twinleavs.service;

import com.twinleavs.twinleavs.entity.Batch;
import com.twinleavs.twinleavs.entity.Gtin;
import com.twinleavs.twinleavs.repository.BatchRepository;
import com.twinleavs.twinleavs.repository.GtinRespository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;


@Service
public class GtinService {

    @Autowired
    private GtinRespository gtinRepository;

    @Autowired
    private BatchRepository batchRepository;

    public Gtin getGtinDetails(String gtin) {
        return gtinRepository.findByGtin(gtin);
    }

    public List<Batch> getBatchesWithPositiveQuantity() {
        return batchRepository.findBatchesWithPositiveQuantity();
    }

    public List<Batch> getLatestBatchesWithNegativeOrZeroQuantity() {
        return batchRepository.findLatestBatchesWithNegativeOrZeroQuantity()
                .stream()
                .limit(1)
                .collect(Collectors.toList());
    }

    @Transactional
    public void saveAll(List<Gtin> gtins) {
        for (Gtin gtin : gtins) {
            // Ensure proper cascading for batches and product
            if (gtin.getBatches() != null) {
                for (Batch batch : gtin.getBatches()) {
                    batch.setGtin(gtin);  // Set the Gtin object, not a String
                }
            }
            gtinRepository.save(gtin);
        }
    }
}

