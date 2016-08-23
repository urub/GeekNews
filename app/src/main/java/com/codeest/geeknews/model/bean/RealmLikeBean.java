package com.codeest.geeknews.model.bean;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by codeest on 16/8/23.
 * 用于数据库的bean 种类包括 新闻、技术、福利
 */

public class RealmLikeBean extends RealmObject implements Serializable{

    public RealmLikeBean() { }

    private String id;

    private String image;

    private String title;

    private int type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
