package com.example.jp.service.Service;

import com.example.jp.dto.UserDto;
import com.example.jp.entity.UserEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserService {
    public List<UserDto> getListUser();
    public void userCreate(UserEntity userEntity);

    public UserEntity loadUserByUsername(String username);

    boolean existByUsername(String username);

    boolean existByEmail(String email);

}
