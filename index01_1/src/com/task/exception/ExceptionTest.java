package com.task.exception;

import java.util.Random;

public class ExceptionTest {
    public static void main(String[] args) {

        int [] arr=new int[6];
        Random random = new Random();
        for(int i=0;i<arr.length;i++) {
            int num=(int) (Math.random()*30+1);
            arr[i]=num;
            for(int j=0;j<i;j++) {
                if(arr[i]==arr[j]) {
                    int nums=(int) (Math.random()*30+1);
                    arr[i]=nums;
                }
            }
        }


        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }



//        try {
//            sexTest("nan");
//
//        } catch (Exception e) {
//            try {
//                throw new MyException("main方法", e);
//            } catch (MyException e1) {
//                e1.printStackTrace();
//            }
//        }
//    }
//
//    public static void sexTest(String sex) throws Exception {
//        if (!"男".equals(sex) && !"女".equals(sex)) {
//            throw new SexException("性别输入错误");
//        } else {
//            System.out.println(sex);
//        }
    }
}
