UiApplication.getUiApplication().invokeLater(new Runnable() {
                                                public void run() {
                                                    pushScreen(new MyScreen()); 
                                                }
                                             }, 
                                             200   /* delay */, 
                                             false /* repeat = no */);