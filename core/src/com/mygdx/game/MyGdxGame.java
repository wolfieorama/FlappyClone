package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mygdx.screens.SplashScreen;
import com.mygdx.zbHelpers.AssetLoader;

public class MyGdxGame extends Game {

	@Override
	public void create() {
		Gdx.app.log("MyGdxGame", "created");
        AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
}
