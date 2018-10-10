package com.example.test.screens.starcharacterlist.mvvm.views;

import android.arch.lifecycle.Observer;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import com.example.test.R;
import com.example.test.databinding.ActivityStarCharacterListBinding;
import com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter;
import com.example.test.screens.starcharacterdetails.mvvm.views.StarCharacterDetailsActivity;
import com.example.test.screens.starcharacterlist.dagger.DaggerStarCharacterListComponent;
import com.example.test.screens.starcharacterlist.dagger.StartCharacterListModule;
import com.example.test.screens.starcharacterlist.mvvm.viewmodels.StarCharacterListViewModel;
import com.example.test.utils.MyApp;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class StarCharacterListActivity extends AppCompatActivity
        implements StarCharacterAdapter.IStarCharacterListCallback {

    RecyclerView recyclerView;
    List<StarCharacter> list = new ArrayList<>();
    public @Inject StarCharacterListViewModel viewModel;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDagger();
        initBinding();
        initUI();
        initObservation();
        fetchData();
    }

    private void fetchData() {
        viewModel.fetchData();
    }

    private void initObservation() {
        viewModel.getData().observe(this, new Observer<List<StarCharacter>>() {
            @Override public void onChanged(@Nullable List<StarCharacter> starCharacters) {
                list.clear();
                assert starCharacters != null;
                list.addAll(starCharacters);
                StarCharacterAdapter adapter = new StarCharacterAdapter(list);
                adapter.setInterface(StarCharacterListActivity.this);
                recyclerView.setAdapter(adapter);
            }
        });
    }

    private void initUI() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void initBinding() {
        ActivityStarCharacterListBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_star_character_list);
        binding.setViewModel(viewModel);
    }

    private void initDagger() {
        DaggerStarCharacterListComponent.builder()
                .apiManagerComponent(((MyApp) getApplicationContext()).getApiManagerComponent())
                .startCharacterListModule(new StartCharacterListModule())
                .build()
                .inject(this);
    }

    @Override
    public void onStarCharacterSelected(StarCharacter character) {
        startActivity(StarCharacterDetailsActivity.makeIntent(getApplicationContext(), character));
    }
}
