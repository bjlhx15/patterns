package com.github.bjlhx15.patterns.base.eg03action.eg05chain.eg03nodecontroller;

/**
 * @author lihongxu6
 * @version 1.0
 * @className HandlerContext
 * @description TODO
 * @date 2020-12-04 17:24
 */
public class HandlerContext {
    HandlerContext prev;
    HandlerContext next;
    Handler handler;

    private Task task;

    public void fireTaskReceived(Request request) {
        invokeTaskReceived(next(), request);
    }

    /**
     * 处理接收到任务的事件
     */
    static void invokeTaskReceived(HandlerContext ctx, Request request) {
        if (ctx != null) {
            try {
                ctx.handler().receiveTask(ctx, request);
            } catch (Throwable e) {
                ctx.handler().exceptionCaught(ctx, e);
            }
        }
    }

    public void fireTaskFiltered(Task task) {
        invokeTaskFiltered(next(), task);
    }

    /**
     * 处理任务过滤事件
     */
    static void invokeTaskFiltered(HandlerContext ctx, Task task) {
        if (null != ctx) {
            try {
                ctx.handler().filterTask(ctx, task);
            } catch (Throwable e) {
                ctx.handler().exceptionCaught(ctx, e);
            }
        }
    }

    public void fireTaskExecuted(Task task) {
        invokeTaskExecuted(next(), task);
    }

    /**
     * 处理执行任务事件
     */
    static void invokeTaskExecuted(HandlerContext ctx, Task task) {
        if (null != ctx) {
            try {
                ctx.handler().executeTask(ctx, task);
            } catch (Exception e) {
                ctx.handler().exceptionCaught(ctx, e);
            }
        }
    }

    public void fireAfterCompletion(HandlerContext ctx) {
        invokeAfterCompletion(next());
    }

    static void invokeAfterCompletion(HandlerContext ctx) {
        if (null != ctx) {
            ctx.handler().afterCompletion(ctx);
        }
    }

    private HandlerContext next() {
        return next;
    }

    private Handler handler() {
        return handler;
    }

}
