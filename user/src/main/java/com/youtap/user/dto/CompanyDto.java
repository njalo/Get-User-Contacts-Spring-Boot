package com.youtap.user.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CompanyDto implements Serializable {
    private String name;
    private String catchPhrase;
    private String bs;
}
