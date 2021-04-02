/**
 * Interface for communicating with Food API via Retrofit to get Actor data
 *
 *
 */

package edu.uc.mille5bm.smartnutrition.dao

import edu.uc.mille5bm.smartnutrition.dto.Exercise
import retrofit2.Call
import retrofit2.http.GET

interface IExerciseDAO {

    @GET("/julianshapiro/julian.com/blob/master/muscle/workout.json")
    fun getAllExercises(): Call<ArrayList<Exercise>>
}