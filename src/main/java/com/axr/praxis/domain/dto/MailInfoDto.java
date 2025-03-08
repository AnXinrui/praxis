package com.axr.praxis.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xinrui.an
 * @date 2025/03/07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
