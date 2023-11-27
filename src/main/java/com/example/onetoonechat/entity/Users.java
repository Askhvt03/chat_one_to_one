package com.example.onetoonechat.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Users {
    @Id
    private String nickName;
    private String fullName;
    private Status status;
}
