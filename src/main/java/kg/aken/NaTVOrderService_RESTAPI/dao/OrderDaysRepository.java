package kg.aken.NaTVOrderService_RESTAPI.dao;

import kg.aken.NaTVOrderService_RESTAPI.models.entities.OrderDays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDaysRepository extends JpaRepository<OrderDays, Long> {
}
