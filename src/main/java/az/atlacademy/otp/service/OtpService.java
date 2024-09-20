package az.atlacademy.otp.service;

import az.atlacademy.otp.util.dto.SendOtpRequestDto;
import az.atlacademy.otp.util.dto.SendOtpResponseDto;

public interface OtpService {
    SendOtpResponseDto sendOtp(SendOtpRequestDto sendOtpRequestDto);
    void verifyOtp();
}

