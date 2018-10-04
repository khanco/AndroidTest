package com.example.test.screens.starcharacterlist.dagger;

import com.example.test.dagger.components.ApiManagerComponent;
import com.example.test.screens.starcharacterlist.mvvm.views.StarCharacterListActivity;
import dagger.Component;

@Component(dependencies = {ApiManagerComponent.class}, modules = {StartCharacterListModule.class})
public interface StarCharacterListComponent {
    void inject(StarCharacterListActivity activity);
}
