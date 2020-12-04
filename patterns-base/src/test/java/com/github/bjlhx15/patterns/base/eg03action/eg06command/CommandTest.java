package com.github.bjlhx15.patterns.base.eg03action.eg06command;

import org.junit.Test;

public class CommandTest {

    @Test
    public void test() {
        //通过请求者（invoker）调用命令对象（command），命令对象中调用了命令具体执行者（CourseVideo）
        Receiver receiver = new Receiver("电器-电灯");
        OpenCommand openCommand = new OpenCommand(receiver);
        CloseCommand closeCommand = new CloseCommand(receiver);

        Staff staff = new Staff();
        staff.addCommand(openCommand);
        staff.addCommand(closeCommand);
        staff.executeCommands();
    }
}