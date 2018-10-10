package com.example.test.screens.starcharacterlist.dagger;

import com.example.test.network.ApiManager;
import com.example.test.screens.starcharacterlist.mvvm.viewmodels.StarCharacterListViewModel;
import dagger.Module;
import dagger.Provides;

@Module
public class StartCharacterListModule {
    @Provides
    public StarCharacterListViewModel provideViewModel(ApiManager apiManager) {
        return new StarCharacterListViewModel(apiManager);
    }
}
