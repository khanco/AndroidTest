// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.example.test.screens.starcharacterlist.mvvm.views;

import com.example.test.screens.starcharacterlist.mvvm.viewmodels.StarCharacterListViewModel;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class StarCharacterListActivity_MembersInjector
    implements MembersInjector<StarCharacterListActivity> {
  private final Provider<StarCharacterListViewModel> viewModelProvider;

  public StarCharacterListActivity_MembersInjector(
      Provider<StarCharacterListViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<StarCharacterListActivity> create(
      Provider<StarCharacterListViewModel> viewModelProvider) {
    return new StarCharacterListActivity_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(StarCharacterListActivity instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  public static void injectViewModel(
      StarCharacterListActivity instance, StarCharacterListViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}