package br.com.senai.infob.padariabaltar.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.infob.padariabaltar.models.Endereco;

@Repository
public interface  EnderecoRepository  extends JpaRepository<Endereco, Integer>{
    
}
