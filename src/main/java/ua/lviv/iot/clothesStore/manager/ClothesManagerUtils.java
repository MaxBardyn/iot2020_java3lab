package ua.lviv.iot.clothesStore.manager;

import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.clothesStore.model.AbstractClothes;
import ua.lviv.iot.clothesStore.model.SortType;

public class ClothesManagerUtils {

  public static void sortClothesByBrands(List<AbstractClothes> clothes, SortType sortType) {
    clothes.sort(sortType == SortType.ASC ? new SortClothesByBrands() : new SortClothesByBrands().reversed());
  }

  public static void sortClothesByPriceInUAH(List<AbstractClothes> clothes, SortType sortType) {
    ClothesManagerUtils sorter = new ClothesManagerUtils();
    clothes.sort(sortType == SortType.ASC ? sorter.new SortClothesByPriceInUAH()
        : sorter.new SortClothesByPriceInUAH().reversed());
  }

  public static void sortClothesBySize(List<AbstractClothes> clothes, SortType sortType) {
    Comparator<AbstractClothes> comparator = new Comparator<AbstractClothes>() {

      @Override
      public int compare(AbstractClothes firstClothes, AbstractClothes secondClothes) {
        return firstClothes.getSize() - secondClothes.getSize();
      }
    };
    clothes.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
  }

  public static void sortClothesByColor(List<AbstractClothes> clothes, SortType sortType) {
    Comparator<AbstractClothes> comparator = (firstClothes, secondClothes) -> firstClothes.getColor()
        .compareTo(secondClothes.getColor());
    clothes.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
  }

  static class SortClothesByBrands implements Comparator<AbstractClothes> {

    @Override
    public int compare(AbstractClothes firstClothes, AbstractClothes secondClothes) {
      return firstClothes.getBrandName().compareTo(secondClothes.getBrandName());
    }

  }

  class SortClothesByPriceInUAH implements Comparator<AbstractClothes> {

    @Override
    public int compare(AbstractClothes fitstClothes, AbstractClothes secondClothes) {
      return (int) (fitstClothes.getPriceInUAH() - secondClothes.getPriceInUAH());
    }
  }
}
