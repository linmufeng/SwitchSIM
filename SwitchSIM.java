public class SwitchSIM 
{
    public static void main(String[] args) 
    {
        SIM simOne = new SIM(15112138670L);
        MobileTelephone mobile = new MobileTelephone();
        mobile.setSIM(simOne);
        System.out.println("手机原SIM卡号码：" + mobile.lookNumber());

        SIM simTwo = new SIM(12345678910L);
        mobile.setSIM(simTwo);                              //更好SIM卡
        System.out.println("手机现SIM卡号码：" + mobile.lookNumber());
    }
}
