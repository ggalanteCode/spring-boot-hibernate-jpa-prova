package com.ggalantecode.springboothibernatejpaprova;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProvaPrimaryKeyGenRepository extends JpaRepository<ProvaPrimaryKeyGenEntity, UUID> {
}
