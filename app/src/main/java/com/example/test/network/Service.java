package com.example.test.network;

import com.example.test.screens.starcharacterlist.mvvm.models.StarCharacterList;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Service {

    @GET(Urls.STAR_WAR_CHARACTER_LIST_URL)
    Observable<StarCharacterList> fetchStarCharacterList();
}
