package kg.aken.NaTVOrderService_RESTAPI.dao;

import kg.aken.NaTVOrderService_RESTAPI.models.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}
