package com.example.test.dagger.components;

import com.example.test.dagger.modules.ApiMangerModule;
import com.example.test.network.ApiManager;
import dagger.Component;

@Component (modules = { ApiMangerModule.class })
public interface ApiManagerComponent {
    ApiManager apiManager();
}
