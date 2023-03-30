fun main() {
    val get=listOf("mary","jane","go","come","joy")
    val hope=evenIndices(get)
    println(hope)

    val heights = listOf(10.2, 7.6, 5.3, 4.9, 16.0)
    val (average, total) = height(heights)
    println("Average height: $average meters")
    println("Total height: $total meters")

    people()

    val averageMileage = totalMileage / cars.size
    println("The average mileage of all cars is: $averageMileage")
    averageMileage






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
//2 Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

fun height(heights: List<Double>): Pair<Double, Double> {
    val total = heights.sum()
    val average=heights.average()
    return Pair(average, total)
}

//3 Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class Person(var name:String,var age:Int,var height:Double,var weight:Double)


fun people(){
    val per1=Person("Valary",28,6.6,70.3)
    val per2=Person("Val",8,5.6,60.3)
    val per3=Person("lary",8,9.6,70.8)

    val people= listOf(per1,per2,per3)
//    println(people)

    val come=people.sortedByDescending { person -> person.age  }
    println(come)
}

//4 Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.


// 5 Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car (var registration:String,var mileage:Int)

//fun carList(cars: List<Car>): Double {
//    var totalMileage = 0.0
//    for (car in cars) {
//        totalMileage += car.mileage
//    }
//    return totalMileage / cars.size

fun averageMileage(cars: List<Car>) {
    var totalMileage = 0.0
    for (car in cars) {
        totalMileage += car.mileage
    }
    val averageMileage = totalMileage / cars.size
    println("The average mileage of all cars is: $averageMileage")
}
