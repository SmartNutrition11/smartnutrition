/**Setup Retrofit for use with Food API ...*/
package edu.uc.mille5bm.smartnutrition.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClientInstance {
    private var retrofit: Retrofit? = null
    private const val BASE_URL = ""

    val retrofitInstance: Retrofit?
        get() {
            // Has this object been created yet?
            if (retrofit == null) {
                // If not, then create it
                retrofit = retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            // Object created or already exists, return it
            return retrofit
        }
}