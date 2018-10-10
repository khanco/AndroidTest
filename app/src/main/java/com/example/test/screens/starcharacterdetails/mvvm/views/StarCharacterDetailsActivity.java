package com.example.test.screens.starcharacterdetails.mvvm.views;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.example.test.R;
import com.example.test.databinding.ActivityStarCharacterDetailsBinding;
import com.example.test.screens.starcharacterdetails.dagger.CharacterDetailsModule;
import com.example.test.screens.starcharacterdetails.dagger.DaggerCharacterDetailsComponent;
import com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter;
import com.example.test.screens.starcharacterdetails.mvvm.viewmodels.StarCharacterDetailsViewModel;
import com.example.test.utils.Constants;
import javax.inject.Inject;
import org.parceler.Parcels;

public class StarCharacterDetailsActivity extends AppCompatActivity {

    @Inject
    public StarCharacterDetailsViewModel viewModel;
    private StarCharacter character;

    public static Intent makeIntent(Context context, StarCharacter character) {
        Intent intent = new Intent(context, StarCharacterDetailsActivity.class);
        intent.putExtra(Constants.CHARACTER_DATA, Parcels.wrap(character));
        return intent;
    }

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDagger();
        initIntentData();
        initBinding();
    }

    private void initBinding() {
        ActivityStarCharacterDetailsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_star_character_details);
        binding.setModel(character);
        binding.setViewModel(viewModel);
    }

    private void initIntentData() {
        character = Parcels.unwrap(getIntent().getExtras().getParcelable(Constants.CHARACTER_DATA));
    }

    private void initDagger() {
        DaggerCharacterDetailsComponent.builder()
                .characterDetailsModule(new CharacterDetailsModule())
                .build()
                .inject(this);
    }
}
