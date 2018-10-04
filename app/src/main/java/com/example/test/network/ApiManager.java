package com.example.test.network;

import com.example.test.screens.starcharacterlist.mvvm.models.StarCharacterList;
import io.reactivex.Observable;
import javax.inject.Inject;

public class ApiManager {

    private Service service;

    @Inject
    ApiManager(Service service) {
        this.service = service;
    }

    public Observable<StarCharacterList> fetchData() {
        return service.fetchStarCharacterList();
    }
}
