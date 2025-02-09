package com.tutorial.menu.controller;

import com.tutorial.menu.entity.MenuEntity;
import com.tutorial.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("")
    public ResponseEntity<List<MenuEntity>> getMenus() {
        return ResponseEntity.ok(menuService.getMenus());
    }
}
