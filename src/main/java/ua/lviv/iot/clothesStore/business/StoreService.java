package ua.lviv.iot.clothesStore.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.clothesStore.dataaccess.StoreRepository;
import ua.lviv.iot.clothesStore.model.Store;

@Service
public class StoreService {

  @Autowired
  private StoreRepository storeRepository;

  public List<Store> findAllStores() {
    return storeRepository.findAll();
  }

  public Store findStoreById(Integer storeId) {
    return storeRepository.findById(storeId).get();
  }

  public void deleteStoreBuId(Integer storeId) {
    storeRepository.deleteById(storeId);
  }
}
