package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mygdx.screens.GameScreen;
import com.mygdx.zbHelpers.AssetLoader;

public class MyGdxGame extends Game {

	@Override
	public void create() {
		Gdx.app.log("MyGdxGame", "created");
        AssetLoader.load();
		setScreen(new GameScreen());
	}

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
}
