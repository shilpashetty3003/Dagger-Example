package com.example.daggerexample.dagger_retrofit_room.di

import androidx.lifecycle.ViewModel
import com.example.daggerexample.dagger_retrofit_room.viewmodels.FakerViewModel
import com.example.daggerexample.dagger_retrofit_room.viewmodels.UserFakeModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {

    @Binds
    @ClassKey(FakerViewModel::class)
    @IntoMap
    abstract fun getFakerViewModel(fakerViewModel: FakerViewModel):ViewModel


    @Binds
    @ClassKey(UserFakeModel::class)
    @IntoMap
    abstract fun getUserFakeModel(userFakeModel: UserFakeModel):ViewModel


}