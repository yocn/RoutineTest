package testJava;

import util.LogUtil;

public class TestI {
    public void testMethod() {
        int i = 0;
        i = i + 2;
    }
    public void testMethodA() {
        int i = 0;
        i = i++;
    }
    public void testMethodB() {
        int i = 0;
        i = ++i;
    }
    public void testMethodC() {
        int i = 0;
        for(int j = 0;j<100;j++){
            i = i++;
        }
        LogUtil.d("i:"+i);
    }
}
