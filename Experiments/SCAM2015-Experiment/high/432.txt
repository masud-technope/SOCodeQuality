import java.applet.Applet;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;

import java.io.IOException;
import java.net.*;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class LoadImageApp extends Applet
{
  private BufferedImage img;
  private final String imageURL = "http://www.google.com/intl/en_ALL/images/logo.gif";

  public void init()
  {
    loadImage();
  }

  public void paint(Graphics g)
  {
    if (null != img) { g.drawImage(img, 0, 0, null); }
  }

  public void loadImage()
  {
    URL url = (URL) AccessController.doPrivileged(new PrivilegedAction()
    {
      public Object run()
      {
        try
        {
            return new URL(imageURL);
        }
        catch (Exception e) { e.printStackTrace(); }
        return null;
      }
    });

    try {
        img = ImageIO.read(url);
    } catch (IOException e) {
    e.printStackTrace();
    }

  }
}