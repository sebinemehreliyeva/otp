package az.atlacademy.otp.dao.repository;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtpRepository extends JpaRepository<az.atlacademy.otp.dao.entity.OtpEntity, Long> {

    Optional<az.atlacademy.otp.dao.entity.OtpEntity> findByMsisdn(String msisdn);
}

