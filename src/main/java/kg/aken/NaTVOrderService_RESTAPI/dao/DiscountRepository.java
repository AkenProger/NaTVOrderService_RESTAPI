package kg.aken.NaTVOrderService_RESTAPI.dao;

import kg.aken.NaTVOrderService_RESTAPI.models.entities.Discounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DiscountRepository extends JpaRepository<Discounts, Long> {
    @Query(value = "select * from discounts d where d.id_channels = ?1", nativeQuery = true)
    Discounts findDiscountByChannelId(Long id);
}
