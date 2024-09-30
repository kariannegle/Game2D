package entity;

import main.GamePanel;

import java.util.Random;


public class NPC_BadtzMaru extends Entity{


    public NPC_BadtzMaru(GamePanel gp){
        super(gp);

        direction = "down";
        speed = 1;

        getImage();
        setDialogue();
    }
    public void getImage(){

        up1 = setup("/npc/badtz-maru-up1");
        up2 = setup("/npc/badtz-maru-up2");
        down1 = setup("/npc/badtz-maru-down1");
        down2 = setup("/npc/badtz-maru-down2");
        left1 = setup("/npc/badtz-maru-left1");
        left2 = setup("/npc/badtz-maru-left2");
        right1 = setup("/npc/badtz-maru-right1");
        right2 = setup("/npc/badtz-maru-right2");
    }
    public void setDialogue() {

        dialogues[0] = "Oh, hi!";
        dialogues[1] = "I am the boss of everything!";
        dialogues[2] = "However,\nI did manage to loose \nPochi's toy today...";
        dialogues[3] = "Do you think \nyou can help me find it?";
    }
    public void setAction () {

        actionLockCounter ++;

        if (actionLockCounter == 120){
            Random random = new Random();
            int i = random.nextInt(100+1); // pick up number from 1 to 100
            if (i <= 25) {
                direction = "up";
            }
            if (i > 25 && i <= 50) {
                direction = "down";
            }
            if (i > 50 && i <= 75) {
                direction = "left";
            }
            if (i > 75 && i <= 100) {
                direction = "right";
            }

            actionLockCounter = 0;

        }

    }
    public void speak() {

        // Specific character stuff

        super.speak();
    }

}
