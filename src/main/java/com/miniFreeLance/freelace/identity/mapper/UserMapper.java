package com.miniFreeLance.freelace.identity.mapper;

import com.miniFreeLance.freelace.dto.request.UserCreationRequest;
import com.miniFreeLance.freelace.identity.dto.response.UserResponse;
import com.miniFreeLance.freelace.identity.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "userName", ignore = true)
    @Mapping(target = "password", ignore = true)
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);

}
