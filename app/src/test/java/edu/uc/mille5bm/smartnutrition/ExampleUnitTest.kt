package edu.uc.mille5bm.smartnutrition

import edu.uc.mille5bm.smartnutrition.dto.Exercise
import edu.uc.mille5bm.smartnutrition.dto.Food
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    //lack of unit tests in TDD
    @Test
    fun requiredDTOExist(){
        var exercise = Exercise()
        var food = Food()
    }
}