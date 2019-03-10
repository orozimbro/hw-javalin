package com.mos.javalin;

import io.javalin.Javalin;

/**
 * Hello world from Javalin!
 *
 */
public class App 
{
    public static void main( String[] args ){

        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result("Hello World from Javalin!"));
        app.get("/hello-get", new MyGetHandler());
        //JSON responses
        app.get("/json", ctx -> ctx.json("Hello Json"));
    }
}
