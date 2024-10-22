package se.simple.simplelog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.simple.simplelog.model.LogType;

import java.math.BigInteger;
import java.util.Optional;

public interface LogTypeRepository extends JpaRepository<LogType, BigInteger> {

    Optional<LogType> findByName(String name);
}
