package com.ja.app.Zadanie1;

/**
 * @author krzysztof.kramarz
 */
class FunWithThreads
{

   public static void main(String[] args)
   {
      ExtendThreads extendThreads = new ExtendThreads("ExtendThreads");
      extendThreads.start();

      ImplementRunnable implementRunnable = new ImplementRunnable();
      Thread threadFromRunnable = new Thread(implementRunnable, "ImplementRunnable");
      threadFromRunnable.start();

      Thread threadAnonymusClass = new Thread(new Runnable()
      {
         @Override
         public void run()
         {
            System.out.println("Hej, nazwyam się: " + Thread.currentThread().getName());
         }
      }, "threadAnonymusClass");

      threadAnonymusClass.start();

      Thread lambdaThreadClass = new Thread(() ->
      {
         System.out.println("Hej, nazwyam się: " + Thread.currentThread().getName());
      }, "lambdaThreadClass");

      lambdaThreadClass.start();

   }

}
