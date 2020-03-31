package ua.lviv.iot.clothesStore.manager;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.clothesStore.model.AbstractClothes;
import ua.lviv.iot.clothesStore.model.Dress;
import ua.lviv.iot.clothesStore.model.Gender;
import ua.lviv.iot.clothesStore.model.Jeans;
import ua.lviv.iot.clothesStore.model.Seasons;
import ua.lviv.iot.clothesStore.model.Shirt;
import ua.lviv.iot.clothesStore.model.TypeOfJeans;

public abstract class BaseClothesManager {

  protected List<AbstractClothes> avaialableClothes;

  @BeforeEach
  public void createClothes() {
    avaialableClothes= new LinkedList<AbstractClothes>();
    avaialableClothes.add(new Jeans("Levis", "gray", "USA", Gender.MAN,Seasons.AUTUMN, 2499.99,34,false,TypeOfJeans.SLIM));
    avaialableClothes.add(new Jeans("Zara","blue","Spain",Gender.WOMAN,Seasons.SPRING,1149.99,32,false,TypeOfJeans.BOYFRIEND));
    avaialableClothes.add(new Jeans("Ralph  Lauren","black","USA",Gender.MAN,Seasons.AUTUMN,1999.99,40,true,TypeOfJeans.SKINNY));
    avaialableClothes.add(new Shirt("Hugo Boss","white","Germany",Gender.MAN,Seasons.SPRING,17000.0,40,true,true));
    avaialableClothes.add(new Shirt("Massimo Dutti","black","Spain",Gender.WOMAN,Seasons.SUMMER,1699.0,36,false,false));
    avaialableClothes.add(new Dress("Versace","yellow","Italy",Gender.WOMAN,Seasons.SUMMER,250000.0,36,true,165.7));
    avaialableClothes.add(new Dress("Louis Vuitton","blue","France",Gender.WOMAN,Seasons.SPRING,230000.0,38,true,160.2));
    avaialableClothes.add(new Dress("Dior","white","France",Gender.WOMAN,Seasons.SUMMER,179000.0,42,true,158.0));
  }
} 