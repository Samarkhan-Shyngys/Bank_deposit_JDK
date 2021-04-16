package com.company;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Client {

    public static void WelcomeClient() {
        Scanner sc = new Scanner(System.in);

        Map<String, Polzovatel> ClientServer = new HashMap<String, Polzovatel>();


        ClientServer.put("1111", new Polzovatel(new HalykBank(), "Will", "John", 1111, 25));
        ClientServer.put("2222", new Polzovatel(new KaspiBank(), "Kate", "Donna", 2222, 21));
        while (true) {
            System.out.println("Salem!IIN: ");
            String IIN = String.valueOf(sc.nextInt());

            if (ClientServer.containsKey(IIN)) {
                System.out.println("Account exists");
                System.out.println("Account details are:");
                System.out.println(ClientServer.get(IIN).toString());
                System.out.println("Enter 1 for add 2 for withdrawal ");
                int action = sc.nextInt();
                switch (action){
                    case 1:
                        int amountToAdd = 0;
                        System.out.println("Current Balance: "+ ClientServer.get(IIN).getDeposit().getSumma());
                        System.out.println("How much to add?:");
                        amountToAdd = sc.nextInt();
                        ClientServer.get(IIN).getDeposit().addMoney(amountToAdd);
                        System.out.println(amountToAdd + "was successfully added to your balance!");
                        System.out.println("Balance after addition: "+ ClientServer.get(IIN).getDeposit().getSumma());
                        System.out.println("Prediction after addition: " + ClientServer.get(IIN).getBanks().
                                getPrediction(ClientServer.get(IIN).getDeposit().getMonths(), ClientServer.get(IIN).getDeposit().getSumma()));
                        break;
                    case 2:
                        int amountToWithdraw = 0;
                        System.out.println("Current Balance: "+ ClientServer.get(IIN).getDeposit().getSumma());
                        System.out.println("How much to withdraw?:");
                        amountToWithdraw = sc.nextInt();
                        ClientServer.get(IIN).getDeposit().withdrawMoney(amountToWithdraw);
                        System.out.println(amountToWithdraw + "was successfully withdrawed from your balance!");
                        System.out.println("Balance after withdraw: "+ ClientServer.get(IIN).getDeposit().getSumma());
                        System.out.println("Prediction after withdraw: " + ClientServer.get(IIN).getBanks().
                                getPrediction(ClientServer.get(IIN).getDeposit().getMonths(), ClientServer.get(IIN).getDeposit().getSumma()));
                        break;
                }
            } else {
                Polzovatel newPolzovatel = new Polzovatel();
                newPolzovatel.setIIN(Integer.parseInt(IIN));
                System.out.println("Registration. Enter your surname: ");
                newPolzovatel.setSurname(sc.next());
                System.out.println("Name: ");
                newPolzovatel.setName(sc.next());
                System.out.println("Age: ");
                newPolzovatel.setAge(sc.nextInt());
                System.out.println("Summa: ");
                newPolzovatel.getDeposit().addMoney(sc.nextInt());
                System.out.println("12 24 36 60 months: ");
                newPolzovatel.getDeposit().setMonths(sc.nextInt());
                System.out.println("Enter 1 for HalykBank, 2 for KaspiBank");
                int san = sc.nextInt();
                switch (san) {
                    case 1:
                        newPolzovatel.setBanks(new HalykBank());
                        break;
                    case 2:
                        newPolzovatel.setBanks(new KaspiBank());
                        break;
                    case 3:
                        newPolzovatel.setBanks(new HalykBank());
                    default:
                        System.out.println("Incorrect");
                        break;
                }
                Polzovatel p = new Polzovatel();
                ClientServer.put(IIN, newPolzovatel);
            }
            System.out.println("1 - IIN\n2 - exit");
            int sans = sc.nextInt();
            if (sans == 1) {
                continue;
            }

            break;

        }


}


}
