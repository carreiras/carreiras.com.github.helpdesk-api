package carreiras.com.github.helpdeskapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import carreiras.com.github.helpdeskapi.domain.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
