package com.para.liwei.sso.demo.dto;

import lombok.Data;

@Data
public class TokenDTO {
    private int status;
    private String msg;
    private String access_token;
}
