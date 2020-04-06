package ua.lviv.iot.clothesStore.model;

import javax.persistence.Entity;

@Entity
public class Dress extends AbstractClothes {

  private double length;

  public Dress() {
    super();
  }

  public Dress(String brandName, String color, String countryOfManufacturer, Gender gender, Seasons season,
      double priceInUAH, int size, boolean suitableForCeremonialReception, double length) {
    super(brandName, color, countryOfManufacturer, gender, season, priceInUAH, size, suitableForCeremonialReception);
    this.length = length;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public String toString() {
    return "Dress [length=" + length + super.toString();
  }

  public String getHeaders() {
    return super.getHeaders() + ", length";
  }

  public String toCSV() {
    return super.toCSV() + ", " + length;
  }

}