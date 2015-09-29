package br.com.grupointegrado.flappybird;

import com.badlogic.gdx.Screen;

/**
 * Created by Rebeca on 28/09/2015.
 */
public abstract class TelaBase implements Screen {

    protected MainGame game;

    public TelaBase (MainGame game){
        this.game = game;
    }

    @Override
    public void hide() {
        dispose();
    }

}
