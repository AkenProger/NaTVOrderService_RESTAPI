package kg.aken.NaTVOrderService_RESTAPI.dao;

import kg.aken.NaTVOrderService_RESTAPI.models.entities.Discounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discounts, Long> {
}
