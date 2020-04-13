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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Buyer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String name;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "Dresses_Buyers", joinColumns = {
      @JoinColumn(name = "buyer_id", nullable = false) }, inverseJoinColumns = {
          @JoinColumn(name = "dress_id", nullable = false) })
  @JsonIgnoreProperties("buyers")
  private Set<Dress> dresses;

  public Buyer() {

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Dress> getDresses() {
    return dresses;
  }

  public void setDresses(Set<Dress> dresses) {
    this.dresses = dresses;
  }
}
