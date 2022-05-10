package pizzalab.rest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pizzalab.PantryService;
import pizzalab.domain.Menu;

@RestController
class MenuController {
  PantryService pantryService;

  @GetMapping("/menu")
  public Menu getMenu() {
    return pantryService.listMenu();
  }
}

