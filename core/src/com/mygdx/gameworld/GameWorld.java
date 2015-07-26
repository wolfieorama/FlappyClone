package com.mygdx.gameworld;

import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.math.Rectangle;
/**
 * Created by njerry on 7/27/15.
 */
public class GameWorld {

    private com.badlogic.gdx.math.Rectangle rect = new com.badlogic.gdx.math.Rectangle(0, 0, 17, 12);

    public void update (float delta) {
        Gdx.app.log("GameWorld", "update");
        rect.x++;
        if (rect.x > 137) {
            rect.x = 0;
        }
    }

    public Rectangle getRect() {
        return rect;
    }
}
