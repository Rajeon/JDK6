package com.company;

class Main {


    public String squares(){
        String response = "*** Output ***";
        for (int x = 1; x < 11; x++){
            response += x * x + "\n";
        }

        return response;
    }




    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.squares());

    }
}
//class Main {
//    public String oddNumbers(){
//        String response = "***Output***";
//        int x = 1;
//        while(x <= 19){
//            response = response + "\n" + x;
//            x += 2;
//        }
//
//
//
//        //Do not write below here
//        return response;
//    }
//
//
//
//
//
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        System.out.println(main.oddNumbers());
//    }
//}
