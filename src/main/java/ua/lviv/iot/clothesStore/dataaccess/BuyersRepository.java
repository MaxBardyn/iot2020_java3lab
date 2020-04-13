package ua.lviv.iot.clothesStore.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.iot.clothesStore.model.Buyer;

public interface BuyersRepository extends JpaRepository<Buyer, Integer> {
}