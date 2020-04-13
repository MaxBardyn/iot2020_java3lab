package ua.lviv.iot.clothesStore.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "\"stores\"")
public class Store {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Integer id;
  private String name;

  @OneToMany(mappedBy = "store", fetch = FetchType.EAGER)
  @JsonIgnoreProperties("store")
  private Set<Dress> dresses;

  public Store() {

  }

  public Store(Integer id, String name, Set<Dress> dresses) {
    super();
    this.id = id;
    this.name = name;
    this.dresses = dresses;
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
