package com.miniFreeLance.freelace.mapper;

import com.miniFreeLance.freelace.dto.request.identitiyReq.UserCreationRequest;
import com.miniFreeLance.freelace.dto.response.identityRes.UserResponse;
import com.miniFreeLance.freelace.entity.identity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);

}
