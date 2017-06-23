package srjlove.com.androidpractice;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Created by Suraj on 6/23/2017.
 */

 class ImageConvertor {

     static Bitmap getRoundedCornerBitmap(Bitmap bitmap, int pixel) {

        //Setting the width and height of the Bitmap that will be returned
        // equal to the original Bitmap that needs round corners.
        final int height = bitmap.getHeight();
        final int weight = bitmap.getWidth();
        Bitmap mbitmapOutput =
                Bitmap.createBitmap(weight, height, bitmap.getConfig());

        //Creating canvas with output Bitmap for drawing
        Canvas mCanvas = new Canvas(mbitmapOutput);

        //Setting paint and rectangles.
        final Paint mPaint = new Paint();

        // for holds four Integer  Coordinate
        final Rect mRect = new Rect(0, 0, weight, height);

        // for holds four Float  Coordinate
        final RectF mRectF = new RectF(mRect);

        //AntiAliasing smooths out the edges of what is being drawn
        mPaint.setAntiAlias(true);
        mCanvas.drawARGB(0, 0, 0, 0);
        mPaint.setColor(Color.BLUE);
        mCanvas.drawRoundRect(mRectF, pixel, pixel, mPaint);

        //SetXfermode applies PorterDuffXfermode to paint.
        mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));

        mCanvas.drawBitmap(bitmap, mRect, mRect, mPaint);
        return mbitmapOutput;
    }

}
