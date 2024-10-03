package Generics;
public class KeyValuePair <P,S>{
    P gen1;
    S gen2;

    public KeyValuePair(P gen1,S gen2){
        this.gen1=gen1;
        this.gen2=gen2;
    }

    public static void main(String[] args) {
        KeyValuePair keyValuePair=new KeyValuePair(1,"s");
        KeyValuePair keyValuePair1=new KeyValuePair("s",2);
        System.out.println("Integer Value is: " + keyValuePair.gen1 + " , and String Value is: " + keyValuePair.gen2);
        System.out.println("String Value is: " + keyValuePair1.gen1 + " , and Integer Value is: " + keyValuePair1.gen2);
    }
}
