package com.example.test.screens.starcharacterlist.mvvm.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.databinding.ObservableBoolean;
import com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter;
import com.example.test.screens.starcharacterlist.mvvm.models.StarCharacterList;
import com.example.test.network.ApiManager;
import com.example.test.utils.UtilMethods;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

public class StarCharacterListViewModel {

    private MutableLiveData<List<StarCharacter>> data = new MutableLiveData<>();
    private ApiManager apiManager;

    public ObservableBoolean showLoader = new ObservableBoolean(true);
    public ObservableBoolean connectedToInternet = new ObservableBoolean(true);
    public ObservableBoolean success = new ObservableBoolean(true);

    public StarCharacterListViewModel(ApiManager apiManager) {
        this.apiManager = apiManager;
    }
    public LiveData<List<StarCharacter>> getData() {
        return data;
    }

    public void fetchData() {

        if (!UtilMethods.getInstance().isNetworkAvailable()) {
            connectedToInternet.set(false);
            return;
        }

        showLoader.set(true);
        connectedToInternet.set(true);

        apiManager.fetchData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableObserver<StarCharacterList>() {
                    @Override
                    public void onNext(StarCharacterList starCharacterList) {
                        success.set(true);
                        showLoader.set(false);
                        data.postValue(starCharacterList.getStarCharacters());
                    }

                    @Override
                    public void onError(Throwable e) {
                        success.set(false);
                        showLoader.set(false);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
