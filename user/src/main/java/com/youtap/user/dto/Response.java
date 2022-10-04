package com.youtap.user.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Response implements Serializable {

    private Long id;
    private String email;
    private String phone;
}
