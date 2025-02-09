package com.tutorial.menu.service;

import com.tutorial.menu.entity.Menu;
import com.tutorial.menu.exception.InvalidException;
import com.tutorial.menu.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository menuRepository;

    public List<Menu> getAllMenu() {
        return menuRepository.findAll();
    }

    public Menu getMenuById(String id) {
        return menuRepository.findById(UUID.fromString(id))
                .orElseThrow(()-> new InvalidException("Menu not found"));
    }

    public Menu createMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    public Menu updateMenuById(String id, Menu menuEntity) {
        var menu = getMenuById(id);
        menu.setName(menuEntity.getName());
        menu.setPrice(menuEntity.getPrice());
        menu.setCategory(menuEntity.getCategory());
        return menuRepository.save(menuEntity);
    }

    public Menu deleteMenuById(String id) {
        var menu = getMenuById(id);
        menuRepository.deleteById(menu.getId());
        return menu;
    }
}
