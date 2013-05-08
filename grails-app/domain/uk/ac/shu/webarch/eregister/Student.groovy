package uk.shu.webarch.eregister

class Student {

	String fullStudentName
	String studentNumber
	String notes

	Set courses

	Set classAtts

//Demonstrates why the hasMany structure is a list...
//the hasMany metadata needs to specify several different sets

   static hasMany = [
	courses: Enrollment,
	classAtts: RegisterEntry
]

  static mappedBy = [
	courses:'student',
	classAtts:'student'

//****TO DO
// make the notes field use the "text" type 
//make the name column "student_notes" in the database


    static constraints = {
	fullStudentName(nullable:false, blank:false,maxsize:256);
	studentNumber(nullable:false, blank:false,maxsize:256);
    }
}

