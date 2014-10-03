/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

/**
 *
 * @author kyle
 */
public class ButtonGame
{

    private static ButtonGame buttonGame = null;

    private boolean fire = false;
    private boolean feedIn = false;
    private boolean feedOut = false;
    private boolean feederDeployed = false;

    public static ButtonGame getInstance()
    {
        if (buttonGame == null)
        {
            buttonGame = new ButtonGame();
        }
        return buttonGame;
    }

    private ButtonGame()
    {
    }

    /**
     * Update the value of the buttons. Must be called <b>every</b> loop.
     *
     * @param joyLeft
     */
    public void updateButtons(Joystick467 joyLeft)
    {
        feedIn = (joyLeft.getHatY() > 0.5);
        feedOut = (joyLeft.getHatY() < -0.5);
        fire = joyLeft.getFlap();
        feederDeployed = joyLeft.buttonDown(Joystick467.TRIGGER);
    }
    
    public boolean getFire()
    {
        return fire;
    }
    
    public boolean getFeedIn()
    {
        return feedIn;
    }
    
    public boolean getFeedOut()
    {
        return feedOut;
    }    
    
    public boolean getFeedDeployed()
    {
        return feederDeployed;
    }
}
