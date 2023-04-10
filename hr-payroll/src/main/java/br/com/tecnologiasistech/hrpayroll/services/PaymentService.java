package br.com.tecnologiasistech.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.tecnologiasistech.hrpayroll.entities.Payment;
import br.com.tecnologiasistech.hrpayroll.entities.Worker;
import br.com.tecnologiasistech.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(Long workerId, int days) {
				
		Worker worker = workerFeignClient.findById(workerId).getBody();		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}
