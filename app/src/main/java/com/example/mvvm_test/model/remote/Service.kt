package com.example.mvvm_test.model.remote

import com.example.mvvm_test.model.CocktailSearch
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/*
1. - Retrofit dependencies.
2. - Create Retrofit Interface (Service)
3. - In the service file, create the HTTP verbs
4. - Create the retrofit object. (singleton)
 */

interface Service{
    @GET(ENDPOINT_SEARCH)
    fun queryCocktailByName(
        @Query(ARG_SEARCH) searchInput: String
    ) : Call<CocktailSearch>

    @GET(ENDPOINT_SEARCH)
    fun queryCocktailDetails(
        @Query(ARG_SEARCH) cocktailID: String
    ) : Call<CocktailSearch>
}