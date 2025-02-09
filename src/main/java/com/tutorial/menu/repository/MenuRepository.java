package com.tutorial.menu.repository;

import com.tutorial.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface MenuRepository extends JpaRepository<Menu, UUID> {

    Optional<Menu> findByName(String name);
    List<Menu> findByCategory(String category);
}
