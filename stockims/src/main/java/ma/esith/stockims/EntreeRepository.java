package ma.esith.stockims;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EntreeRepository extends JpaRepository<Entree, Long> {

    List<Entree> findByArticle_Id(Long articleId);
}