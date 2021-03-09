package com.github.bjlhx15.patterns.base.eg03action.eg05chain;

import com.github.bjlhx15.patterns.base.eg03action.eg05chain.eg02guodu.AbstractLogger;
import com.github.bjlhx15.patterns.base.eg03action.eg05chain.eg02guodu.ConsoleLogger;
import com.github.bjlhx15.patterns.base.eg03action.eg05chain.eg02guodu.ErrorLogger;
import com.github.bjlhx15.patterns.base.eg03action.eg05chain.eg02guodu.FileLogger;
import org.junit.Test;

public class AbstractLoggerTest {

    private AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.INFO);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    @Test
    public void logMessage() {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");

        System.out.println("----------");
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        System.out.println("----------");
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}