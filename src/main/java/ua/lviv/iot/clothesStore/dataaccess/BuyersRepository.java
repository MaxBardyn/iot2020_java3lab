package ua.lviv.iot.clothesStore.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.clothesStore.model.Buyer;

@Repository
public interface BuyersRepository extends JpaRepository<Buyer, Integer> {
}