package com.sample.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by anurag on 7/6/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlaRequest implements Serializable{
    private static final long serialVersionUID = -5966135218868744857L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BlaRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
