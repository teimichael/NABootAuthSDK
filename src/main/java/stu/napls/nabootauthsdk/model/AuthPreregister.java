package stu.napls.nabootauthsdk.model;

import lombok.Data;

@Data
public class AuthPreregister {

    private String username;

    private String password;

    private String source;
}
