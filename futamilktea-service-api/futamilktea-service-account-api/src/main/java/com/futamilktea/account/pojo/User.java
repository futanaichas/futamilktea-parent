package com.futamilktea.account.pojo;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @auther: wulusai
 * @PackageName: com.futamilktea.account.pojo
 * @ClassName: User
 * @Description: tb_user表的实体类
 * @date: 2019/8/29 20:49
 */
@Table(name = "tb_user")
public class User implements Serializable {

    @Id
    private String uid;
    private String email;
    private String username;
    private String password;
    private String status;
    private String user_dlc;

    //get set

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUser_dlc() {
        return user_dlc;
    }

    public void setUser_dlc(String user_dlc) {
        this.user_dlc = user_dlc;
    }
}
