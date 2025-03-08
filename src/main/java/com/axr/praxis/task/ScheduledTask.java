package com.axr.praxis.task;

import com.axr.praxis.common.Constants;
import com.axr.praxis.domain.dto.MailInfoDto;
import com.axr.praxis.service.ApiService;
import com.axr.praxis.service.MailService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ScheduledTask {

    @Resource
    private MailService mailService;

    @Resource
    private ApiService apiService;

    @Value("${to[0]}")
    private String[] to;

    @Scheduled(cron = "0 0 9 * * ? ")
    public void dailySentence() throws JsonProcessingException {
        String text = Constants.DAILY_SENTENCE_TEMPLATE.replace("{{content}}", apiService.getDailySentence());
        MailInfoDto mailInfoDto = MailInfoDto.builder()
                .to(to)
                .subject("早上好哇～")
                .text(text)
                .html(true)
                .build();
        mailService.sendMail(mailInfoDto);
    }
}
