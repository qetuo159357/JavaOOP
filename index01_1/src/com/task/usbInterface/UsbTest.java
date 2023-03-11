package com.task.usbInterface;

public class UsbTest {
    public static void main(String[] args) {
        Usb usb = new Usb() {
            @Override
            public void service() {
                System.out.println("命名内部类");
            }
        };
        usb.service();

        UsbTest test=new UsbTest();
        test.print(new Usb() {
            @Override
            public void service() {
                System.out.println("参数命名内部类");
            }
        });

        Usb usb1 = () -> System.out.println("Lambda1");
        usb1.service();

        test.print(()-> System.out.println("Lambda2"));
    }

    public static void print(Usb usb){
        usb.service();
    }
}
