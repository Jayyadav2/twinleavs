package com.twinleavs.twinleavs.repository;

import com.twinleavs.twinleavs.entity.Gtin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GtinRespository extends JpaRepository<Gtin, Long> {

    List<Gtin> findByGtin(String gtin);
}
