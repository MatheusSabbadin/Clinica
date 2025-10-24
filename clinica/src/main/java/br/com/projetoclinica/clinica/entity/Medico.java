package br.com.projetoclinica.clinica.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer idMedico;

    @Column(nullable = false, length = 20)
   private String nomeMedico;

   @Column(nullable = false, length = 20)
   private Integer crmMedico;

   @Column(nullable = false, length = 20)
   private String especialidadeMedico;

   @OneToMany(mappedBy = "medico")
   private List<Consulta> consulta;
}
