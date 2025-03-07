package com.axr.praxis.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author xinrui.an
 * @date 2025/03/07
 */
@Setter
@Getter
public class ApiResult implements Serializable {
    /**
     * 序列化ID，用于唯一标识类的版本
     */
    private static final long serialVersionUID = 1L;


    private int code;


    private String msg;


    private Data data;


    @Setter
    @Getter
    public static class Data implements Serializable {
        private static final long serialVersionUID = -6242234440641299173L;

        private String tts;

        private String content;

        private String note;

        private String img;

        private String picture;

    }
}
