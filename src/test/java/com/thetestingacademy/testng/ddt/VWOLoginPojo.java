package com.thetestingacademy.testng.ddt;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VWOLoginPojo {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("remember")
    @Expose
    private Boolean remember;
    @SerializedName("recaptcha_response_field")
    @Expose
    private String recaptchaResponseField;

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

    public Boolean getRemember() {
        return remember;
    }

    public void setRemember(Boolean remember) {
        this.remember = remember;
    }

    public String getRecaptchaResponseField() {
        return recaptchaResponseField;
    }

    public void setRecaptchaResponseField(String recaptchaResponseField) {
        this.recaptchaResponseField = recaptchaResponseField;
    }

}