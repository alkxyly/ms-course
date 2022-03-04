package com.devsuperior.hrworker.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ObterDadosScheduling {

	@Scheduled(cron = "10 * * * * *", zone = "America/Sao_Paulo")
	public void executar() {
		System.out.println("Entrou foi executado com sucesso o scheduled");
	}
}
