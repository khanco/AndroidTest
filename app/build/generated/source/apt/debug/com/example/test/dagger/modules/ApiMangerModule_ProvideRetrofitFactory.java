// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.example.test.dagger.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import retrofit2.Retrofit;

public final class ApiMangerModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final ApiMangerModule module;

  public ApiMangerModule_ProvideRetrofitFactory(ApiMangerModule module) {
    this.module = module;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.provideRetrofit(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Retrofit> create(ApiMangerModule module) {
    return new ApiMangerModule_ProvideRetrofitFactory(module);
  }

  public static Retrofit proxyProvideRetrofit(ApiMangerModule instance) {
    return instance.provideRetrofit();
  }
}