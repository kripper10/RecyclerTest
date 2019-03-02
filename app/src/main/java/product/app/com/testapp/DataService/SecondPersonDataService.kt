package product.app.com.testapp.DataService

import product.app.com.testapp.Model.SecondPersonData


/**
 * Created by Chris on 14/02/2019.
 */
object SecondPersonDataService {

    val secondPersons = listOf(
            listOf(
                    SecondPersonData("John", "Smith", "11/07/1967", "Male", "Leeds"),
                    SecondPersonData("John", "Smith", "22/10/1947", "Male", "Nottingham"),
                    SecondPersonData("Jon", "Smith", "13/02/1989", "Male", "Bradford"),
                    SecondPersonData("John", "Smyth", "27/11/1991", "Male", "Harrow")
            ),
            listOf(
                    SecondPersonData("Frank", "Spencer", "12/12/1981", "Male", "Brigton"),
                    SecondPersonData("Frank", "Spencer", "07/11/1981", "Male", "Exeter"),
                    SecondPersonData("Mike", "Spencer", "06/08/1997", "Male", "Essex")

            )
    )

}