package com.ja.app.Zadanie1;

/**
 * @author krzysztof.kramarz
 */
class ImplementRunnable implements Runnable
{
   @SuppressWarnings("UseOfSystemOutOrSystemErr")
   @Override
   public void run()
   {

      System.out.println("Hej, nazwyam się: " + Thread.currentThread().getName());

   }
}
