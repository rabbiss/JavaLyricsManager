
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import javax.swing.JPanel;


/**
 *
 * @author Otto
 */
public class TextAndImage extends JPanel {
    
    Image image;
    String text;

    /**
     * Sets the image and text for MainWindow.
     * @param image to be drawn into the component.
     */
    public void setImage(Image image) {
        this.image = image;
    }
   
    
    public void setText(String text) {
        this.text = text;
    }
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g.create();
        
        g2.setFont(new Font("TimesRoman", Font.BOLD, 16));
        if (image != null) {
            AffineTransform imageAdjust = AffineTransform.getScaleInstance((float)getWidth()/image.getWidth(this), (float)getHeight()/image.getHeight(this));
            g2.drawImage(image, imageAdjust, this);
        }
        if (text != null)
            g2.drawString(text, 5, 50);
        repaint();
    }
}
