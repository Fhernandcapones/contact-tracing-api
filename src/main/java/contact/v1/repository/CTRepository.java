package contact.v1.repository;


import contact.v1.domain.CTEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CTRepository extends JpaRepository<CTEntity, Integer> {
}
