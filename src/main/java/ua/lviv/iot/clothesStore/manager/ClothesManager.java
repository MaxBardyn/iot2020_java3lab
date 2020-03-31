package ua.lviv.iot.clothesStore.manager;

import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.clothesStore.model.AbstractClothes;

public class ClothesManager {

  private List<AbstractClothes> clothes = new LinkedList<AbstractClothes>();

  public void addClothes(List<AbstractClothes> clothes) {
    this.clothes.addAll(clothes);
  }

  public List<AbstractClothes> findClothesForCeremonialReception() {

    List<AbstractClothes> suitableClothes = new LinkedList<AbstractClothes>();
    for (AbstractClothes currentClothes : clothes) {
      if (currentClothes.isSuitableForCeremonialReception()) {
        suitableClothes.add(currentClothes);
      }
    }
    return suitableClothes;
  }
}