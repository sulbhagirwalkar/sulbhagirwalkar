package com.Apple;

import java.util.Optional;

/** IDEMPOTENCY KEY PATTERN IMPLEMENTATION
 * this method ensures that duplicate payment requests with the
 * same idempotency key will return the cashed result
 * instead of processing payment again
 * */
/*
@Transactional
public PaymentResponse processPayment(String idempotencyKey, PaymentRequest request){
    log.info("Processing payment with idempotency key:{} ",idempotencyKey);

    //STEP 1: check if payment already processed with this idempotency Key

    Optional<Payment> existingPayment = paymentRepository.findByIdempotencyKey(idempotencyKey);
    if(existingPayment.isPresent()){
        return buildPaymentResponse(cashedPayement, true);
    }
    //STEP 2: this is a new request - create payment record
    log.info("New payment request- Creating payment record");

    //save immediately to prevent duplicate processing
    payment = paymentRepository.save(payment);
    //call external payment gateway
*/

public class IdempotencyKeyDemo {

}
