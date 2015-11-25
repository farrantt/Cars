package com.example.tom.cars;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Description here.
 *
 * @author 630022892
 * @since 24/11/2015
 * @version 1.0
 */
public class GoodObstacle extends Obstacle {

    public GoodObstacle(Paint fg) {
        this();
        this.fg = fg;
    }

    public GoodObstacle() {
        s = new Vector2d();
        v = new Vector2d();
        this.type = ObstacleType.GOOD;
        super.spawn();
    }

    /**
     * Good obstacles are circular.
     *
     * @param c to draw the obstacle on.
     */
    @Override
    public void draw(Canvas c) {
        c.drawCircle(s.x, s.y, rad, fg);
    }
}
