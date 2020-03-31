package ua.lviv.iot.clothesStore.model;

public class Jeans extends AbstractClothes {

  private TypeOfJeans typeOfJeans;

  public TypeOfJeans getTypeOfJeans() {
    return typeOfJeans;
  }

  public void setTypeOfJeans(TypeOfJeans typeOfJeans) {
    this.typeOfJeans = typeOfJeans;
  }

  public Jeans(String brandName, String color, String countryOfManufacturer, Gender gender, Seasons season,
      double priceInUAH, int size, boolean suitableForCeremonialReception, TypeOfJeans typeOfJeans) {
    super(brandName, color, countryOfManufacturer, gender, season, priceInUAH, size, suitableForCeremonialReception);
    this.typeOfJeans = typeOfJeans;
  }

  @Override
  public String toString() {
    return "Jeans [typeOfJeans=" + typeOfJeans + super.toString();
  }

  public String getHeaders() {
    return super.getHeaders() + ", typeOfJeans";
  }

  public String toCSV() {
    return super.toCSV() + ", " + typeOfJeans;
  }

}