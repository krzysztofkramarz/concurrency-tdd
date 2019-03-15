package com.ja.app.Zadanie1;

/**
 * @author krzysztof.kramarz
 */
public class ExtendThreads extends Thread
{
   public ExtendThreads(String name)
   {
      super(name);
   }

   public void run()
   {

      System.out.println("Hej, nazwyam się: " + Thread.currentThread().getName());
   }
}
