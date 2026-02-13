package com.miniFreeLance.freelace.security.mapper;

import com.miniFreeLance.freelace.identity.entity.Role;
import com.miniFreeLance.freelace.security.dto.request.RoleRequest;
import com.miniFreeLance.freelace.security.dto.response.RoleResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRResponse(Role permission);
}
