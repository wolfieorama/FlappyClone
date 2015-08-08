package com.mygdx.gameworld;

import com.mygdx.gameobjects.Bird;
import com.mygdx.gameobjects.Grass;
import com.mygdx.gameobjects.Pipe;
import com.mygdx.gameobjects.ScrollHandler;

/**
 * Created by njerry on 7/27/15.
 */
public class GameWorld {
    private Bird bird;
    private ScrollHandler scroller;

    public GameWorld (int midPointY) {
        bird = new Bird(33, midPointY -5, 17, 12);

        scroller = new ScrollHandler(midPointY - 66);
    }

    public void update (float delta) {
        bird.update(delta);
        scroller.update(delta);
    }

    public Bird getBird() {
        return bird;
    }

    public ScrollHandler getScroller() {
        return scroller;
    }
}


