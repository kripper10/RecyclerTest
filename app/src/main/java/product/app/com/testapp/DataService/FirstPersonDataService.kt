package product.app.com.testapp.DataService


import product.app.com.testapp.Model.FirstPersonData




/**
 * Created by Chris on 14/02/2019.
 */
object FirstPersonDataService {

    val firstPersons = listOf(

            listOf(

                    FirstPersonData("John Smith", "19/07/1967", "10 High Street, Leeds"),
                    FirstPersonData("Harry Smith", "21/01/1989", "24 Lowe Ave, Notts")

            ),
            listOf(

                    FirstPersonData("Frank Spencer", "19/07/1967", "10 High Street, Leeds"),
                    FirstPersonData("Frankie Spencer", "21/01/1993", "86 Hunger Street, Fulham"),
                    FirstPersonData("Mike Spencer", "11/04/1986", "13 Tarry Lane, Wolves"),
                    FirstPersonData("Chris Spence", "02/10/1974", "64 Zoo Lane, London")

            )

    )


}