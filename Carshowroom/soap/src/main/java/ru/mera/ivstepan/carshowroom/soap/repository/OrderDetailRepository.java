package ru.mera.ivstepan.carshowroom.soap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.mera.ivstepan.carshowroom.soap.entity.OrderDetail;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    @Transactional
    @Modifying
    @Query("delete from OrderDetail u where u.order.id = ?1")
    void deleteOrderDetailByOrderId(Integer orderId);

}
