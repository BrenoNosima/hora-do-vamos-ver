package com.bn.milagre.repositories;

import com.bn.milagre.models.MilagreModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilagreRepository extends JpaRepository<MilagreModel, Long> {
}
