package com.example.teacher

class ClassData{
var id: String = ""
var classNumber: String = ""
var timesTamp: Long? = 0


constructor()
constructor(id: String, classNumber: String, timesTamp: Long?) {
    this.id = id
    this.classNumber = classNumber
    this.timesTamp = timesTamp

}
}
