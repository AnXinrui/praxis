package com.axr.praxis.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xinrui.an
 * @date 2025/03/07
 */
@Data
public class MailInfoDto implements Serializable {

    private static final long serialVersionUID = -2047433050358728377L;

    /**
     * 收件人
     */
    String to;

    /**
     * 主题
     */
    String subject;

    /**
     * 邮件正文
     */
    String text;

    /**
     * 邮件正文是否是HTML正文
     */
    Boolean html;

}
