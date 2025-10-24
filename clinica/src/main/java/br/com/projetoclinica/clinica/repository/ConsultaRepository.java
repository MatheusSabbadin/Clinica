package br.com.projetoclinica.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoclinica.clinica.entity.Consulta;
public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {
    
}
