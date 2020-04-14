package ua.lviv.iot.clothesStore.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.clothesStore.dataaccess.DressRepository;
import ua.lviv.iot.clothesStore.model.Dress;

@Service
public class DressService {

  @Autowired
  private DressRepository dressRepository;

  public Dress getDress(Integer dressId) {
    return dressRepository.findById(dressId).get();
  }

  public List<Dress> getAllDresses() {
    return dressRepository.findAll();
  }

  public Dress createDress(Dress dress) {
    return dressRepository.save(dress);
  }

  public void deleteDress(Integer dressId) {
    dressRepository.deleteById(dressId);
  }

  public Dress updateDress(Integer dressId, Dress dress) {
    if (dressRepository.existsById(dressId)) {
      return dressRepository.save(dress);
    } else {
      return null;
    }
  }

}
