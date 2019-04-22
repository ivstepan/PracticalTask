package ru.mera.ivstepan.carshowroom.soap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mera.ivstepan.carshowroom.soap.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findByFirstNameAndLastNameAndEmail(String firstName, String lastName, String email);
}
