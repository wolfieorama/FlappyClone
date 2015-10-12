package com.njerry.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.njerry.zbHelpers.AssetLoader;

public class MyGdxGame extends Game {

	@Override
	public void create() {
		Gdx.app.log("MyGdxGame", "created");
        AssetLoader.load();
		setScreen(new com.njerry.screens.SplashScreen(this));
	}

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
}
