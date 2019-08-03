package com.zjuwepension.application.repository;

import com.zjuwepension.application.entity.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FurnitureRepository extends JpaRepository<Furniture, Long> {
    List<Furniture> findFurnituresByFurnId(Long id);
}
