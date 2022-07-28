package com.webshop.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class MemberFormDto {

    @NotBlank(message = "필수 입력 사항입니다.")
    private String name;

    @NotEmpty(message = "필수 입력 사항입니다.")
    @Email(message = "이메일 형식으로 입력해주세요.")
    private String email;

    @NotEmpty(message = "필수 입력 사항입니다.")
    @Length(min = 8, max = 16, message = "필수 입력 사항입니다.")
    private String password;

    @NotEmpty(message = "필수 입력 사항입니다.")
    private String address;

}
