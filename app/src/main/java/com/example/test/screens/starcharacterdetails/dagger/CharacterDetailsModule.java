package com.example.test.screens.starcharacterdetails.dagger;

import com.example.test.screens.starcharacterdetails.mvvm.viewmodels.StarCharacterDetailsViewModel;
import dagger.Module;
import dagger.Provides;

@Module
public class CharacterDetailsModule {
    @Provides
    StarCharacterDetailsViewModel provideStarCharacterDetailsViewModel() {
      return new StarCharacterDetailsViewModel();
    }
}