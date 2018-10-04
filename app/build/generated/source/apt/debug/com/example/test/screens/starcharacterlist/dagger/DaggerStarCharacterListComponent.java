// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.example.test.screens.starcharacterlist.dagger;

import com.example.test.dagger.components.ApiManagerComponent;
import com.example.test.screens.starcharacterlist.mvvm.viewmodels.StarCharacterListViewModel;
import com.example.test.screens.starcharacterlist.mvvm.views.StarCharacterListActivity;
import com.example.test.screens.starcharacterlist.mvvm.views.StarCharacterListActivity_MembersInjector;
import dagger.internal.Preconditions;

public final class DaggerStarCharacterListComponent implements StarCharacterListComponent {
  private ApiManagerComponent apiManagerComponent;

  private StartCharacterListModule startCharacterListModule;

  private DaggerStarCharacterListComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  private StarCharacterListViewModel getStarCharacterListViewModel() {
    return Preconditions.checkNotNull(
        startCharacterListModule.provideViewModel(
            Preconditions.checkNotNull(
                apiManagerComponent.apiManager(),
                "Cannot return null from a non-@Nullable component method")),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.apiManagerComponent = builder.apiManagerComponent;
    this.startCharacterListModule = builder.startCharacterListModule;
  }

  @Override
  public void inject(StarCharacterListActivity activity) {
    injectStarCharacterListActivity(activity);
  }

  private StarCharacterListActivity injectStarCharacterListActivity(
      StarCharacterListActivity instance) {
    StarCharacterListActivity_MembersInjector.injectViewModel(
        instance, getStarCharacterListViewModel());
    return instance;
  }

  public static final class Builder {
    private StartCharacterListModule startCharacterListModule;

    private ApiManagerComponent apiManagerComponent;

    private Builder() {}

    public StarCharacterListComponent build() {
      if (startCharacterListModule == null) {
        this.startCharacterListModule = new StartCharacterListModule();
      }
      if (apiManagerComponent == null) {
        throw new IllegalStateException(
            ApiManagerComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerStarCharacterListComponent(this);
    }

    public Builder startCharacterListModule(StartCharacterListModule startCharacterListModule) {
      this.startCharacterListModule = Preconditions.checkNotNull(startCharacterListModule);
      return this;
    }

    public Builder apiManagerComponent(ApiManagerComponent apiManagerComponent) {
      this.apiManagerComponent = Preconditions.checkNotNull(apiManagerComponent);
      return this;
    }
  }
}
