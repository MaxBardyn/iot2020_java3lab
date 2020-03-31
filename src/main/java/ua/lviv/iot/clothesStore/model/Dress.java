package ua.lviv.iot.clothesStore.model;

public class Dress extends AbstractClothes {

  private double length;

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public Dress(String brandName, String color, String countryOfManufacturer, Gender gender, Seasons season,
      double priceInUAH, int size, boolean suitableForCeremonialReception, double length) {
    super(brandName, color, countryOfManufacturer, gender, season, priceInUAH, size,
        suitableForCeremonialReception);
    this.length = length;
  }

}