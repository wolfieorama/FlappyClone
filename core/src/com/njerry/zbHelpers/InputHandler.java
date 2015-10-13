package com.njerry.zbHelpers;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;

/**
 * Created by njerry on 7/27/15.
 */
public class InputHandler implements InputProcessor {
    private com.njerry.gameobjects.Bird myBird;
    private com.njerry.gameworld.GameWorld myWorld;

//    private List<SimpleButton> menuButtons;
//    private SimpleButton playButton;
//
//    private float scaleFactorX;
//    private float scaleFactorY;

    public InputHandler(com.njerry.gameworld.GameWorld myWorld) {
        this.myWorld = myWorld;
        myBird = myWorld.getBird();

        int midPointY = myWorld.getMidPointY();

//        this.scaleFactorX = scaleFactorX;
//        this.scaleFactorY = scaleFactorY;

//        menuButtons = new ArrayList<SimpleButton>();
//        playButton = new SimpleButton(136 / 2 - (AssetLoader.playButtonUp.getRegionWidth() / 2), midPointY + 50, 29, 16, AssetLoader.playButtonUp, AssetLoader.playButtonDown);
//        menuButtons.add(playButton);
    }

    @Override
    public boolean keyDown(int keycode) {
        // Can now use Space Bar to play the game
        if (keycode == Input.Keys.SPACE) {

            if (myWorld.isMenu()) {
                myWorld.ready();
            } else if (myWorld.isReady()) {
                myWorld.start();
            }

            myBird.onClick();

            if (myWorld.isGameOver() || myWorld.isHighScore()) {
                myWorld.restart();
            }

        }

        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
//        screenX = scaleX(screenX);
//        screenY = scaleY(screenY);
//        System.out.println(screenX + " " + screenY);
//        if (myWorld.isMenu()) {
//            playButton.isTouchDown(screenX, screenY);
//        }
//        else
        if (myWorld.isReady()) {
            myWorld.start();
        }

        myBird.onClick();

        if (myWorld.isGameOver() || myWorld.isHighScore()) {
            //reset all variables and go to GameState.READ
            myWorld.restart();
        }

        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
//        screenX = scaleX(screenX);
//        screenY = scaleY(screenY);

        if (myWorld.isMenu()) {
                myWorld.ready();
                return true;
        }

        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }

//    private int scaleX(int screenX) {
//        return (int) (screenX / scaleFactorX);
//    }
//
//    private int scaleY(int screenY) {
//        return (int) (screenY / scaleFactorY);
//    }
//
//    public List<SimpleButton> getMenuButtons() {
//        return menuButtons;
//    }
}