package com.twinleavs.twinleavs.repository;

import com.twinleavs.twinleavs.entity.Batch;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BatchRepository extends JpaRepository<Batch, Long> {
    @Query("SELECT b FROM Batch b WHERE b.availableQuantity > 0")
    List<Batch> findPositiveQuantityBatches();

    @Query("SELECT b FROM Batch b WHERE b.availableQuantity <= 0 ORDER BY b.inwardedOn DESC")
    List<Batch> findNegativeOrZeroQuantityBatches(SpringDataWebProperties.Pageable pageable);
}
}
