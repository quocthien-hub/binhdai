package web.myproject.binhdai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.myproject.binhdai.model.XeBuyt;

public interface MyRepository extends JpaRepository<XeBuyt, Integer> {
}
