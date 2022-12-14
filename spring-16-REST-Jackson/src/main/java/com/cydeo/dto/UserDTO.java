package com.cydeo.dto;

import com.cydeo.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String username;
    private UserRole role;


    @JsonManagedReference //this field is going to be serialized - we will see AccountDTO in UserDTO
    private AccountDTO account;

}
