public class Main {
    public static void main(String[] args) {
        LandLine l1=new LandLine("789230");
        LandLine l2=new LandLine("662472");
        l1.callNumber("789230");
        l2.receiveCall("66472");
        System.out.println(l2.answerCall());
    }
}