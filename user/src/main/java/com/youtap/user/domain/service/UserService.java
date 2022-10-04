package com.youtap.user.domain.service;

import com.youtap.user.dto.Response;
import com.youtap.user.dto.UserDto;
import com.youtap.user.dto.UserList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Value("${third.party.api.url}")
    private String thirdPartyApiUrl;
    @Autowired
    private RestTemplate restTemplate;

    public Response getUserContacts(Long userId, String userName)
    {

        UserDto userDto = null;

        UserList userDtoList = restTemplate.getForObject(thirdPartyApiUrl, UserList.class);
        if(userId != null)
        {
            assert userDtoList != null;
            List<UserDto> userDtoList1 = userDtoList.getUserDtoList().stream().filter(x -> Objects.equals(x.getId(), userId)).collect(Collectors.toList());
                    if(!userDtoList1.isEmpty())
                       userDto = userDtoList1.stream().findFirst().get();

            if(userDto != null)
            {
                return Response.builder()
                        .id(userDto.getId())
                        .email(userDto.getEmail())
                        .phone(userDto.getPhone())
                        .build();
            }
        }
        if (userName != null)
        {
            assert userDtoList != null;
            List<UserDto> userDtoList1 = userDtoList.getUserDtoList().stream().filter(x -> Objects.equals(x.getUsername(), userName)).collect(Collectors.toList());
            if(!userDtoList1.isEmpty())
                userDto = userDtoList1.stream().findFirst().get();

            if(userDto != null)
            {
                return Response.builder()
                        .id(userDto.getId())
                        .email(userDto.getEmail())
                        .phone(userDto.getPhone())
                        .build();
            }
        }
        return Response.builder()
            .id((long) -1)
            .build();
    }
}
