package com.company;

public class Test {
     public static void main(String[] args) {

         /*if (args.length != 1) {
             System.out.println("err");
             return;
         }
         String p = args[0];
         System.out.println(p);*/

         DEqueue d = new DEqueue();
         for(int i = 0; i < 15; i++)
         {
             d.addToEnd(""+i);
         }
         for(int j = 100; j<120; j++)
         {
             d.addToFront(""+j);
         }
         d.removeEnd();
         d.removeFront();
         d.printHead();
         d.printTail();
     }

}
