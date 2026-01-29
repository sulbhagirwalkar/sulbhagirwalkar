package com.Apple;
//payment by UPI CARD and NETBanking- linkedin page by Prathamesh Jadhav
/*
@SpringBootApplication
public class PaymentApplication implements CommandLineRunner{
    @Autowired
    private Map<String, PaymentService> paymentServiceMap;

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }
    @Override
    public void run(String [] args){
        System.out.println("Executing payment service");

        paymentServiceMap.forEach((key, value) -> {
            System.out.println("Executing:" + key);
            value.makePayment();
        });
        PaymentService upi = paymentServiceMap.get("upi");
        upi.makePayment;

    }
}
*/
public class SpringMapBasedDependencyInjection {
    /* public interface PaymentService{
    void makePayment();
    }
    @service("upi")
    public class UpiPaymentService implements PaymentService{
    public void makePayment(){
    System.out.println("Processing URI payment..");
        }
    }
    @service("card")
    public class CardService implements PaymentService{
    public void makePayment(){
    System.out.println("Processing Card payment..");
        }
    }
    @service("netBanking")
    public class UriService implements PaymentService{
    public void makePayment(){
    System.out.println("Processing netBanking payment..");
        }
    }

    *
    * */
    }
