package Lesson27and28

import java.text.SimpleDateFormat
import java.util.Date

class PersonKotlin constructor(val name: String, val age: Int) {
    private var birth: Date = Date()
        get() = SimpleDateFormat("yyyy.mm.dd")
            .parse(SimpleDateFormat("yyyy.mm.dd")
                .format(field))
        set(value){
            field = value
        }


}