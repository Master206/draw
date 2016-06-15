package master206.draw.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class DrawView extends View implements OnTouchListener
{
    Bitmap bitmap;
    Canvas bitmapCanvas;

    boolean isInitialized;
    Paint paint = new Paint();

    public DrawView(Context context)
    {
        super(context);
        setFocusable(true);
        setFocusableInTouchMode(true);

        this.setOnTouchListener(this);

        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        paint.setStyle(Style.FILL_AND_STROKE);

        isInitialized = false;
    }

    private void init()
    {
        bitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);

        bitmapCanvas = new Canvas();
        bitmapCanvas.setBitmap(bitmap);
        bitmapCanvas.drawColor(Color.WHITE);

        isInitialized = true;

    }

    @Override
    public void onDraw(Canvas canvas)
    {
        if (!isInitialized)
            init();

        canvas.drawBitmap(bitmap, 0, 0, paint);
    }

    public boolean onTouch(View view, MotionEvent event)
    {
        float startX = event.getX();
        float startY = event.getY();
        bitmapCanvas.drawCircle(event.getX(), event.getY(), 15, paint);


        invalidate();
        return true;
    }
}
