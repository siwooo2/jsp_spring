package com.example.demo.user.domain;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserRequestDTO {
    @NotBlank(message = "아이디는 필수 입력사항입니다")
    private String id;
    @NotBlank(message = "비밀번호는 필수 입력사항입니다")
    private String pwd;
    @NotBlank(message = "이름은 필수 입력사항입니다")
    private String name;
    ///////////////////////////////// img upload
    private String imgUrl;
}
