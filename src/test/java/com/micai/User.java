package com.micai;

/**
 * DESCRIPTION:
 *
 * @author : Mr.Jia
 * @date 2019-07-25 9:09
 **/

public class User {
    private String name;
    private String password;
    private Integer member;
    private String isHihe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMember() {
        return member;
    }

    public void setMember(Integer member) {
        this.member = member;
    }

    public String getIsHihe() {
        return isHihe;
    }

    public void setIsHihe(String isHihe) {
        this.isHihe = isHihe;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", member=" + member +
                ", isHihe='" + isHihe + '\'' +
                '}';
    }
}
