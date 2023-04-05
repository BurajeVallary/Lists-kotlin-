fun main() {
    //opt1 no1
    val get=listOf("mary","jane","go","come","joy")
    val hope=evenIndices(get)  //indices is a range eg 0..3
    println(hope)
    people()
//option 2 no1
    val x =evens(listOf("Ada","Liz","Kamau","joy"))
    println(x)
//no2 opt1
    val heights = listOf(10.2, 7.6, 5.3, 4.9, 16.0)
    val (average, total) = height(heights)
    println(" average height= $average meters")
    println("Total height= $total meters")

    people()

    val gety = listOf(
        Car("KZZ286F", 239),
        Car("KBC450D", 890),
        Car("KDD678G", 1400),
    )
    val averages = returnAverage(gety)
    println("the average mileage = $averages")

    val peps=peopleAdd()
    println(peps)
    println(gety)

}

//1 Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc

fun evenIndices(strings: List<String>): List<String> {
    val result = mutableListOf<String>()
    for (v in strings.indices step 2) {
        result.add(strings[v])
    }
   return result
}
//option 2
fun evens(words:List<String>):List<String>{
    return words.filterIndexed{idx,_-> idx%2==0}
}


//2 Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

fun height(heights: List<Double>): Pair<Double, Double> {
    val total = heights.sum()
    val average=heights.average()
    return Pair(average, total)
}
//opt 2 no2 correction

//use data class in order to use the inbuilt functions and access them once
 data class human(var sumheight:Double , var avgheight:Double)
fun heights(height:List<Double> ):human{
    var sumheight=height.sum()
    var avgheight=height.average()

    return human(sumheight,avgheight)

}





//3 Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class Person(var name:String,var age:Int,var height:Double,var weight:Double)


fun people(){
    val per1=Person("Valary",28,6.6,70.3)
    val per2=Person("Val",8,5.6,60.3)
    val per3=Person("lary",10,9.6,70.8)

    val people= listOf(per1,per2,per3)
//   println(people)

    val come=people.sortedByDescending { person -> person.age  }
    println(come)
}





//4 Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

fun peopleAdd():List<Person>{
    val per4=Person("Hope",34,34.9,45.9)
    val per5=Person("Mercy",3,84.9,5.9)
    return mutableListOf(per4,per5)

}


// 5 Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.data class Car(val registration: String, val mileage: Double)

data class Car(var registration:String,var mileage:Int)

    fun returnAverage (averageMileage:List<Car>): Double{
        var gety = 0.0
        for (car in averageMileage){
            gety += car.mileage
        }
        return gety/ averageMileage.size
    }


