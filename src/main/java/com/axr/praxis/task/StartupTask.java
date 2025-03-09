package com.axr.praxis.task;

import com.axr.praxis.domain.dto.MailInfoDto;
import com.axr.praxis.service.MailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @description 启动后执行
 * @author xinrui.an
 * @date 2025/03/09
 */
@Component
public class StartupTask {

    @Value("${to[0]}")
    private String[] to;

    @Resource
    private MailService mailService;

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        String subject = "Axr Praxis Start up";
        String text = "Axr Praxis Start up";
        String[] usernames = {to[0]};
        MailInfoDto mailInfoDto = MailInfoDto.builder()
                .to(usernames)
                .subject(subject)
                .text(text)
                .html(true)
                .build();
        mailService.sendMail(mailInfoDto);
    }
}
