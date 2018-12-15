package com.example.himanshu.exosearch;

import java.io.Serializable;

public class ParticularData implements Serializable {
    String value;
    String topic;

    public String getValue() {
        return value;
    }

    public String getTopic() {
        return topic;
    }

    public ParticularData(String topic, String value) {

        this.value = value;
        this.topic = topic;
    }
}
