package com.xushu.circulardependencies.One;

/***
 * @Author 图灵徐庶
 * @Slogan 致敬大师，致敬未来的你
 */
public class RunMain {

    // Map  容器
    public static void main(String[] args) throws Exception {

		// 创建所有的Bean
		XuShuApplicationContext ioc = new XuShuApplicationContext();


		/* IBService bService =(IBService) ioc.getBean("bService");
		bService.say();*/


		IAService aService =(IAService) ioc.getBean("aService");
		System.out.println(aService.getClass());

	}
}