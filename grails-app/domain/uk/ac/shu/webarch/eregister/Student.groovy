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


    static constraints = {
	fullStudentName(nullable:false, blank:false,maxsize:256);
	studentNumber(nullable:false, blank:false,maxsize:256);
    }


 static mapping = {
	notes column: 'notes', type:'text'
	fullStudentName: 'student_notes'
	}

}

