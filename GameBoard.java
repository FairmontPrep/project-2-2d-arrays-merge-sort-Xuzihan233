import javax.swing.*;
import java.awt.*;

public class PixelFriedEgg extends JPanel {
    private static final int PIXEL_SIZE = 20; // Size of each pixel block

    // 8x8 pixel array representing the image
    private final Color[][] pixels = {
        {Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK},
        {Color.BLACK, new Color(245, 222, 179), Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, new Color(139, 69, 19), Color.BLACK},
        {Color.BLACK, Color.WHITE, new Color(255, 200, 100), new Color(255, 165, 0), new Color(255, 165, 0), Color.WHITE, Color.BLACK, Color.BLACK},
        {Color.BLACK, Color.WHITE, new Color(255, 165, 0), new Color(255, 140, 0), new Color(255, 140, 0), new Color(255, 165, 0), Color.WHITE, Color.BLACK},
        {Color.BLACK, Color.WHITE, new Color(255, 200, 100), new Color(255, 165, 0), new Color(255, 165, 0), Color.WHITE, new Color(139, 69, 19), Color.BLACK},
        {Color.BLACK, new Color(245, 222, 179), Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.BLACK, Color.BLACK},
        {Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK},
        {Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK},
    };

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw each pixel
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[row].length; col++) {
                g2d.setColor(pixels[row][col]);
                g2d.fillRect(col * PIXEL_SIZE, row * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("8x8 Pixel Fried Egg");
        PixelFriedEgg panel = new PixelFriedEgg();

        frame.add(panel);
        frame.setSize(8 * PIXEL_SIZE, 8 * PIXEL_SIZE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
