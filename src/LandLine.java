public class LandLine implements Phone{


    private String number;
    private boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String number) {
        this.number = number;
        isRinging=false;
        isPowerOn=true;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn=true;
    }

    @Override
    public void callNumber(String number) {
        if(isPowerOn)
        {
            System.out.println("you are dialing to"+number);
        }
        else {
            System.out.println("phone is off");
        }
        return;

    }

    @Override
    public void receiveCall(String myNumber) {
        if(isPowerOn&&myNumber.equals(number))
        {
            this.isRinging=true;
            System.out.println("phone is ringing");
        }
        else{
            System.out.println("wrong number");
        }

    }

    @Override
    public boolean answerCall() {
        if(isRinging)
        {
            System.out.println("call answered");
            isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
//        if(isRinging)
//            return true;
//        else
//            return false;
        return isRinging;
    }
}
