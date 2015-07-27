package com.mygdx.gameworld;

import com.mygdx.gameobjects.Bird;

/**
 * Created by njerry on 7/27/15.
 */
public class GameWorld {
    private Bird bird;

    public GameWorld (int midPointY) {
        bird = new Bird(33, midPointY -5, 17, 12);
    }

    public void update (float delta) {
        bird.update(delta);
    }

    public Bird getBird() {
        return bird;
    }
}
