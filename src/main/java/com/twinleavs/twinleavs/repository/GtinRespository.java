package com.twinleavs.twinleavs.repository;

import com.twinleavs.twinleavs.entity.Gtin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GtinRespository extends JpaRepository<Gtin, Long> {

    @Query("SELECT g FROM Gtin g JOIN FETCH g.batches WHERE g.gtin = :gtin")
    Gtin findByGtin(@Param("gtin") String gtin);
}
