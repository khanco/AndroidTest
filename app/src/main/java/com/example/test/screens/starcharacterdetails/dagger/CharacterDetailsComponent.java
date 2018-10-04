package com.example.test.screens.starcharacterdetails.dagger;

import com.example.test.screens.starcharacterdetails.mvvm.views.StarCharacterDetailsActivity;
import dagger.Component;

@Component(modules = {CharacterDetailsModule.class})
public interface CharacterDetailsComponent {
    void inject(StarCharacterDetailsActivity activity);
}
