package com.palvair.scala.basics {

    class HelloWorld {
        def sayWelcome() : Unit = {
            println("Hello Widdy");
        }
    }

    object HelloWorld extends App {
        val helloWorld = new HelloWorld
        helloWorld.sayWelcome();
    }


}