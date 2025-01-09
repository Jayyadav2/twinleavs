package com.twinleavs.twinleavs.service;

import com.twinleavs.twinleavs.entity.Batch;
import com.twinleavs.twinleavs.entity.Gtin;
import com.twinleavs.twinleavs.repository.BatchRepository;
import com.twinleavs.twinleavs.repository.GtinRespository;
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

    public List<Gtin> getGtinsWithPositiveBatches() {
        return batchRepository.findPositiveQuantityBatches()
                .stream()
                .map(Batch::getGtin)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Batch> getLatestNegativeOrZeroQuantityBatches() {
        return batchRepository.findNegativeOrZeroQuantityBatches(PageRequest.of(0, 1));
    }
}

