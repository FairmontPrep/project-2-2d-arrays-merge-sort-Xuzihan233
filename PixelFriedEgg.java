import javax.swing.*;
import java.awt.*;

public class PixelFriedEgg extends JPanel {
    private static final int PIXEL_SIZE = 20; 


    private static final Color BLACK = Color.BLACK; 
    private static final Color WHITE = Color.WHITE; 
    private static final Color BROWN = new Color(139, 69, 19); 
    private static final Color LIGHT_YELLOW = new Color(255, 215, 0); 
    private static final Color DARK_YELLOW = new Color(255, 165, 0); 
    private static final Color TAN = new Color(245, 222, 179); 


    private final Color[][] pixels = {
        {BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK},
        {BLACK, TAN, WHITE, WHITE, WHITE, WHITE, BROWN, BLACK},
        {BLACK, WHITE, LIGHT_YELLOW, DARK_YELLOW, DARK_YELLOW, WHITE, BLACK, BLACK},
        {BLACK, WHITE, DARK_YELLOW, DARK_YELLOW, DARK_YELLOW, DARK_YELLOW, WHITE, BLACK},
        {BLACK, WHITE, LIGHT_YELLOW, DARK_YELLOW, DARK_YELLOW, WHITE, BROWN, BLACK},
        {BLACK, TAN, WHITE, WHITE, WHITE, WHITE, BLACK, BLACK},
        {BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK},
        {BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK},
    };

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

 
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
        frame.setSize(8 * PIXEL_SIZE + 16, 8 * PIXEL_SIZE + 39); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

