package com.example.productservice.repository;

import com.example.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

/**
 * @author Dian Bhagaskoro
 * @created 27/05/2023-13:50
 */
@Repository("ProductRepository")
public interface ProductRepository extends JpaRepository<Product, BigInteger> {
}
