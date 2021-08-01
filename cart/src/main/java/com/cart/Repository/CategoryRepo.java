package com.cart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cart.model.Category;

public interface CategoryRepo  extends JpaRepository<Category, Long> {

}
