package ru.mera.ivstepan.carshowroom.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mera.ivstepan.carshowroom.rest.entity.Auto;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Integer> {

    Auto findByBrandAndModel(String brand, String model);
}
