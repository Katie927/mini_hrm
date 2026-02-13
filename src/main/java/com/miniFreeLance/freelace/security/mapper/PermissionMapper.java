package com.miniFreeLance.freelace.security.mapper;

import com.miniFreeLance.freelace.identity.entity.Permission;
import com.miniFreeLance.freelace.security.dto.request.PermissionRequest;
import com.miniFreeLance.freelace.security.dto.response.PermissionResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
