package ru.mera.ivstepan.carshowroom.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mera.ivstepan.carshowroom.rest.entity.Auto;
import ru.mera.ivstepan.carshowroom.rest.entity.Options;

@Repository
public interface OptionsRepository extends JpaRepository<Options, Integer> {

    Options findByAuto(Auto auto);
}
