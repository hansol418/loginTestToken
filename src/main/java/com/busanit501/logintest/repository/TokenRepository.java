package com.busanit501.logintest.repository;

import com.busanit501.logintest.domain.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
}
