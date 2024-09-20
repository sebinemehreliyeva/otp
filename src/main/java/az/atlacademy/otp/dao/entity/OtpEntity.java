package az.atlacademy.otp.dao.entity;

import az.atlacademy.otp.dao.enums.OtpStatus;
import az.atlacademy.otp.dao.enums.OtpType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "otp")
public class OtpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String msisdn;
    private Integer otp;
    private Integer sendOtpCount;
    private Integer attemptCount;
    private Instant expirationTime;
    private OtpStatus otpStatus;
    private OtpType otpType;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}




