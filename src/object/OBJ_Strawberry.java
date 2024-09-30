package object;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Strawberry extends SuperObject{

    GamePanel gp;

    public OBJ_Strawberry(GamePanel gp) {

        this.gp = gp;

        name = "Strawberry";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/strawberry0.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);

        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
