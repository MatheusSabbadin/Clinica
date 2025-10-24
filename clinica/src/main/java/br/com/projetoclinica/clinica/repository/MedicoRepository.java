package br.com.projetoclinica.clinica.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoclinica.clinica.entity.Medico;
public interface MedicoRepository extends JpaRepository<Medico, Integer>  {
    
}
