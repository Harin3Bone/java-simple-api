package com.tutorial.menu.service;

import com.tutorial.menu.entity.MenuEntity;
import com.tutorial.menu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<MenuEntity> getMenus() {
        return menuRepository.findAll();
    }
}
