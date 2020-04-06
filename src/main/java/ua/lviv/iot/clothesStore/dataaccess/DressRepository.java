package ua.lviv.iot.clothesStore.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.clothesStore.model.Dress;

@Repository
public interface DressRepository extends JpaRepository<Dress, Integer> {

}
