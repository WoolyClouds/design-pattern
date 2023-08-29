package com.wooly.designpattern._02_Structural_Patterns._02_Bridge._01_before;

import me.whiteship.designpatterns._02_structural_patterns._07_bridge._02_after.Skin;

public interface Champion extends Skin {

    void move();

    void skillQ();

    void skillW();

    void skillE();

    void skillR();

}
