package ua.lviv.iot.clothesStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.clothesStore.business.BuyerService;
import ua.lviv.iot.clothesStore.model.Buyer;

@RequestMapping("/buyers")
@RestController
public class BuyerController {

  @Autowired
  private BuyerService buyerService;

  @GetMapping
  public List<Buyer> getAllSubjects() {
    return buyerService.findAll();
  }

  @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
  public Buyer createBuyer(@RequestBody Buyer buyer) {
    buyerService.createBuyer(buyer);
    return buyer;
  }

}