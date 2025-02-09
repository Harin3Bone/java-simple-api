package com.tutorial.menu.controller;

import com.tutorial.menu.entity.Menu;
import com.tutorial.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<Menu> getAllMenu() {
        return menuService.getAllMenu();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Menu getMenuById(@PathVariable String id) {
        return menuService.getMenuById(id);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Menu createMenu(@RequestBody Menu menu) {
        return menuService.createMenu(menu);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Menu updateMenuById(@PathVariable String id, @RequestBody Menu menu) {
        return menuService.updateMenuById(id, menu);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMenuById(@PathVariable String id) {
        menuService.deleteMenuById(id);
    }
}
