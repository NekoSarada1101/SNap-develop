package com.example.snap_develop.bean;

import android.graphics.Bitmap;

import com.google.android.gms.maps.model.LatLng;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostBean implements Serializable {
    private String message;
    private String photoName;
    private Bitmap photo;
    private Long goodCount;
    private LatLng latLng;
    private Date datetime;
    private boolean danger;
    private boolean anonymous;
    private String geopoint;
    private Long goodCount;
    private String postPath;
    private String uid;
    private String type;
    private String parentPost;
}
