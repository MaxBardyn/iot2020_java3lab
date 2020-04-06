package ua.lviv.iot.clothesStore.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.clothesStore.model.Dress;

@RequestMapping("/dresses")
@RestController
public class DressController {

  private Map<Integer, Dress> dresses = new HashMap<Integer, Dress>();
  private AtomicInteger idCounter = new AtomicInteger();

  @GetMapping
  public List<Dress> getDresses() {
    return new LinkedList<Dress>(dresses.values());
  }

  @GetMapping(path = "/{id}")
  public Dress getDress(final @PathVariable("id") Integer dressId) {
    return dresses.get(dressId);
  }

  @PostMapping
  public Dress createDress(final @RequestBody Dress dress) {
    dress.setId(idCounter.incrementAndGet());
    dresses.put(dress.getId(), dress);
    return dress;
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Dress> deleteDress(@PathVariable("id") Integer dressId) {
    HttpStatus status = dresses.remove(dressId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
    return ResponseEntity.status(status).build();
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Dress> updateDress(@PathVariable("id") Integer dressId, final @RequestBody Dress dress) {
    dress.setId(dressId);
    Dress previousValue = dresses.get(dressId);
    if (dresses.containsKey(dressId)) {
      dresses.replace(dressId, dress);
      return new ResponseEntity<Dress>(previousValue, HttpStatus.OK);
    } else {
      return new ResponseEntity<Dress>(HttpStatus.NOT_FOUND);
    }
  }
}
