package com.cpxiao.drawing.mode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * @author cpxiao on 2017/10/27.
 */

public class DrawingPath {
    private Path mPath;
    private int mColor;

    private DrawingPath() {
    }

    public DrawingPath(Path path, int color) {
        mPath = path;
        mColor = color;
    }

    public void setPath(Path path) {
        mPath = path;
    }

    public void setColor(int color) {
        mColor = color;
    }

    public void onDraw(Canvas canvas, Paint paint) {
        paint.setColor(mColor);
        canvas.drawPath(mPath, paint);
    }
}
