package com.example.jp.service.Service;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

import com.example.jp.entity.RefreshTokenEntity;
import com.example.jp.repository.RefreshTokenRepository;
import com.example.jp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RefreshTokenService {
    @Value("${jp.app.jwtRefreshExpirationMs}")
    private Long refreshTokenDurationMs;

    @Autowired
    private RefreshTokenRepository refreshTokenRepository;

    @Autowired
    private UserRepository userRepository;

    public Optional<RefreshTokenEntity> findByToken(String token) {
        return refreshTokenRepository.findByRefreshToken(token);
    }

    public RefreshTokenEntity createRefreshToken(Long userId) {
        RefreshTokenEntity refreshToken = new RefreshTokenEntity();

        refreshToken.setUserEntity(userRepository.findById(userId).get());
        refreshToken.setExpiryDate(Instant.now().plusMillis(refreshTokenDurationMs));
        refreshToken.setRefreshToken(UUID.randomUUID().toString());

        refreshToken = refreshTokenRepository.save(refreshToken);
        return refreshToken;
    }

    public RefreshTokenEntity verifyExpiration(RefreshTokenEntity refreshToken) {
        if (refreshToken.getExpiryDate().compareTo(Instant.now()) < 0) {
            refreshTokenRepository.delete(refreshToken);
            throw new RuntimeException("loi o refresh token verify");
        }
        return refreshToken;
    }

}
