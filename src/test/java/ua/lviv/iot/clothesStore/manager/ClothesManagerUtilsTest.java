package ua.lviv.iot.clothesStore.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.clothesStore.model.SortType;

public class ClothesManagerUtilsTest extends BaseClothesManager {

  @Test
  public void testSortClothesByBrandsAscending() {
    ClothesManagerUtils.sortClothesByBrands(avaialableClothes, SortType.ASC);
    assertEquals("Dior", avaialableClothes.get(0).getBrandName());
    assertEquals("Hugo Boss", avaialableClothes.get(1).getBrandName());
    assertEquals("Levis", avaialableClothes.get(2).getBrandName());
    assertEquals("Louis Vuitton", avaialableClothes.get(3).getBrandName());
    assertEquals("Massimo Dutti", avaialableClothes.get(4).getBrandName());
    assertEquals("Ralph  Lauren", avaialableClothes.get(5).getBrandName());
    assertEquals("Versace", avaialableClothes.get(6).getBrandName());
    assertEquals("Zara", avaialableClothes.get(7).getBrandName());
  }

  @Test
  public void testSortClothesByBrandsDescending() {
    ClothesManagerUtils.sortClothesByBrands(avaialableClothes, SortType.DESC);
    assertEquals("Dior", avaialableClothes.get(7).getBrandName());
    assertEquals("Hugo Boss", avaialableClothes.get(6).getBrandName());
    assertEquals("Levis", avaialableClothes.get(5).getBrandName());
    assertEquals("Louis Vuitton", avaialableClothes.get(4).getBrandName());
    assertEquals("Massimo Dutti", avaialableClothes.get(3).getBrandName());
    assertEquals("Ralph  Lauren", avaialableClothes.get(2).getBrandName());
    assertEquals("Versace", avaialableClothes.get(1).getBrandName());
    assertEquals("Zara", avaialableClothes.get(0).getBrandName());
  }

  @Test
  public void testSortClothesByPriceAscending() {
    ClothesManagerUtils.sortClothesByPriceInUAH(avaialableClothes, SortType.ASC);
    assertEquals(1149.99, avaialableClothes.get(0).getPriceInUAH());
    assertEquals(1699.0, avaialableClothes.get(1).getPriceInUAH());
    assertEquals(1999.99, avaialableClothes.get(2).getPriceInUAH());
    assertEquals(2499.99, avaialableClothes.get(3).getPriceInUAH());
    assertEquals(17000.0, avaialableClothes.get(4).getPriceInUAH());
    assertEquals(179000.0, avaialableClothes.get(5).getPriceInUAH());
    assertEquals(230000.0, avaialableClothes.get(6).getPriceInUAH());
    assertEquals(250000.0, avaialableClothes.get(7).getPriceInUAH());
  }

  @Test
  public void testSortClothesByPriceDescending() {
    ClothesManagerUtils.sortClothesByPriceInUAH(avaialableClothes, SortType.DESC);
    assertEquals(1149.99, avaialableClothes.get(7).getPriceInUAH());
    assertEquals(1699.0, avaialableClothes.get(6).getPriceInUAH());
    assertEquals(1999.99, avaialableClothes.get(5).getPriceInUAH());
    assertEquals(2499.99, avaialableClothes.get(4).getPriceInUAH());
    assertEquals(17000.0, avaialableClothes.get(3).getPriceInUAH());
    assertEquals(179000.0, avaialableClothes.get(2).getPriceInUAH());
    assertEquals(230000.0, avaialableClothes.get(1).getPriceInUAH());
    assertEquals(250000.0, avaialableClothes.get(0).getPriceInUAH());
  }

  @Test
  public void testSortClothesBySizeAscending() {
    ClothesManagerUtils.sortClothesBySize(avaialableClothes, SortType.ASC);
    assertEquals(32, avaialableClothes.get(0).getSize());
    assertEquals(34, avaialableClothes.get(1).getSize());
    assertEquals(36, avaialableClothes.get(2).getSize());
    assertEquals(36, avaialableClothes.get(3).getSize());
    assertEquals(38, avaialableClothes.get(4).getSize());
    assertEquals(40, avaialableClothes.get(5).getSize());
    assertEquals(40, avaialableClothes.get(6).getSize());
    assertEquals(42, avaialableClothes.get(7).getSize());

  }

  @Test
  public void testSortClothesBySizeDescending() {
    ClothesManagerUtils.sortClothesBySize(avaialableClothes, SortType.DESC);
    assertEquals(32, avaialableClothes.get(7).getSize());
    assertEquals(34, avaialableClothes.get(6).getSize());
    assertEquals(36, avaialableClothes.get(5).getSize());
    assertEquals(36, avaialableClothes.get(4).getSize());
    assertEquals(38, avaialableClothes.get(3).getSize());
    assertEquals(40, avaialableClothes.get(2).getSize());
    assertEquals(40, avaialableClothes.get(1).getSize());
    assertEquals(42, avaialableClothes.get(0).getSize());

  }

  @Test
  public void testSortClothesByColorAscending() {
    ClothesManagerUtils.sortClothesByColor(avaialableClothes, SortType.ASC);
    assertEquals("black", avaialableClothes.get(0).getColor());
    assertEquals("black", avaialableClothes.get(1).getColor());
    assertEquals("blue", avaialableClothes.get(2).getColor());
    assertEquals("blue", avaialableClothes.get(3).getColor());
    assertEquals("gray", avaialableClothes.get(4).getColor());
    assertEquals("white", avaialableClothes.get(5).getColor());
    assertEquals("white", avaialableClothes.get(6).getColor());
    assertEquals("yellow", avaialableClothes.get(7).getColor());

  }

  @Test
  public void testSortClothesByColorDescending() {
    ClothesManagerUtils.sortClothesByColor(avaialableClothes, SortType.DESC);
    assertEquals("black", avaialableClothes.get(7).getColor());
    assertEquals("black", avaialableClothes.get(6).getColor());
    assertEquals("blue", avaialableClothes.get(5).getColor());
    assertEquals("blue", avaialableClothes.get(4).getColor());
    assertEquals("gray", avaialableClothes.get(3).getColor());
    assertEquals("white", avaialableClothes.get(2).getColor());
    assertEquals("white", avaialableClothes.get(1).getColor());
    assertEquals("yellow", avaialableClothes.get(0).getColor());

  }
}