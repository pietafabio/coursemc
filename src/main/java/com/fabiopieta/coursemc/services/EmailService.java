package com.fabiopieta.coursemc.services;

import org.springframework.mail.SimpleMailMessage;

import com.fabiopieta.coursemc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}