package ch7;

public class TestTV {
    public static void main(String[] args) {
        TV tv = new TV(); //系统自带默认构造函数
        if (!tv.isOn()) {
            tv.setOn(true);
        }
        System.out.println("取得默认频道：" + tv.getChannel());
        System.out.println("取得默认音量：" + tv.getVolumeLevel());


        tv.setChannel(8);
        tv.setVolumeLevel(9);

        tv.ChannelUp();
        tv.VolumeUp();

        System.out.println("当前电视频道是："+tv.getChannel());
        System.out.println("当前电视音量是："+tv.getVolumeLevel());

    }
}
