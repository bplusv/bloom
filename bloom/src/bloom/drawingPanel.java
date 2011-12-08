/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package bloom;

import java.awt.*;
import java.awt.Graphics;


/**
 *
 * @author lu
 */



class drawingPanel extends Canvas {

    public drawingPanel(Color faceColor) {
        setForeground(faceColor);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300,300);
    }

   /*
    * Paint when the AWT tells us to...
    */
    public void paint(Graphics g) {
        // Dynamically calculate size information
        // (the canvas may have been resized externally...)
        Dimension size = getSize();
        int d = Math.min(size.width, size.height); // diameter
        int ed = d/20; // eye diameter
        int x = (size.width - d)/2;
        int y = (size.height - d)/2;

        // draw head (color already set to foreground)
        g.fillOval(x, y, d, d);
        g.setColor(Color.black);
        g.drawOval(x, y, d, d);

        // draw eyes
        g.fillOval(x+d/3-(ed/2), y+d/3-(ed/2), ed, ed);
        g.fillOval(x+(2*(d/3))-(ed/2), y+d/3-(ed/2), ed, ed);

        //draw mouth
        g.drawArc(x+d/4, y+2*(d/5), d/2, d/3, 0, -180);
    }
}
