package com.grantcs.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

public class UserInfoDTO {
    @Size(min = 3, max = 20, message = " *Name should have between 3 to 15 characters")
    private String userName;
    @Size(min = 3, max = 20, message = "*Name should have between 3 to 15 characters")
    private String crushName;
    @AssertTrue(message = "*You have to agree to use our app")
    private boolean termsAndConditions;

    public UserInfoDTO() {
        System.out.println("UserInfoDTO constructor being called...");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCrushName() {
        return crushName;
    }

    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }

    public boolean isTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(boolean termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    @Override
    public String toString() {
        return "UserInfoDTO{" +
                "userName='" + userName + '\'' +
                ", crushName='" + crushName + '\'' +
                '}';
    }
}
