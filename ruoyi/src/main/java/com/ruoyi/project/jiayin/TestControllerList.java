package com.ruoyi.project.jiayin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(value = "/jiayin")
public class TestControllerList {

    @RequestMapping(value = "/test")
    public List<String> test() {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 50 ; i++) {
            strings.add(getRandomString(10));
        }
        return strings;
    }

    /**
     * 获取指定长度随机字符串
     *
     * @param length
     * @return
     */
    public static String getRandomString(int length) {
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(3);
            long result = 0;
            switch (number) {
                case 0:
                    result = Math.round(Math.random() * 25 + 65);
                    sb.append(String.valueOf((char) result));
                    break;
                case 1:
                    result = Math.round(Math.random() * 25 + 97);
                    sb.append(String.valueOf((char) result));
                    break;
                case 2:
                    sb.append(String.valueOf(new Random().nextInt(10)));
                    break;
            }
        }
        return sb.toString();
    }

    /**
     * 测试验证
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(getRandomString(5));
        System.out.println(getRandomString(10));
        System.out.println(getRandomString(15));
    }


}
