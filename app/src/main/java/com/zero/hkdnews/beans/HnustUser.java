package com.zero.hkdnews.beans;

import cn.bmob.v3.BmobUser;

/**
 * Created by luowei on 15/4/16.
 */
public class HnustUser extends BmobUser {
    private String studentID;

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }
}