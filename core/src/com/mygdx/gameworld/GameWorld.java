package com.mygdx.gameworld;

import com.mygdx.gameobjects.Bird;
import com.mygdx.gameobjects.ScrollHandler;
import com.mygdx.zbHelpers.AssetLoader;

/**
 * Created by njerry on 7/27/15.
 */
public class GameWorld {
    private Bird bird;
    private ScrollHandler scroller;

    private boolean isAlive = true;

    public GameWorld (int midPointY) {
        bird = new Bird(33, midPointY -5, 17, 12);

        scroller = new ScrollHandler(midPointY + 66);
    }

    public void update (float delta) {
        bird.update(delta);
        scroller.update(delta);

        // Clean up on game over
        if (isAlive && scroller.collides(bird)) {
            scroller.stop();
            AssetLoader.dead.play();
            isAlive = false;
        }
    }

    public Bird getBird() {
        return bird;
    }

    public ScrollHandler getScroller() {
        return scroller;
    }
}


