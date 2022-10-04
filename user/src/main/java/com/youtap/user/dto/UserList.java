package com.youtap.user.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserList implements Serializable {

    private List<UserDto> userDtoList;

    @JsonCreator
    public UserList(List<UserDto> userDtoList)
    {
        this.userDtoList = userDtoList;
    }
}
