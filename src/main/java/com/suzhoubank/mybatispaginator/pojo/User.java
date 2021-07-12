package com.suzhoubank.mybatispaginator.pojo;

import com.suzhoubank.mybatispaginator.enums.UserSexEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor // mybatis需要无参构造方法！
public class User implements Serializable {

    private static final long serialVersionUID = 1876913958705431998L;

    private int id;
    private String username;
    private String password;
    private UserSexEnum userSex;
    private String nickname;

    public User(String username, String password, UserSexEnum userSex) {
        this.username = username;
        this.password = password;
        this.userSex = userSex;
    }
}
