package com.example.jp.service.Service;

import com.example.jp.entity.ERole;
import com.example.jp.entity.RoleEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface RoleService {
    Optional<RoleEntity> findByRoleName(ERole roleName);
}
