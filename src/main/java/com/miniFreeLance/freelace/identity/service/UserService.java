package com.miniFreeLance.freelace.identity.service;

import com.miniFreeLance.freelace.dto.request.identitiyReq.UserCreationRequest;
import com.miniFreeLance.freelace.dto.response.identityRes.UserResponse;
import com.miniFreeLance.freelace.entity.identity.User;
import com.miniFreeLance.freelace.exception.AppException;
import com.miniFreeLance.freelace.exception.ErrorCode;
import com.miniFreeLance.freelace.mapper.UserMapper;
import com.miniFreeLance.freelace.repository.identity.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {

    UserMapper userMapper;
    UserRepository userRepository;

//    PasswordEncoder passwordEncoder;

    public UserResponse createUser(UserCreationRequest request){
        if (userRepository.existsByEmail(request.getEmail())){
            throw new AppException(ErrorCode.USER_EXISTED);
        }

        User user = userMapper.toUser(request);
//        user.setPassword(passwordEncoder.encode("123456"));

        return userMapper.toUserResponse(userRepository.save(user));
    }

}
