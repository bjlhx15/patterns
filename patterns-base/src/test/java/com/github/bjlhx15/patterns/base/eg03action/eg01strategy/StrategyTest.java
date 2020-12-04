package com.github.bjlhx15.patterns.base.eg03action.eg01strategy;

import org.junit.Test;

public class StrategyTest {
    @Test
    public void testold(){
        Strategy md5 = new MD5Strategy();
        md5.encrypt();

        Strategy rsa = new RSAStrategy();
        rsa.encrypt();
    }
    @Test
    public void testStrategy(){
        Context md5 = new Context(new MD5Strategy());
        md5.encrypt();

        Context rsa = new Context(new RSAStrategy());
        rsa.encrypt();
    }

    @Test
    public void testStrategyIf(){
        Context context=null;
        String encryptType = "MD5";

        if(encryptType.equals("MD5")){
            context=new Context(new MD5Strategy());
        }else if(encryptType.equals("RSA")){
            context=new Context(new RSAStrategy());
        }else{
            context=new Context(new EmptyStrategy());
        }
        context.encrypt();
    }

    @Test
    public void testStrategyFactory(){
        /** 我们来创建一个StrategyKey */
        String promotionKey = "MD5";

        Context context = new Context(StrategyFactory.getPromotionStrategy(promotionKey));
        context.encrypt();
    }
}