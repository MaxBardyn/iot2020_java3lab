package ua.lviv.iot.clothesStore.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.clothesStore.dataaccess.BuyersRepository;
import ua.lviv.iot.clothesStore.model.Buyer;

@Service
public class BuyerService {

  @Autowired
  private BuyersRepository buyerRepository;

  public Buyer createBuyer(Buyer buyer) {
    return buyerRepository.save(buyer);
  }

  public List<Buyer> findAll() {
    return buyerRepository.findAll();
  }

}