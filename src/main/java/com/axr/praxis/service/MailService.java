package com.axr.praxis.service;

import com.axr.praxis.domain.dto.MailInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;
import java.util.Arrays;

/**
 * @description 邮件服务
 * @author xinrui.an
 * @date 2025/03/06
 */
@Slf4j
@Service
public class MailService {

    @Resource
    private JavaMailSender javaMailSender;

    @Value("${nick}")
    String nick;

    @Value("${spring.mail.properties.from}")
    String from;

    public void sendMail(MailInfoDto dto) {
        // 创建一个邮件消息
        MimeMessage message = javaMailSender.createMimeMessage();
        try {
            // 创建 MimeMessageHelper
            MimeMessageHelper helper = new MimeMessageHelper(message, false);

            // 发件人邮箱和名称
            helper.setFrom(from, nick);
            // 收件人邮箱
            helper.setTo(dto.getTo());
            // 邮件标题
            helper.setSubject(dto.getSubject());
            // 邮件正文，第二个参数表示是否是HTML正文
            helper.setText(dto.getText(), Boolean.TRUE.equals(dto.getHtml()));

            // 发送
            javaMailSender.send(message);
            log.info("to {} , 邮件发送成功!", Arrays.toString(dto.getTo()));
        } catch (Exception e) {
            log.error("邮件发送失败！", e);
        }
    }
}
