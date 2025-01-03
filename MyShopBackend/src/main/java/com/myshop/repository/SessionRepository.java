package com.myshop.repository;

import com.myshop.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SessionRepository extends JpaRepository<Session,Long> {

   Optional<Session> findSessionBySessionKey(String key);
}
