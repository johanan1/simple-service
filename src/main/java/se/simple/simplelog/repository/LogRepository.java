package se.simple.simplelog.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import se.simple.simplelog.model.Log;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

public interface LogRepository extends JpaRepository<Log, BigInteger> {

    @EntityGraph(value = "Log.types")
    List<Log> findAllByOrderByCreatedDesc();

    @EntityGraph(value = "Log.types")
    List<Log> findByDeviceInOrderByCreatedDesc(List<String> device);

    @EntityGraph(value = "Log.types")
    List<Log> findByDeviceInAndCreatedBetweenOrderByCreatedDesc(List<String> devices, LocalDateTime fromDate, LocalDateTime toDate);

    @EntityGraph(value = "Log.types")
    List<Log> findByDeviceInAndCreatedGreaterThanOrderByCreatedDesc(List<String> devices, LocalDateTime fromDate);

    @EntityGraph(value = "Log.types")
    List<Log> findByDeviceInAndCreatedLessThanOrderByCreatedDesc(List<String> devices, LocalDateTime toDate);

    void deleteByDevice(String device);

}
