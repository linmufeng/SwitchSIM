public class SwitchSIM 
{
    public static void main(String[] args) 
    {
        SIM simOne = new SIM(15112138670L);
        MobileTelephone mobile = new MobileTelephone();
        mobile.setSIM(simOne);
        System.out.println("�ֻ�ԭSIM�����룺" + mobile.lookNumber());

        SIM simTwo = new SIM(12345678910L);
        mobile.setSIM(simTwo);                              //����SIM��
        System.out.println("�ֻ���SIM�����룺" + mobile.lookNumber());
    }
}
