package br.com.aceleradev.centralerrors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aceleradev.centralerrors.entity.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{}