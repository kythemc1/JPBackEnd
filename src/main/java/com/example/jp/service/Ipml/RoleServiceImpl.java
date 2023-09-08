package com.example.jp.service.Ipml;

import com.example.jp.entity.ERole;
import com.example.jp.entity.RoleEntity;
import com.example.jp.repository.RoleRepository;
import com.example.jp.service.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public Optional<RoleEntity> findByRoleName(ERole roleName) {
        return roleRepository.findByRoleName(roleName);
    }
}
