package ua.lviv.iot.clothesStore.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Dress extends AbstractClothes {
  private double length;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  protected Integer id;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "store_id")
  @JsonIgnoreProperties("dresses")
  private Store store;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "Dresses_Buyers", joinColumns = {
      @JoinColumn(name = "dress_id", nullable = false) }, inverseJoinColumns = {
          @JoinColumn(name = "buyer_id", nullable = true) })
  @JsonIgnoreProperties("dresses")
  private Set<Buyer> buyers;

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

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Store getStore() {
    return store;
  }

  public void setStore(Store store) {
    this.store = store;
  }

  public Set<Buyer> getBuyers() {
    return buyers;
  }

  public void setBuyers(Set<Buyer> buyers) {
    this.buyers = buyers;
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