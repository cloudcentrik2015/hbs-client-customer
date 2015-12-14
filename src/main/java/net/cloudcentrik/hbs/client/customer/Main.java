package net.cloudcentrik.hbs.client.customer;

/**
 * Main class.
 *
 */
public class Main {
   
    public static void main(String[] args){
        System.out.println("hbs client customer module");
        
        IsmailTest ismailTest=new IsmailTest();
        ismailTest.test();
        
        ShdTest shdtest = new ShdTest();
		  shdtest.test();
    }
}

