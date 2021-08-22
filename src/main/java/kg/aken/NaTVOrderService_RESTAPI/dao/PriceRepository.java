package kg.aken.NaTVOrderService_RESTAPI.dao;

import kg.aken.NaTVOrderService_RESTAPI.models.entities.Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Prices, Long> {
}
