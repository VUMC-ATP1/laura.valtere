package homework.oop_homework;

import lombok.ToString;

@ToString
public class DiscountRate {
    public double serviceDiscountPremium = 0.2;
    public double serviceDiscountGold = 0.15;
    public double serviceDiscountSilver= 0.1;
    public double productDiscountPremium = 0.1;
    public double productDiscountGold = 0.1;
    public double productDiscountSilver = 0.1;


   public double getServiceDiscountRate(String rateType) {
       switch (rateType) {
           case "Premium":
               return serviceDiscountPremium;
           break;
           case "Gold":
               return serviceDiscountGold;
           break;
           case "Silver":
               return serviceDiscountSilver;
           break;
           default:
               System.out.println("We dont have such Discount Type");
       }
   }

   public double getProductDiscountRate(String rateType) {
      switch (rateType) {
           case "Premium":
               return productDiscountPremium;
           break;
           case "Gold":
               return productDiscountGold;
           break;
           case "Silver":
               return productDiscountSilver;
           break;
           default:
               System.out.println("We dont have such Discount Type");
       }
   }


}
