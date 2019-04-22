package ru.mera.ivstepan.carshowroom.soap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.mera.ivstepan.carshowroom.soap.entity.Order;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Transactional
    @Modifying
    @Query("select u from Order u where u.customer.id = ?1 and u.status =?2")
    List<Order> selectOrdersByCustomerIdAndStatus(Integer customerId, String status);
}
