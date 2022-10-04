package com.youtap.user.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AddressDto implements Serializable {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private GeoDto geo;
}
