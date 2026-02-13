package com.miniFreeLance.freelace.identity.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {

    String id;

    String userName;

    String fullName;
    String address;
    LocalDate dob;
    String email;
    String phoneNumber;

}
