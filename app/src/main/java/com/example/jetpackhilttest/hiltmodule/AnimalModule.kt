package com.example.jetpackhilttest.hiltmodule

import com.example.jetpackhilttest.model.IAnimal
import com.example.jetpackhilttest.model.Monkey
import com.example.jetpackhilttest.model.Sheep
import com.example.jetpackhilttest.model.Tiger
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class bindMonkeyAnimal

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class bindTigerAnimal

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class bindSheepAnimal

@Module
@InstallIn(ActivityComponent::class)
abstract class AnimalModule {

    @bindMonkeyAnimal
    @Binds
    abstract fun bindMonkey(monkey: Monkey):IAnimal

    @bindTigerAnimal
    @Binds
    abstract fun bindTiger(tiger: Tiger):IAnimal

    @bindSheepAnimal
    @Binds
    abstract fun bindSheep(sheep: Sheep):IAnimal
}