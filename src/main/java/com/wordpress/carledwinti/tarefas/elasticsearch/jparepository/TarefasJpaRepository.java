package com.wordpress.carledwinti.tarefas.elasticsearch.jparepository;

import com.wordpress.carledwinti.tarefas.elasticsearch.model.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefasJpaRepository extends JpaRepository<Tarefas, Long> {
}
