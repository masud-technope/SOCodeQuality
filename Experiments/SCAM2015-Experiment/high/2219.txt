public class MyApp extends UiApplication
{
   /**
    * Entry point for application
    * @param args Command line arguments (not used)
    */ 
   public static void main(String[] args)
   {
      // Create a new instance of the application and make the currently
      // running thread the application's event dispatch thread.
      MyApp theApp = new MyApp();       
      theApp.enterEventDispatcher();
   }

   public MyApp()
   {        
      // Push a screen onto the UI stack for rendering.
      final SplashScreen splashScreen = new SplashScreen();
      pushScreen(splashScreen); 

      UiApplication.getUiApplication().invokeLater(new Runnable() {
                                                      public void run() {
                                                          pushScreen(new MyScreen()); 
                                                          popScreen(splashScreen);
                                                      }
                                                   }, 
                                                   10*1000   /* delay in msec */, 
                                                   false /* repeat = no */);

   }