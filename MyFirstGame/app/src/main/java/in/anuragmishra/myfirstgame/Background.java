package in.anuragmishra.myfirstgame;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by anuragmishra on 17/11/16.
 */

public class Background {

    private Bitmap image;
    private int x, y, dx;

    public Background(Bitmap res)
    {
        image = res;
    }
    public void update()
    {
        x+=dx;
        if(x<-GamePanel.WIDTH){//when the current background image goes beyond the gamepanel width
            x=0;
        }
    }
    public void draw(Canvas canvas)
    {
        canvas.drawBitmap(image, x, y,null);//this starts darwing the canvas, if we set x, y it moves the background to that position
        if(x<0)
        {
            canvas.drawBitmap(image, x+GamePanel.WIDTH, y, null);
            //this start drawing the next background when the first image starts moving towards left
        }
    }
    public void setVector(int dx)
    {
        this.dx = dx;
    }
}