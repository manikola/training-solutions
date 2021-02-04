package week14d04;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {

    private Contract template;



    public ContractCreator(String client, List<Integer> monthlyPrices) {
        this.template = new Contract(client, monthlyPrices);
    }

    public Contract create(String name) {
      //  return new Contract(name, template.getMonthlyPrices());
       return new Contract(name, new ArrayList<>(template.getMonthlyPrices()));
    }

    public static void main(String[] args) {
        ContractCreator cc = new ContractCreator("minta",new ArrayList<>(List.of(10,10,10)));
        Contract contract1 = cc.create("John Doe");
        Contract contract2 = cc.create("Jack Doe");

        System.out.println(contract1);
        System.out.println(contract2);

        contract1.getMonthlyPrices().set(1,20);
        System.out.println(contract1);
        System.out.println(contract2);

        Contract contract3 = cc.create("Jane Doe");
        System.out.println(contract3);
    }
}

