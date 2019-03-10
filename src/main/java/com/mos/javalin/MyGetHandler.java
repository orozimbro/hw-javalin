package com.mos.javalin;

import io.javalin.Context;
import io.javalin.Handler;
import org.jetbrains.annotations.NotNull;

public class MyGetHandler implements Handler {

    @Override
    public void handle(@NotNull Context context) throws Exception {
        context.result("Hello GET from MyGetHandler!");
    }
}
