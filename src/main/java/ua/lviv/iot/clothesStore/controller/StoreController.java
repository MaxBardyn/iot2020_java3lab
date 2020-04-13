package ua.lviv.iot.clothesStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.clothesStore.business.StoreService;
import ua.lviv.iot.clothesStore.model.Store;

@RequestMapping("/stores")
@RestController
public class StoreController {

  @Autowired
  private StoreService storeService;

  @GetMapping
  public List<Store> getAllStores() {
    return storeService.findAllStores();
  }

  @GetMapping(path = "/{id}")
  public Store findStoreById(final @PathVariable("id") Integer storeId) {
    return storeService.findStoreById(storeId);
  }

  @DeleteMapping(path = "/{id}")
  public void deleteStoreById(final @PathVariable("id") Integer storeId) {
    storeService.deleteStoreBuId(storeId);
  }
}
