package ua.lviv.iot.clothesStore.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.clothesStore.business.DressService;
import ua.lviv.iot.clothesStore.model.Dress;

@RequestMapping("/dresses")
@RestController
public class DressController {

  private AtomicInteger idCounter = new AtomicInteger();
  @Autowired
  private DressService dressService;

  @GetMapping
  public List<Dress> getAllDresses() {
    return dressService.getAllDresses();
  }

  @GetMapping(path = "/{id}")
  public Dress getDress(final @PathVariable("id") Integer dressId) {
    return dressService.getDress(dressId);
  }

  @PostMapping
  public Dress createDress(final @RequestBody Dress dress) {
    dress.setId(idCounter.incrementAndGet());
    return dressService.createDress(dress);
  }

  @DeleteMapping(path = "/{id}")
  public void deleteDress(@PathVariable("id") Integer dressId) {
    dressService.deleteDress(dressId);
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Dress> updateDress(@PathVariable("id") Integer dressId, final @RequestBody Dress dress) {
    return dressService.updateDress(dressId, dress);
  }
}
