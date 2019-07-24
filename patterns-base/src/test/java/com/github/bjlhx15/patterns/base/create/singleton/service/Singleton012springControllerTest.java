package com.github.bjlhx15.patterns.base.create.singleton.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration({"classpath:applicationContext-012.xml"}) //加载配置文件
//加上 @WebAppConfiguration
@WebAppConfiguration
public class Singleton012springControllerTest {


    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    //方法执行前初始化数据
    @Before
    public void setUp() throws Exception {
        //No qualifying bean of type 'org.springframework.web.context.WebApplicationContext' available
        //加上 @WebAppConfiguration
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    @Test
    public void testControlersingleton() throws Exception {

        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/test");
        mockHttpServletRequestBuilder.param("id", "1"); //要传入的参数
        ResultActions resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
        resultActions.andExpect(status().isOk());

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            fixedThreadPool.submit(() -> {
                MockHttpServletRequestBuilder mockHttpServletRequestBuilder1 = MockMvcRequestBuilders.get("/test");
                mockHttpServletRequestBuilder1.param("id", "2"); //要传入的参数
                try {
                    ResultActions resultActions1 = mockMvc.perform(mockHttpServletRequestBuilder1);
                    resultActions1.andExpect(status().isOk());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
        fixedThreadPool.shutdown();
    }

    @Test
    public void testComment() throws Exception {
        /***第一种测试方式，直接copy原方法中逻辑代码  直接输出结果*/

//        List<Comment> itemComments = commentService.findCommentByItemId("1", 1, 10);
//
//     for (Commentc:
//          itemComments) {
//
//       System.out.println(c.getContent());
//
//     }

        /**第二种方法，利用MockMVC模拟get方法访问**/
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/test");
        mockHttpServletRequestBuilder.param("id", "2"); //要传入的参数
        ResultActions resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
        resultActions.andExpect(status().isOk());


/**第三种测试方法针对get请求   Controller默认的请求方法是get*/

/*String responseString = mockMvc.perform(MockMvcRequestBuilders.get("/comment").contentType(MediaType.APPLICATION_FORM_URLENCODED).param("itemId","1")  //数据的格式   .contentType(MediaType.APPLICATION_FORM_URLENCODED)   数据的格式请求的url,请求的方法是get.contentType(MediaType.APPLICATION_FORM_URLENCODED)  //数据的格式 .param("pcode","root")         //添加参数

        ).andExpect(status().isOk())    //返回的状态是200

                .andDo(print())    //打印出请求和相应的内容

      .andReturn().getResponse().getContentAsString();

      System.out.println("哈哈哈"+responseString); //在Controller 中加 @ResponseBody 可输出要返回的内容

     }*/

/**第四种测试方法针对 Post请求    Controller注解加上 method=RequestMethod.POST  只需要将第三种方法的get 换为post即可*/

 /*String responseString = mockMvc.perform(MockMvcRequestBuilders.post("/comment").contentType(MediaType.APPLICATION_FORM_URLENCODED).param("itemId","1")  //数据的格式   .contentType(MediaType.APPLICATION_FORM_URLENCODED)   数据的格式请求的url,请求的方法是get.contentType(MediaType.APPLICATION_FORM_URLENCODED)  //数据的格式 .param("pcode","root")         //添加参数

              ).andExpect(status().isOk())    //返回的状态是200

                      .andDo(print())    //打印出请求和相应的内容

             .andReturn().getResponse().getContentAsString();

           System.out.println("哈哈哈"+responseString); //在Controller 中加 @ResponseBody 可输出要返回的内容

       */

/**传入多个参数测试get*/

 /*String responseString = mockMvc.perform(MockMvcRequestBuilders.get("/comment").contentType(MediaType.APPLICATION_FORM_URLENCODED).param("itemId","1").param("a", "hanzl")  //数据的格式   .contentType(MediaType.APPLICATION_FORM_URLENCODED)   数据的格式请求的url,请求的方法是get.contentType(MediaType.APPLICATION_FORM_URLENCODED)  //数据的格式 .param("pcode","root")         //添加参数

              ).andExpect(status().isOk())    //返回的状态是200

                      .andDo(print())    //打印出请求和相应的内容

             .andReturn().getResponse().getContentAsString();

           System.out.println("哈哈哈"+responseString);

   }*/

/**传入多个参数测试post**/

 /*String responseString = mockMvc.perform(MockMvcRequestBuilders.post("/comment5").contentType(MediaType.APPLICATION_FORM_URLENCODED).param("itemId","1").param("a", "hanzl")  //数据的格式   .contentType(MediaType.APPLICATION_FORM_URLENCODED)   数据的格式请求的url,请求的方法是get.contentType(MediaType.APPLICATION_FORM_URLENCODED)  //数据的格式 .param("pcode","root")         //添加参数

           ).andExpect(status().isOk())    //返回的状态是200

                   .andDo(print())    //打印出请求和相应的内容

         .andReturn().getResponse().getContentAsString();

        System.out.println("哈哈哈"+responseString);

       }*/


/**测试数据库添加数据测试**/

 /*String responseString = mockMvc.perform(MockMvcRequestBuilders.post("/comment6").contentType(MediaType.APPLICATION_FORM_URLENCODED).param("itemId","1").param("a", "hanzl")  //数据的格式   .contentType(MediaType.APPLICATION_FORM_URLENCODED)   数据的格式请求的url,请求的方法是get.contentType(MediaType.APPLICATION_FORM_URLENCODED)  //数据的格式 .param("pcode","root")         //添加参数

           ).andExpect(status().isOk())    //返回的状态是200

                   .andDo(print())    //打印出请求和相应的内容

         .andReturn().getResponse().getContentAsString();

        System.out.println("哈哈哈"+responseString);

       }*/

/**测试请求参数为json时**/

//        Comment c = new Comment();
//
//     c.setId("666");
//
//     c.setContentId("666");
//
//     c.setParentCommentId("6666");
//
//     c.setCustomerId("666");
//
//    String requestJson = JSONObject.toJSONString(c);
//
//    
//        String responseString = mockMvc.perform(MockMvcRequestBuilders.post("/comment7").contentType(MediaType.APPLICATION_JSON).content(requestJson)  //数据的格式   .contentType(MediaType.APPLICATION_FORM_URLENCODED)   数据的格式请求的url,请求的方法是get.contentType(MediaType.APPLICATION_FORM_URLENCODED)  //数据的格式 .param("pcode","root")         //添加参数
//
//                           ).andExpect(status().isOk())    //返回的状态是200
//
//                   .andDo(print())    //打印出请求和相应的内容
//
//         .andReturn().getResponse().getContentAsString();
//
//       System.out.println("哈哈哈" + responseString);
    }
}