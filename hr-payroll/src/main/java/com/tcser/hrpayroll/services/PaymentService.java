package com.tcser.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcser.hrpayroll.entities.Payment;
import com.tcser.hrpayroll.entities.Worker;
import com.tcser.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;
    
    public Payment getPayment(Long workerId, int days) {
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
