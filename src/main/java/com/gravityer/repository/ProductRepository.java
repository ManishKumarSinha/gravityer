package com.gravityer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Interface extending JpaRepository
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
 }