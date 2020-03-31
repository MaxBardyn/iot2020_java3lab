package ua.lviv.iot.clothesStore.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.clothesStore.model.AbstractClothes;

class ClothesManagerTest extends BaseClothesManager {

  public ClothesManager clothesManager;

  @BeforeEach
  public void setUp() {
    clothesManager = new ClothesManager();
    clothesManager.addClothes(avaialableClothes);
  }

  @Test
  public void testFindClothesForCeremonialReception() {
    List<AbstractClothes> suitableClothes = clothesManager.findClothesForCeremonialReception();
    assertEquals(5, suitableClothes.size());
  }

}