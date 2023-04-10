package br.com.tecnologiasistech.hrpayroll.services;

import org.springframework.stereotype.Service;
import br.com.tecnologiasistech.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
	
}
